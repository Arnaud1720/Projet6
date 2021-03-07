package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Utilisateur;
import com.arnaud.envTestspringData.service.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;


@Controller
public class ConnectControlleur {

    @Autowired
    UtilisateurServices utilisateurServices;


    /**
     *
     * @param model
     * @param session
     * @return
     */
    @GetMapping("/connexion")
    public String showPage(Model model, HttpSession session) {
        model.addAttribute("utilisateur", new Utilisateur());
        session.removeAttribute("pseudo");
        return "connexion";
    }

    /**
     *
     * @param pseudo
     * @param password
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/connexion")
    public String connect(@RequestParam("pseudo") String pseudo,
                          @RequestParam("password") String password,
                          Model model, HttpSession session) {
        model.addAttribute("utilisateur", new Utilisateur());
        session.setAttribute("pseudo", pseudo);
        if (utilisateurServices.getConnectUser(pseudo, password) == null) {

            return "/connectError";
        } else {

            return "/connectOk";
        }

    }

    /**
     *
     * @param model
     * @param session
     * @return
     */
    @GetMapping("/admin/administrateur")
    public String connectAdmin(Model model, HttpSession session) {
        model.addAttribute("administrateur", new Utilisateur());
        session.removeAttribute("pseudo");
        return "/admin/administrateur";
    }

    /**
     *
     * @param pseudo
     * @param password
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/admin/administrateur")
    public String connectAdmin(@RequestParam("pseudo") String pseudo,
                               @RequestParam("password") String password,
                               Model model, HttpSession session){
        model.addAttribute("administrateur", new Utilisateur());
        session.setAttribute("pseudo", pseudo);
        if (utilisateurServices.getConnectUser(pseudo, password) != utilisateurServices.getConnectUser("adm_admin",
                "$2y$10$GB59ZaxuDj5jW.3RBh33DuwcbzboscvxyiuYbCdiGXd5AnHMvxcju")) {

            return "/connectError";
        } else {

            return "connectok";
        }
    }
}
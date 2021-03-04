package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Utilisateur;
import com.arnaud.envTestspringData.service.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InscriptionUtilisateurControlleur {
    @Autowired
    UtilisateurServices utilisateurServices;


    public InscriptionUtilisateurControlleur(UtilisateurServices utilisateurServices) {
        this.utilisateurServices = utilisateurServices;
    }

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/inscription")
    public String displayInscription(Model model) {
        model.addAttribute("utilisateurs", new Utilisateur());

        return "/inscription";
    }

    /**
     *
     * @param utilisateur
     * @return
     */
    @PostMapping("/inscription")
    public String createUser(@ModelAttribute("utilisateur")Utilisateur utilisateur) {
           utilisateurServices.createUser(utilisateur);
        return "connexion";
    }

}

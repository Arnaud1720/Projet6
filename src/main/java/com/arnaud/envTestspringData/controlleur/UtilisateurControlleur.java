package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Utilisateur;
import com.arnaud.envTestspringData.service.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UtilisateurControlleur {
    @Autowired
    UtilisateurServices utilisateurServices;

    @GetMapping("/account/devenirMembre")
    public String becomeaMember() {
        return "/account/devenirMembre";
    }

    @GetMapping("/account/devenirMembre/yes")

    public String becomeAOffcialMemberYes(HttpSession session) {

        String pseudo = (String) session.getAttribute("pseudo");
        Utilisateur utilisateurConnecte = utilisateurServices.findByPseudo(pseudo);
        utilisateurConnecte.setMembreAsso(true);
        utilisateurServices.save(utilisateurConnecte);
        return "/account/devenirMembre";
    }

    @GetMapping("/account/devenirMembre/no")
    public String becomeAOffcialMemberNo(HttpSession session) {
        {
            String pseudo = (String) session.getAttribute("pseudo");
            Utilisateur utilisateurConnecte = utilisateurServices.findByPseudo(pseudo);
            utilisateurConnecte.setMembreAsso(false);
            utilisateurServices.save(utilisateurConnecte);
            return "/account/devenirMembre";

        }
    }
}
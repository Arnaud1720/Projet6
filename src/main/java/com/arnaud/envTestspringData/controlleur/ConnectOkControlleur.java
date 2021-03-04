package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Utilisateur;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

public class ConnectOkControlleur {
    /**
     *
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/connexon/profil")
    public String getConnectOk(HttpSession session, Model model){
        model.addAttribute("utilisateur",new Utilisateur());
        String pseudo = (String) session.getAttribute("pseudo");

        return "/connectok";

    }
}

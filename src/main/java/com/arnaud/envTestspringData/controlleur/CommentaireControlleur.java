package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Commentaire;
import com.arnaud.envTestspringData.beans.Site;
import com.arnaud.envTestspringData.beans.Utilisateur;
import com.arnaud.envTestspringData.service.CommentaireService;
import com.arnaud.envTestspringData.service.SiteService;
import com.arnaud.envTestspringData.service.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

@Controller
public class CommentaireControlleur {
    @Autowired
    CommentaireService commentaireService;
    @Autowired
    SiteService siteService;
    @Autowired
    UtilisateurServices utilisateurServices;

    /**
     *
     * @param model
     * @param siteId
     * @return
     */
    @GetMapping("/sites/{siteId}/commentaire/")
    public String displayFromComment(Model model, @PathVariable int siteId) {
        System.out.println("dans le Get comment ! ");
        model.addAttribute("commentaire", new Commentaire());

        return "commentaire";
    }

    /**
     *
     * @param commentaire
     * @param siteId
     * @param session
     * @return
     */
    @PostMapping("/sites/{siteId}/commentaire/")
    public String addComment(@ModelAttribute("newCommentaire") Commentaire commentaire,
                             @PathVariable int siteId, HttpSession session) {
        Site site = siteService.findById(siteId);
        commentaire.setSite(site);
        String pseudo = (String) session.getAttribute("pseudo");
        Utilisateur utilisateurConnecte = utilisateurServices.findByPseudo(pseudo);
        commentaire.setUtilisateur(utilisateurConnecte);
        commentaireService.create(commentaire);
        return "commentaire";
    }



}


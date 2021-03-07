package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.*;
import com.arnaud.envTestspringData.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

import java.util.List;

@Controller
public class SiteControlleur {

    @Autowired
    SiteService siteService;
    @Autowired
    UtilisateurServices utilisateurServices;
    @Autowired
    CommentaireService commentaireService;
    @Autowired
    SecteurService secteurService;
    @Autowired
    VoieService voieService;
    @Autowired
    LongueurService longueurService;

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/addSite")
    public String displayFormAddSite(Model model) {
        model.addAttribute("site", new Site());

        return "addSite";
    }

    /**
     *
     * @param site
     * @param session
     * @return
     */
    @PostMapping("/addSite")
    public String addSite(@ModelAttribute("site") Site site, HttpSession session) {
        String pseudo = (String) session.getAttribute("pseudo");
        Utilisateur utilisateurConnecte = utilisateurServices.findByPseudo(pseudo);
        site.setUtilisateur(utilisateurConnecte);

        siteService.addSite(site);
        return "/site";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/site/{id}")
    public String displayDetailOfSite(@PathVariable int id, Model model) {
        Site sites = siteService.findById(id);
        model.addAttribute("secteurs", sites.getSecteurList());
        model.addAttribute("listCommentaire", new Commentaire());
        model.addAttribute("site", sites);

        return "site-detail";
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/site/{id}/alldelete/deleteCommentaire")
    public String deleteCommentaire(@PathVariable int id) {
        commentaireService.delete(id);
        return "alldelete/deleteCommentaire";
    }
    @PostMapping("/site/{id}/addcommentaire")
    public  String updateCommentaire(@PathVariable int id){
      Commentaire commentaire =  commentaireService.findById(id);
        commentaireService.create(commentaire);
        return "/site-detail";
    }


    /**
     *
     * @param model
     * @param session
     * @param utilisateur
     * @return
     */
    @GetMapping("/site")
    public String displaySite(Model model, HttpSession session, @ModelAttribute("utilisateur") Utilisateur utilisateur) {

        if (session.getAttribute("pseudo") != null) {
            List<Site> listSite = siteService.findAll();
            model.addAttribute("listSite", listSite);
            return "site";
        } else
            model.addAttribute("UserLog", "vous devez être connecté pour consulté cette page");
        return "connexion";
    }

    /**
     *
     * @param model
     * @param officiel
     * @param id
     * @return
     */
    @GetMapping("/site/{id}/tag")
    public String officialSite(Model model, @RequestParam("officiel") boolean officiel, @PathVariable int id) {
        Site sites = siteService.findById(id);
        if (!officiel) {

            List<Site> listSite = siteService.findAll();
            model.addAttribute("listSite", listSite);
            model.addAttribute("site", sites);
            return "/site";
        } else {
            List<Site> listSite = siteService.findAll();
            model.addAttribute("listSite", listSite);
            model.addAttribute("officialSite", "ce site a était tagger comme officiel");
            sites.setOfficiel(true);
            siteService.addSite(sites);
            return "/site";
        }

    }

    /**
     *
     * @param param1
     * @param model
     * @return
     */
    @PostMapping("/site")
    public String find(String param1, Model model) {
        List<Site> listSite = siteService.findByNomStartingWith(param1);
        model.addAttribute("listSite", listSite);
        return "/site";
    }
}

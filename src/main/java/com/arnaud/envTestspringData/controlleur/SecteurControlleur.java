package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Secteur;
import com.arnaud.envTestspringData.beans.Site;
import com.arnaud.envTestspringData.service.SecteurService;
import com.arnaud.envTestspringData.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SecteurControlleur {

    @Autowired
    SecteurService secteurService;

    @Autowired
    SiteService siteService;
    public SecteurControlleur(SecteurService secteurService) {
        this.secteurService = secteurService;
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/secteur/{id}")
    public String displaySecteur(@PathVariable int id, Model model) {
        Secteur secteurs=  secteurService.findById(id);
        model.addAttribute("voie",secteurs.getVoieList());
        model.addAttribute("secteur",secteurs);
        secteurService.getListSecteur();
        return "secteur-detail";
    }

    /**
     *
     * @param model
     * @param idsite
     * @return
     */
    @GetMapping("/site/{idsite}/add-secteur/")
    public String formAddSecteur(Model model, @PathVariable int idsite){
        model.addAttribute("secteur",new Secteur());

        return "/add-secteur";
    }

    /**
     *
     * @param secteur
     * @param idsite
     * @param model
     * @return
     */
    @PostMapping("/site/{idsite}/add-secteur/")
    public String addNewSecteur(@ModelAttribute("secteur") Secteur secteur, @PathVariable int idsite,Model model) {
        Site sites = siteService.findById(idsite);

        secteur.setSite(sites);
        secteurService.createSecteur(secteur);
        List<Site> listSite = siteService.findAll();
        model.addAttribute("listSite", listSite);
        return "site";
    }



}

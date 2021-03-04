package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Secteur;
import com.arnaud.envTestspringData.beans.Site;
import com.arnaud.envTestspringData.beans.Voie;
import com.arnaud.envTestspringData.service.SecteurService;
import com.arnaud.envTestspringData.service.SiteService;
import com.arnaud.envTestspringData.service.VoieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class VoieControlleur {
    @Autowired
    VoieService voieService;
    @Autowired
    SecteurService secteurService;
    @Autowired
    SiteService siteService;

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/voie-detail/{id}")
    public String displaySite(@PathVariable int id, Model model) {
        Voie voies=  voieService.findById(id);
        model.addAttribute("voieParam",voies);
        model.addAttribute("listLongeur", voies.getLongeurs());
        voieService.getListVoie();
        return "voie-detail";
    }

    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/add-voie")
    public String addNewWay(Model model){
        model.addAttribute("voie",new Voie());
        model.addAttribute("secteur",new Secteur());
        return "/add-voie";
    }

    /**
     *
     * @param model
     * @param idsecteur
     * @return
     */
    @GetMapping("/secteur/{idsecteur}/add-voie/")
    public String formAddSecteur(Model model, @PathVariable int idsecteur){
        model.addAttribute("voie",new Voie());

        return "/add-voie";
    }

    /**
     *
     * @param voie
     * @param idsecteur
     * @param modelMap
     * @return
     */
    @PostMapping("/secteur/{idsecteur}/add-voie/")
    public String addNewVoie(@ModelAttribute("voie") Voie voie, @PathVariable int idsecteur, ModelMap modelMap) {

        Secteur secteur = secteurService.findById(idsecteur);
        voie.setSecteur(secteur);
        Voie createVoie= voieService.create(voie);
        modelMap.addAttribute("voie",createVoie);
        List<Site> listSite = siteService.findAll();
        modelMap.addAttribute("listSite", listSite);

        return "site";
    }

}

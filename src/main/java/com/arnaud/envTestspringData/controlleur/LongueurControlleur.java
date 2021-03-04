package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Longueur;
import com.arnaud.envTestspringData.beans.Site;
import com.arnaud.envTestspringData.beans.Voie;
import com.arnaud.envTestspringData.service.LongueurService;
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
public class LongueurControlleur {

    @Autowired
    LongueurService longueurService;
    @Autowired
    VoieService voieService;
    @Autowired
    SiteService siteService;

    /**+
     *
     * @param model
     * @param idvoie
     * @return
     */
    @GetMapping("/longueur/{idvoie}/add-longueur")
    public String addNewLongeur(Model model, @PathVariable int idvoie){
        model.addAttribute("longueur",new Longueur());
        return "add-longueur";
    }

    /**
     *
     * @param longueur
     * @param idvoie
     * @param modelMap
     * @return
     */
    @PostMapping("/longueur/{idvoie}/add-longueur")
    public String addNewLongeur(@ModelAttribute("longueur")Longueur longueur, @PathVariable int idvoie, ModelMap modelMap){
        Voie voie = voieService.findById(idvoie);
        longueur.setVoie(voie);
        longueurService.create(longueur);
        List<Site> listSite = siteService.findAll();
        modelMap.addAttribute("listSite", listSite);
        return "site";
    }

}

package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Booking;
import com.arnaud.envTestspringData.beans.Topo;
import com.arnaud.envTestspringData.beans.Utilisateur;
import com.arnaud.envTestspringData.service.BookingServices;
import com.arnaud.envTestspringData.service.TopoService;
import com.arnaud.envTestspringData.service.UtilisateurServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TopoControlleur {
    @Autowired
    private TopoService topoService;
    @Autowired
    UtilisateurServices utilisateurServices;
    @Autowired
    BookingServices bookingServices;

    /**
     *
     * @param model
     * @param utilisateur
     * @param session
     * @return
     */
    @GetMapping("/topo")
    public String displ1ayPage(Model model, @ModelAttribute("utilisateur") Utilisateur utilisateur, HttpSession session) {
        if (session.getAttribute("pseudo") != null) {
            List<Topo> topoList = topoService.findAll();
            model.addAttribute("topoList", topoList);
            return "listTopos";
        } else
            model.addAttribute("UserLog", "vous devez être connecté pour consulté cette page");
        return "connexion";

    }

    /**
     *
     * @param model
     * @param available
     * @param id
     * @return
     */
    @GetMapping("/topo/{id}/disponible")
    public String topoIsAvaible(Model model, @RequestParam(value = "available") boolean available, @PathVariable int id) {
        Topo topoServiceById = topoService.findById(id);
        Topo topo1 = topoService.findById(topoServiceById.getId());

        if (available) {
            topo1.setAvailable(true);
            model.addAttribute("available", true);
            topoService.create(topo1);
            List<Topo> topoList = topoService.findAll();
            model.addAttribute("topoList", topoList);

            return "listTopos";
        } else {
            topo1.setAvailable(false);
            model.addAttribute("available", false);
            topoService.create(topo1);
            List<Topo> topoList = topoService.findAll();

            model.addAttribute("topoList", topoList);
            return "/listTopos";
        }
    }

    /**
     *
     * @param topo
     * @param model
     * @return
     */
    @GetMapping("/add-topo")
    public String displayFromAddTopo(@ModelAttribute("topo") Topo topo, Model model) {
        model.addAttribute("topo", new Topo());
        return "/add-topo";

    }

    /**
     *
     * @param topo
     * @param session
     * @return
     */
    @PostMapping("/add-topo")
    public String addTopo(@ModelAttribute("topo") Topo topo, HttpSession session) {
        String pseudo = (String) session.getAttribute("pseudo");
        Utilisateur utilisateurConnecte = utilisateurServices.findByPseudo(pseudo);
        topo.setUtilisateur(utilisateurConnecte);
        topoService.create(topo);
        return "/add-topo";

    }

    /**
     *
     * @param session
     * @param model
     * @return
     */
    @GetMapping("/account/mestopos")
    public String mesTopo(HttpSession session, Model model) {
        String pseudo = (String) session.getAttribute("pseudo");
        model.addAttribute("topoList", topoService.findAllByPseudo(pseudo));
        topoService.findAllByPseudo(pseudo);
        model.addAttribute("booking", bookingServices.findAll());

        return "/account/mestopo";
    }

    /**
     *
     * @param idreservation
     * @param accepted
     * @param model
     * @param session
     * @return
     */
    @GetMapping("/account/mestopo/{idreservation}")
    public String BookingAccepted(
            @PathVariable int idreservation, @RequestParam(value = "accepted") boolean accepted,
            Model model, HttpSession session) {
        String pseudo = (String) session.getAttribute("pseudo");
        if (!accepted) {//false
            bookingServices.deleteBooking(idreservation);
            model.addAttribute("topoList", topoService.findAllByPseudo(pseudo));
            model.addAttribute("booking", bookingServices.findAll());
            topoService.findAllByPseudo(pseudo);
            return "/account/mestopo";
        } else {//true
            Booking booking = bookingServices.findById(idreservation);
            Topo topo1 = booking.getTopo();
            topo1.setAvailable(true);
            topoService.create(topo1);
            List<Topo> topoList = topoService.findAllByAvailable();
            model.addAttribute("topoList", topoList);
            bookingServices.deleteBooking(idreservation);
            return "/listTopos";
        }


    }

}
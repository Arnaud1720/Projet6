package com.arnaud.envTestspringData.controlleur;

import com.arnaud.envTestspringData.beans.Booking;
import com.arnaud.envTestspringData.beans.Topo;
import com.arnaud.envTestspringData.beans.Utilisateur;
import com.arnaud.envTestspringData.service.BookingServices;
import com.arnaud.envTestspringData.service.TopoService;
import com.arnaud.envTestspringData.service.UtilisateurServices;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class BookingControlleur {
    @Autowired
    BookingServices bookingServices;
    @Autowired
    TopoService topoService;
    @Autowired
    UtilisateurServices utilisateurServices;


    /**
     *
     * @param model
     * @param idtopo
     * @param session
     * @return /book/booking
     */
    @GetMapping("/book/{idtopo}/booking")
    public String displayPage(Model model, @PathVariable int idtopo, HttpSession session) {

        model.addAttribute("booking",new Booking());
        model.addAttribute("topo",topoService.findById(idtopo));
        String pseudo = (String) session.getAttribute("pseudo");
        Utilisateur utilisateurConnecte = utilisateurServices.findByPseudo(pseudo);
        System.err.println(utilisateurConnecte);

        return "/book/booking";
    }

    /**
     *
     * @param booking
     * @param session
     * @param idtopo
     * @return /book/booking
     */
    @PostMapping("/book/{idtopo}/booking")
    public String addBooking(@ModelAttribute("booking") Booking booking,
                             HttpSession session,
                             @PathVariable int idtopo) {
        Topo topo = topoService.findById(idtopo);
        String pseudo = (String) session.getAttribute("pseudo");
        Utilisateur utilisateurConnecte = utilisateurServices.findByPseudo(pseudo);

        booking.setUtilisateur(utilisateurConnecte);
        booking.setTopo(topo);
        bookingServices.createBooking(booking);


        return "/book/booking";
    }



}

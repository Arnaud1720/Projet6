package com.arnaud.envTestspringData.beans;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reservation")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "date_debut")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateDebut;
    @Column(name = "date_fin")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date dateFin;
    @Column(name = "message_reservation")
    private String messageReservation;
    @Column(name = "accepte")
    private boolean accepte;
    @ManyToOne @JoinColumn(name = "topo_id")
    private Topo topo;
    @ManyToOne @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    public Booking() {
    }

    public Booking(Integer id, Date dateDebut, Date dateFin,
                   String messageReservation, boolean accepte, Topo topo) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.messageReservation = messageReservation;
        this.accepte = accepte;
        this.topo = topo;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getId()  {
        return id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getMessageReservation() {
        return messageReservation;
    }

    public void setMessageReservation(String messageReservation) {
        this.messageReservation = messageReservation;
    }

    public boolean isAccepte() {
        return accepte;
    }

    public void setAccepte(boolean accepte) {
        this.accepte = accepte;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}

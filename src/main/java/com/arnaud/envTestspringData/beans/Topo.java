package com.arnaud.envTestspringData.beans;

import com.sun.istack.Nullable;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity(name = "topo")
public class Topo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @Column(name = "date_creation")
    private Date dateCreation;
    @OneToMany(mappedBy = "topo")
    private List<Booking> bookingList;
    @Column(name = "available")
    @Nullable
    private  boolean available;

    public Topo() {

    }

    public Topo(int id, Utilisateur utilisateur,String nom,
                String description, Date dateCreation) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.nom = nom;
        this.description = description;
        this.dateCreation=dateCreation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}

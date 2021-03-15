package com.arnaud.envTestspringData.beans;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "pseudo")
    private String pseudo;
    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "password")
    private String password;
    @Column(name = "date_naissance")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private  Date dateNaissance;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "membre_asso")
    private boolean membreAsso ;
    @OneToMany(mappedBy = "utilisateur")
    private Set<Commentaire> commentaireHashSet= new HashSet<>();
    @OneToMany(mappedBy = "utilisateur")
    private List<Site> siteList;
    @OneToMany(mappedBy = "utilisateur")
    private List<Booking> bookingList;
    public Utilisateur() {
    }

    public Utilisateur(int id, String pseudo, String email, String password, Date dateNaissance, String nom, String prenom, boolean membreAsso) {
        this.id = id;
        this.pseudo = pseudo;
        this.email = email;
        this.password = password;
        this.dateNaissance = dateNaissance;
        this.nom = nom;
        this.prenom = prenom;
        this.membreAsso = membreAsso;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String setCivilite(String civilite) {
        return civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean isMembreAsso() {
        return membreAsso;
    }

    public void setMembreAsso(boolean membreAsso) {
        this.membreAsso = membreAsso;
    }


    public Set<Commentaire> getCommentaireHashSet() {
        return commentaireHashSet;
    }

    public void setCommentaireHashSet(Set<Commentaire> commentaireHashSet) {
        this.commentaireHashSet = commentaireHashSet;
    }


    public List<Site> getSiteList() {
        return siteList;
    }

    public void setSiteList(List<Site> siteList) {
        this.siteList = siteList;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", membreAsso=" + membreAsso +
                '}';
    }
}



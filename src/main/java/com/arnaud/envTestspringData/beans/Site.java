package com.arnaud.envTestspringData.beans;


import com.sun.istack.Nullable;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "site")
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "nom")
    private String nom;
    @Nullable @Column(name = "officiel")
    private   boolean officiel;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "descriptionspot")
    private String descriptionSpot;
    @OneToMany(mappedBy = "site", fetch = FetchType.EAGER)
    private Set<Secteur>  secteurList = new HashSet<>();
    @OneToMany(mappedBy = "site")
    private Set<Commentaire> commentaireSetList= new HashSet<>();
    @ManyToOne
    private Utilisateur utilisateur;
    public Site() {
    }


    public Site(int id, String nom,
                boolean officiel, String adresse,
                String descriptionSpot) {
        this.id = id;
        this.nom = nom;
        this.officiel = officiel;
        this.adresse = adresse;
        this.descriptionSpot = descriptionSpot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isOfficiel() {
        return officiel;
    }

    public void setOfficiel(boolean officiel) {
        this.officiel = officiel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescriptionSpot() {
        return descriptionSpot;
    }

    public void setDescriptionSpot(String descriptionSpot) {
        this.descriptionSpot = descriptionSpot;
    }

    public Set<Secteur> getSecteurList() {
        return secteurList;
    }

    public void setSecteurList(Set<Secteur> secteurList) {
        this.secteurList = secteurList;
    }

    public Set<Commentaire> getCommentaireSetList() {
        return commentaireSetList;
    }

    public void setCommentaireSetList(Set<Commentaire> commentaireSetList) {
        this.commentaireSetList = commentaireSetList;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }


}

package com.arnaud.envTestspringData.beans;

import javax.persistence.*;
import java.util.List;

@Entity(name = "voie")
public class Voie {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "id_secteur")
    @ManyToOne(fetch = FetchType.EAGER)
    private Secteur secteur;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "voie")
    private List<Longueur> longeurs;


    public Voie() {
    }

    public Voie(int id, String nom, String description, Secteur secteur, List<Longueur> longeurs) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.secteur = secteur;
        this.longeurs = longeurs;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public List<Longueur> getLongeurs() {
        return longeurs;
    }

    public void setLongeurs(List<Longueur> longeurs) {
        this.longeurs = longeurs;
    }
}
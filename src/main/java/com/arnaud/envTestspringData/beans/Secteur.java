package com.arnaud.envTestspringData.beans;


import javax.persistence.*;
import java.util.List;

@Entity(name = "secteurs")
public class Secteur {
    @Id @Column(name = "id") @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne  @JoinColumn(name = "id_spot")
    private  Site site;
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @OneToMany (mappedBy = "secteur",fetch = FetchType.EAGER)
    private List<Voie> voieList;


    public Secteur() {
    }

    public Secteur(int id, Site site, String nom, String description, Voie voie) {
        this.id = id;
        this.site = site;
        this.nom = nom;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
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

    public List<Voie> getVoieList() {
        return voieList;
    }

    public void setVoieList(List<Voie> voieList) {
        this.voieList = voieList;
    }

}

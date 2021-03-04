package com.arnaud.envTestspringData.beans;

import javax.persistence.*;
@Entity(name = "longueur")
public class Longueur {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "difficulte")
    private String difficulte;
    @Column(name = "longeur")
    private int longeur;
    @Column(name = "nbr_attache")
    private int nbrAttache;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_voie")
    private Voie voie;
    public Longueur() {
    }

    public Longueur(int id, String difficulte, int longeur, int nbrAttache, Voie voie) {
        this.id = id;
        this.difficulte = difficulte;
        this.longeur = longeur;
        this.nbrAttache = nbrAttache;
        this.voie = voie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public void setDifficulte(String difficulte) {
        this.difficulte = difficulte;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getNbrAttache() {
        return nbrAttache;
    }

    public void setNbrAttache(int nbrAttache) {
        this.nbrAttache = nbrAttache;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }
}

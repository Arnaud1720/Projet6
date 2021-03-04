package com.arnaud.envTestspringData.beans;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Commentaire")
public class Commentaire {
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "commentaire")
    private String commentaire;
    @Column(name = "datecommentaire")
    private Date dateCommentaire;
    @JoinColumn(name = "id_utilisateur")
    @ManyToOne
        private Utilisateur utilisateur;
    @ManyToOne
    @JoinColumn(name = "id_site")
    private Site site;

    public Commentaire(int id, String commentaire, Date dateCommentaire, Utilisateur utilisateur) {
        this.id = id;
        this.commentaire = commentaire;
        this.dateCommentaire = dateCommentaire;
        this.utilisateur = utilisateur;
    }

    public Commentaire() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(Date dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur idUtilisateur) {
        this.utilisateur = idUtilisateur;
    }
}

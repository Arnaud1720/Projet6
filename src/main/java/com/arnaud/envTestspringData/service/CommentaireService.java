package com.arnaud.envTestspringData.service;

import com.arnaud.envTestspringData.beans.Commentaire;
import com.arnaud.envTestspringData.repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CommentaireService {
    @Autowired
    CommentaireRepository commentaireRepository;

    public CommentaireService(CommentaireRepository commentaireRepository) {
        this.commentaireRepository = commentaireRepository;
    }
    @Transactional
    public Commentaire create(Commentaire commentaire){
        return commentaireRepository.saveAndFlush(commentaire);
    }

    public List<Commentaire> findAll(){
        return commentaireRepository.findAll();
    }

    public void delete(int id){
        commentaireRepository.deleteById(id);
    }

    public Commentaire findById(int id){
        return commentaireRepository.findById(id).orElse(null);
    }
}

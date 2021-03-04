package com.arnaud.envTestspringData.service;

import com.arnaud.envTestspringData.beans.Secteur;
import com.arnaud.envTestspringData.repository.SecteurRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class SecteurService {
    @Autowired
    SecteurRepository secteurRepository;

    public SecteurService(SecteurRepository secteurRepository) {
        this.secteurRepository = secteurRepository;
    }

    public List<Secteur> getListSecteur() {
         return secteurRepository.findAll();
    }

    public Secteur findById(int id){
       return secteurRepository.findById(id).orElse(null);
    }

    @Transactional
    public Secteur createSecteur(Secteur secteur){
        return secteurRepository.save(secteur);
    }

    public void deleteById(int id){
        secteurRepository.deleteById(id);
    }

    public List<Secteur> findAll(){
        return secteurRepository.findAll();
    }
}

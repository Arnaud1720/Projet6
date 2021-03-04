package com.arnaud.envTestspringData.service;

import com.arnaud.envTestspringData.beans.Longueur;
import com.arnaud.envTestspringData.repository.LongueurRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LongueurService {

    @Autowired
    LongueurRepository longueurRepository;

    public LongueurService(LongueurRepository longueurRepository) {
        this.longueurRepository = longueurRepository;
    }

    public List<Longueur> getListLongeur() {
      return longueurRepository.findAll();
    }


    public Longueur create (Longueur longueur){
        return longueurRepository.saveAndFlush(longueur);
    }


    public Longueur findById(int idl) {
      return   longueurRepository.findById(idl).orElse(null);
    }

    public void deleteById(int idl) {
        longueurRepository.deleteById(idl);
    }

    public List<Longueur> findAll(){
        return longueurRepository.findAll();
    }
}

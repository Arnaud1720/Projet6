package com.arnaud.envTestspringData.service;

import com.arnaud.envTestspringData.beans.Voie;
import com.arnaud.envTestspringData.repository.VoieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoieService {
    @Autowired
    VoieRepository voieRepository;

    public VoieService(VoieRepository voieRepository) {
        this.voieRepository = voieRepository;
    }

    public List<Voie> getListVoie() {
       return voieRepository.findAll();
    }

    public Voie findById(int id) {
        return voieRepository.findById(id).orElse(null);
    }

    public Voie create(Voie voie) {
        return voieRepository.saveAndFlush(voie);
    }

    public void deleteById(int idv) {
        voieRepository.deleteById(idv);
    }

    public List<Voie> findAll(){
        return voieRepository.findAll();
    }
}

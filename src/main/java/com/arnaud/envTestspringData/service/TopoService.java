package com.arnaud.envTestspringData.service;

import com.arnaud.envTestspringData.beans.Topo;
import com.arnaud.envTestspringData.repository.TopoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TopoService {
    @Autowired
    TopoRepository topoRepository;
    @Autowired
    UtilisateurServices utilisateurServices;
    @Autowired
    BookingServices bookingServices;
    @Autowired
    TopoService topoService;
    public TopoService(TopoRepository topoRepository) {
        this.topoRepository = topoRepository;
    }

    public List<Topo> findAll() {
        return topoRepository.findAll();
    }

    public List<Topo> findAllByPseudo(String pseudo) {
        return topoRepository.findAllByPseudo(pseudo);
    }
    @Transactional
    public Topo create(Topo topo){ return topoRepository.saveAndFlush(topo);
    }

    public Topo findById(int id){
        return topoRepository.findById(id).orElse(null);
    }


    public void deleteById(int id){
         topoRepository.deleteById(id);
    }

    public List<Topo> findAllByAvailable(){
        return topoRepository.findAllByAvailable();
    }

}

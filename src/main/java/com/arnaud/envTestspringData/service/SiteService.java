package com.arnaud.envTestspringData.service;

import com.arnaud.envTestspringData.beans.Site;
import com.arnaud.envTestspringData.repository.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service

public class SiteService {
    @Autowired
    SiteRepository siteRepository;

    public SiteService(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    public List<Site> findAll(){
        return siteRepository.findAll();
    }


    public Site addSite(Site site){
        return siteRepository.saveAndFlush(site);
    }

    public Site findById(int id){
       return siteRepository.findById(id).orElse(null);
    }

    public List<Site> findByNomStartingWith(String param1){
        System.err.println(param1);
        return siteRepository.findByNom(param1.toLowerCase());

    }
    public void deleteById(int id){
        siteRepository.deleteById(id);
    }

}

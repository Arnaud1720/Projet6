package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface SecteurRepository extends JpaRepository<Secteur,Integer> {

    
}

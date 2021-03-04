package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Voie;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface VoieRepository extends JpaRepository<Voie,Integer> {


}

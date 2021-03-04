package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Longueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LongueurRepository extends JpaRepository<Longueur,Integer> {
}

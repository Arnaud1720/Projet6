package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Topo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TopoRepository extends JpaRepository<Topo,Integer> {
    @Query("select t from topo t where t.utilisateur.pseudo = :pseudo")
    List<Topo>findAllByPseudo(@Param(value = "pseudo") String pseudo);



    @Query("select t from topo t where t.available=false ")
    List<Topo> findAllByAvailable();


}

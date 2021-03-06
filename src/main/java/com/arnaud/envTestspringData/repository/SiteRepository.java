package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface SiteRepository extends JpaRepository<Site,Integer> {

        @Query("select t from site t where lower(t.nom) like %:param1% or lower(t.adresse) like %:param2% ")
        List<Site> findByNomOrAdresse(@Param(value = "param1")String param1,@Param(value = "param2")String param2);





    }


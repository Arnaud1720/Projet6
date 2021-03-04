package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Booking;
import com.arnaud.envTestspringData.beans.Topo;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BookingRepository extends JpaRepository<Booking,Integer> {

    @Query("select r from reservation r where r.utilisateur.pseudo = :pseudo")
    List<Booking> findAllByPseudo(@Param(value = "pseudo") String pseudo);

}

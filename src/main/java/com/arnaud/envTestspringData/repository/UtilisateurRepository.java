package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {

    Boolean findByEmail(String email);
    Utilisateur findByPseudo(String pseudo);
    List<Utilisateur> findAllByEmail(String email);


}

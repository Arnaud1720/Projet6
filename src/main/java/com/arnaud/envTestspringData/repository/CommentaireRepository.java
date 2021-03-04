package com.arnaud.envTestspringData.repository;

import com.arnaud.envTestspringData.beans.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.awt.print.Pageable;

@Repository
@Transactional
public interface CommentaireRepository extends JpaRepository<Commentaire,Integer> {

}

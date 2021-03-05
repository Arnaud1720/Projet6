package com.arnaud.envTestspringData.service;
import com.arnaud.envTestspringData.beans.Utilisateur;
import com.arnaud.envTestspringData.repository.UtilisateurRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UtilisateurServices {

    UtilisateurRepository utilisateurRepository;
    @Autowired
    public UtilisateurServices(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }


    @Transactional
    public Utilisateur createUser(Utilisateur utilisateur) {

        String hashed = BCrypt.hashpw(utilisateur.getPassword(), BCrypt.gensalt());        // Vérification d'un mot de passe à partir du hash
        utilisateur.setPassword(hashed);
        return utilisateurRepository.save(utilisateur);
    }


    public Utilisateur getConnectUser(String pseudo, String password) {
        Utilisateur utilisateur = utilisateurRepository.findByPseudo(pseudo);
        if (utilisateur == null) {
            return null;
        } else {

            if (BCrypt.checkpw(password, utilisateur.getPassword())) {
                return utilisateur;
            }
        }
        return null;
    }




    public Utilisateur findById(int id){
       return utilisateurRepository.findById(id).orElse(null);
    }

    public Utilisateur findByPseudo(String pseudo){
        return utilisateurRepository.findByPseudo(pseudo);
    }

    public Boolean existsUtilisateurByPseudo(String pseudo){
        return true;
    }


}

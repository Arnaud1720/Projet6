    create table commentaire (
       id int4 not null,
        commentaire varchar(255),
        datecommentaire timestamp,
        id_site int4,
        id_utilisateur int4,
        primary key (id)
    );
    
    create table longueur (
       id int4 not null,
        difficulte varchar(255),
        longeur int4,
        nbr_attache int4,
        id_voie int4,
        primary key (id)
    );

    
    create table reservation (
       id int4 not null,
        accepte boolean,
        date_debut timestamp,
        date_fin timestamp,
        message_reservation varchar(255),
        topo_id int4,
        utilisateur_id int4,
        primary key (id)
    );
    
    create table secteurs (
       id int4 not null,
        description varchar(255),
        nom varchar(255),
        id_spot int4,
        primary key (id)
    );

    
    create table site (
       id int4 not null,
        adresse varchar(255),
        descriptionspot varchar(255),
        nom varchar(255),
        officiel boolean,
        utilisateur_id int4,
        primary key (id)
    );

    
    create table topo (
       id int4 not null,
        available boolean,
        date_creation date,
        description varchar(255),
        nom varchar(255),
        utilisateur_id int4,
        primary key (id)
    );

    
    create table utilisateur (
       id int4 not null,
        date_naissance timestamp,
        email varchar(255),
        membre_asso Boolean,
        nom varchar(255),
        password varchar(255),
        prenom varchar(255),
        pseudo varchar(255),
        primary key (id)
    );
    
    create table voie (
       id int4 not null,
        description varchar(255),
        nom varchar(255),
        id_secteur int4,
        primary key (id)
    );
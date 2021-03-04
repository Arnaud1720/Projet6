<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
          integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous"/>
    <%@include file="/WEB-INF/Menu/menu.jsp" %>
</head>
<section class=" d-block bg-light m-4  p-2">
        <form:form  method="POST"  modelAttribute="utilisateurs" methodParam="" >

        <div class="form-group w-75 p-2" >

            <form:input maxlength="30"  required="true" id="nomUtilisateur" type="text" name="nomUtilisateur" placeholder="Saisissez votre nom"
                        class="form-control" path="nom"  />
        </div>
        <div class="form-group w-75 p-2">
            <form:input maxlength="30"  required="true" id="prenomUtilisateur" type="text" name="prenomUtilisateur" placeholder="Saisissez votre prénom"
                        class="form-control" path="prenom" />
        </div>
        <div class="input-group w-75 p-2">
            <div class="input-group-prepend ">

            </div>

            <form:input  required="true" id="pseudoUtilisateur" type="text" name="pseudoUtilisateur" placeholder="Saisissez votre pseudo"
                        class="form-control" path="pseudo" pattern=""/>
        </div>


        <div class="form-group w-75 p-2">

            <form:input maxlength="30" required="true" id="passwordUtilisateur" type="password" name="passwordUtilisateur"
                        placeholder="Saisissez votre mot de passe" class="form-control" path="password"  />
        </div>

        <div class="form-group w-75 p-2">
            <form:input maxlength="60"  required="true" type="email" class="form-control" name="emailUtilisateur" id="emailUtilisateur"
                        aria-describedby="emailHelp" placeholder="Enter email" path="email"/>
            <small id="emailHelp" class="form-text text-muted">nous ne partageron jamais vôtre email avec quelqu'un
                d'autre.</small>
        </div>

        <div class="form-group w-75 p-2">
            <form:input required="true" id="naissanceUtilisateur" type="date" name="naissanceUtilisateur" class="form-control"
                        path="dateNaissance"/>
        </div>

        <div>
             <button type="submit" class="btn btn-primary btn-block">Inscription</button>
            <br/>
        </div>
    </form:form>
</section>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<style>

</style>
<head>
    <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
    <title>Site</title>
    <h2>liste de nos site existant</h2>
</head>

<body>

<table class="table">

    <thead>
    <tr>
        <th scope="col">Nom</th>
        <th scope="col"> adresse</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${site.nom}</td>
        <td>${site.adresse}</td>


    </tr>
    </tbody>
</table>
<h1>Secteurs</h1>
<table class="table">
    <thead>
    <tr>

        <th scope="col">nom</th>
        <th scope="col">description</th>
        <th scope="col">liste secteur et voie correspondante</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="secteur" items="${site.secteurList}">
        <tr>


            <td>${secteur.nom}</td>
            <td>${secteur.description}</td>
            <td><a href="/secteur/${secteur.id}">ici</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h1>Commentaire</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">commentaire</th>
        <th scope="col">pseudo utilisateur</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="listCommentaire" items="${site.commentaireSetList}" end="6">
        <tr>

            <td>${listCommentaire.commentaire}</td>
            <td>${listCommentaire.utilisateur.pseudo}</td>

            <c:if test="${sessionScope.pseudo!='adm_test'}">
                <td><a type="button"  class="btn btn-primary btn-sm disabled ">supprimer un commentaire</a></td>
            </c:if>
            <c:if test="${sessionScope.pseudo=='adm_test'}">
                <td><a type="button" href="/site/${listCommentaire.id}/alldelete/deleteCommentaire" class="btn btn-primary btn-sm">supprimer un commentaire</a></td>
            </c:if>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>

<a href="/site/${site.id}/add-secteur/" role="button" class="btn-primary btn-lg">ajouter un secteur</a>
<a href="/sites/${site.id}/commentaire/" role="button" class="btn-primary btn-lg">ajouter un commentaire</a>
</html>

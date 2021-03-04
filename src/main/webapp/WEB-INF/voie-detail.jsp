<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<style>

</style>
<head>
    <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
    <title>Site</title>

</head>

<body>
<H2>voie </H2>
<table class="table">
    <tr>
        <td><c:out value="${voieParam.nom}"/></td>
        <td><c:out value="${voieParam.description}"/></td>
    </tr>
</table>

<h1>Longueur</h1>
<table class="table">

    <thead>
    <tr>

        <th scope="col">N°</th>
        <th scope="col">difficulté</th>
        <th scope="col">longueur</th>
        <th scope="col">point d'encrage</th>
    </tr>
    </thead>
    <c:forEach var="listLongeur" items="${listLongeur}">
        <tbody>
        <tr>
            <td>${listLongeur.id}</td>
            <td>${listLongeur.difficulte}</td>
            <td>${listLongeur.longeur}</td>
            <td>${listLongeur.nbrAttache}</td>
            <td><a href="/site">retour au site</a></td>
        </tr>

        </tbody>
    </c:forEach>
</table>
<a href="/longueur/${voieParam.id}/add-longueur" role="button" class="btn-primary btn-lg">ajouter une longueur</a>
</body>

</html>
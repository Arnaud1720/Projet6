<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>secteur</title>
    <%@include file="Menu/menuCo.jsp" %>
</head>
<body>
<h1>Secteur</h1>
<table class="table">
    <thead>
    <tr>
        <th scope="col">nom Site</th>
        <th scope="col">nom Secteur</th>
        <th scope="col">description</th>


    </tr>
    </thead>
    <tbody>
    <tr>
        <th>${secteur.site.nom}</th>
        <th>${secteur.nom}</th>
        <th>${secteur.description}</th>
    </tr>

    </tbody>
</table>
<br>
<h1>Voie</h1>
<table class="table">

        <thead>
        <tr>
            <th scope="col">nom</th>
            <th scope="col">description</th>
            <th scope="col">longueur de voie</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach var="voie" items="${voie}">
        <tr>
            <td>${voie.nom}</td>
            <td>${voie.description}</td>
            <td><a href="/voie-detail/${voie.id}">detail voie</a> </td>

        </tr>

        </tbody>
    </c:forEach>
</table>

<a href="/secteur/${secteur.id}/add-voie/" role="button" class="btn-primary btn-lg">ajouter une voie</a>
</body>
</html>

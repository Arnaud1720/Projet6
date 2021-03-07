<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<head>
    <%@include file="/WEB-INF/Menu/menuCo.jsp"%>
    <br>
        <%@include file="/WEB-INF/recherche.jsp"%>

    <title>Site</title>
    <h2>liste de nos site existant</h2>
</head>

<body>
<table class="table">

    <thead>
    <tr>
        <th scope="col">Nom</th>
        <th scope="col">Adresse</th>
        <th scope="col">Description</th>
        <th scope="col" >detail secteur du site</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="listSite" items="${listSite}">
    <tr>
       <td>${listSite.nom}</td>
        <td>${listSite.adresse}</td>
        <td>${listSite.descriptionSpot}</td>
        <td><a href="/site/${listSite.id}/">ici</a></td>
        <c:if test="${listSite.officiel==false}">
            <td><a href="${pageContext.request.contextPath}/site/${listSite.id}/tag?officiel=true">tagger ce site</a></td>
        </c:if>
        <c:if test="${listSite.officiel==true}">
          <td>  <c:out value="${officialSite}">site tag comme officiel </c:out></td>
        </c:if>


    </tr>

    </tbody>
    </c:forEach>
</table>
<a href="/addSite" role="button" class="btn-primary btn-lg">ajouter un site</a>


</body>
</html>

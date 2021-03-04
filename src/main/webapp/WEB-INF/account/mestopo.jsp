<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="textarea" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title> ajouter un topo </title>
    <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
</head>

<body>
<table class="table">
        <thead>
        <tr>
            <th scope="col">nom</th>
            <th scope="col">description</th>
            <th scope="col">date de création</th>
            <th scope="col">propriètaire du topo</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="topoList" items="${topoList}">
            <tr>
                <td> ${topoList.nom}</td>
                <td>${topoList.description}</td>
                <td>${topoList.dateCreation}</td>
                <td>${topoList.utilisateur.pseudo}</td>
            </tr>
        </c:forEach>

        </tbody>
    </table>


<table class="table">
        <thead>
        <tr>
            <th scope="col">nom</th>
            <th scope="col">date de début</th>
            <th scope="col">date de fin</th>
            <th scope="col">message</th>
            <th scope="col">email du demendeur</th>
            <th scope="col">refuser la demande</th>
            <th scope="col">accepter la demande</th>
        </tr>
        </thead>

        <tbody>

        <c:forEach var="booking" items="${booking}">

            <tr>
                <td> ${booking.utilisateur.pseudo}</td>
                <td> ${booking.dateDebut}</td>
                <td> ${booking.dateFin}</td>
                <td> ${booking.messageReservation}</td>
                <td>${booking.utilisateur.email} <td>
                    <a href="${pageContext.request.contextPath}/account/mestopo/${booking.id}?accepted=false">refuser</a>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/account/mestopo/${booking.id}?accepted=true">accepter</a>

                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
<footer>
</footer>

</html>
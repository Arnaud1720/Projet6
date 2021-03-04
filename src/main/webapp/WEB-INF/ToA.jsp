<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arnau
  Date: 02/11/2020
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<head>
    <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
  bonjour  ${sessionScope.pseudo}
    <title>liste des topos</title>
</head>
<body>
<table class="table">
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
        <c:forEach var="toposListParam" items="${toposListParam}">

            <tr>
                <td>${toposListParam.nom}</td>
                <td>${toposListParam.description}</td>
                <td>${toposListParam.dateCreation}</td>
                <td>${toposListParam.utilisateur.pseudo}</td>
            </tr>
        </c:forEach>


        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/add-topo" role="button" class="btn-primary btn-lg">ajouter un topo</a>
</table>
</body>
</html>

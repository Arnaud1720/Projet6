<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>secteur</title>
    <%@include file="Menu/menuCo.jsp"%>
</head>
<body>
<table class="table">

    <thead>
    <tr>
        <th scope="col">nom</th>
        <th scope="col">Description</th>
        <th scope="col">info voie</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="listSecteur" items="${listSecteur}">
    <tr>
        <td>${listSecteur.nom}</td>
        <td>${listSecteur.description}</td>
        <td><a href=/secteur/${listSecteur.id}">detail voie</a></td>
    </tr>

    </tbody>
    </c:forEach>
    </table>
</body>
</html>

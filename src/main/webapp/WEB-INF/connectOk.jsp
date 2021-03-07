<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arnau
  Date: 09/10/2020
  Time: 10:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<header class="p-5 m-2"
        style="background-image: url('https://media.odalys-vacances.com/plus/v3/guide/img/0201-B4-location-vacances-a-la-montagne-un-spectacle-magique.jpg'); background-size: cover; background-position: center ">
    <title>accueil mon compte</title>
</header>
<body>

<div>
    <c:out value="bonjour : ${sessionScope.pseudo}"/>


</div>
<nav class="navbar navbar-dark navbar-expand-md bg-dark sticky-top border  ">
    <div class="container">
        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarText">
            <span class="navbar-toggler-icon"></span>
        </button>
        <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
    </div>
    <div class="dropdown">
        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown"
                aria-haspopup="true" aria-expanded="true">
            <img src="https://image.shutterstock.com/image-vector/man-icon-vector-600w-1040084344.jpg "
                 alt="menu déroulant" width="44" height="44">
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
            <li><a href="${pageContext.request.contextPath}/account/mestopos" title="Lien 2">Mes topos</a></li>
        </ul>
    </div>
</nav>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>

</body>
</html>

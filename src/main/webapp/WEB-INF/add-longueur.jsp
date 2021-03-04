<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="textarea" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="UTF-8">

<head>
    <title> ajouter longeur </title>
    <%@include file="/WEB-INF/Menu/menu.jsp" %>
</head>

<body>

<form:form method="post" modelAttribute="longueur" >

    <div class="form-group w-75 p-2">
        <form:input id="difficulte" type="text" name="nom" placeholder="Saisissez la diffculté" class="form-control"
                    path="difficulte" />
    </div>

    <div class="form-group w-75 p-2">
        <label> longeur</label>
        <form:input id="longeur" type="number" name="longeur" placeholder="" class="form-control"
                    path="longeur" />
    </div>

    <div class="form-group w-75 p-2">
        <label>nombre d'attache</label>
        <form:input id="nbrClip" type="number" name="nbrClip" placeholder="" class="form-control"
                    path="nbrAttache" />
    </div>
    <input class="p-1 rounded" type="submit" value="Valider"/>
    <input class="p-1 rounded" type="reset" value="Remettre à zéro"/> <br/>
</form:form>

</body>

<footer>
</footer>

</html>

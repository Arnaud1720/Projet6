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

<form:form method="POST" modelAttribute="topo" action="" methodParam="">
    <div class="form-group w-75 p-2">
        <form:input id="nom" type="text" name="nom" placeholder="Saisissez le nom du topo" class="form-control"
                    path="nom" />
    </div>

    <div class="input-group w-75 p-2">

        <form:textarea class="form-control" name="descriptionSpot" id="descriptionSpot" rows="3" maxlength="1250" required="required"
                  path="description"></form:textarea>
    </div>

    <input class="p-1 rounded" type="submit" value="Valider"/>
    <input class="p-1 rounded" type="reset" value="Remettre à zéro"/> <br/>
</form:form>


</body>

<footer>
</footer>

</html>

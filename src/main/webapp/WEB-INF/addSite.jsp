<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="textarea" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title> ajouter un site </title>
    <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
</head>

<body>

<form:form method="POST" modelAttribute="site" action="" methodParam="">
    <div class="form-group w-75 p-2">
        <form:input id="nom" type="text" name="nom" placeholder="Saisissez le nom du site" class="form-control"
                    path="nom" />
    </div>
    <div class="form-group w-75 p-2">
        <form:input type="text" name="adresse" id="adresse" placeholder="adresse du site" class="form-control"
                    path="adresse"/>
    </div>
    <div class="input-group w-75 p-2">

        <textarea class="form-control" name="descriptionSpot" id="descriptionSpot" rows="3" maxlength="1250" required="required"
                  path="textArea"  ></textarea>
    </div>

    <input class="p-1 rounded" type="submit" value="Valider"/>
    <input class="p-1 rounded" type="reset" value="Remettre à zéro"/> <br/>
</form:form>


</body>

<footer>
</footer>

</html>

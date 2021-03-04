<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="textarea" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="UTF-8">

<head>
    <title> ajouter une voie </title>
    <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
</head>

<body>

<form:form method="POST" modelAttribute="voie" methodParam="">


    <div class="form-group w-75 p-2">
        <form:input id="nomVoie" type="text" name="nomVoie" placeholder="nom"
                    class="form-control"
                    path="nom"/>
    </div>

    <div class="form-group w-75 p-2">
        <label>description</label>
        <form:input id="descriptionVoie" type="text" name="descriptionVoie" placeholder=""
                    class="form-control"
                    path="description"/>
    </div>

    <input class="p-1 rounded" type="submit" value="Valider"/>
    <input class="p-1 rounded" type="reset" value="Remettre à zéro"/> <br/>
</form:form>


</body>

<footer>
</footer>

</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="textarea" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="UTF-8">

<head>
    <title> ajouter un secteur </title>
    <%@include file="/WEB-INF/Menu/menu.jsp" %>
</head>

<body>

<form:form method="post" modelAttribute="secteur" >

    <div class="form-group w-75 p-2">
        <form:input id="nom" type="text" name="nom" placeholder="Saisissez le nom du secteur" class="form-control"
                    path="nom" />
    </div>

        <form:textarea class="form-control" name="descriptionSpot" id="descriptionSpot" rows="3" maxlength="1250" required="required"
                  path="description"  ></form:textarea>
    </div>

    <input class="p-1 rounded" type="submit" value="Valider"/>
    <input class="p-1 rounded" type="reset" value="Remettre à zéro"/> <br/>
</form:form>


</body>

<footer>
</footer>

</html>

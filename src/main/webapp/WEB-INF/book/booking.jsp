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

<form:form method="post" modelAttribute="booking" >
    <label>date de début</label>
    <div class="form-group w-75 p-2">
        <form:input id="dateDeDebut" type="date" name="dateDeDebut" class="form-control"
                    path="dateDebut" />
    </div>
    <label>date de fin</label>
    <div class="form-group w-75 p-2">
        <form:input id="dateDeFin" type="date" name="dateDeFin" class="form-control"
                    path="dateFin" />
    </div>

    <form:textarea class="form-control" name="messageBooking" id="messageBooking" rows="3" maxlength="1250" required="required"
                   path="messageReservation"  ></form:textarea>
    </div>

    <input class="p-1 rounded" type="submit" value="Valider"/>
    <input class="p-1 rounded" type="reset" value="Remettre à zéro"/> <br/>
</form:form>


</body>

<footer>
</footer>

</html>

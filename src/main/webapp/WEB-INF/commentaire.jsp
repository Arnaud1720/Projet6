<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arnau
  Date: 02/12/2020
  Time: 11:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
se
<head>

    <title> commentaire</title>
    <head>
        <title> ajouter un site </title>
        <%@include file="/WEB-INF/Menu/menuCo.jsp" %>
    </head>

</head>
<body>

<form:form method="post" modelAttribute="newCommentaire"  >
    <div class="input-group w-75 p-2">

        <label for="commentaire"></label>
        <textarea class="form-control" name="commentaire" id="commentaire" rows="3" maxlength="1250" required="required"
                                                   path="commentaire"  ></textarea>
    </div>

    <input  class="p-1 rounded" type="submit" value="Valider"/>
    <input class="p-1 rounded" type="reset" value="Remettre à zéro"/> <br/>
</form:form>

</body>
</html>

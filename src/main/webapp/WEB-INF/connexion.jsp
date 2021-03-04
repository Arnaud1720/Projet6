<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
${sessionScope.pseudo}
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous"/>
    <%@include file="/WEB-INF/Menu/menu.jsp"%>
    <c:set var="UserLogin"  value="${utilisateur.pseudo}" scope="session"/>
    <c:if test="${utilisateur.pseudo==null}">
        <c:out value="${UserLog}">
        </c:out>
    </c:if>
</head>
<section class=" d-block bg-light m-4  p-2">


    <form:form action="" method="POST" modelAttribute="utilisateur">
        <div class="form-group w-75 p-2">

            <div class="form-group w-75 p-2">
                <form:input type="text" class="form-control" id="pseudo" aria-describedby="pseudo" placeholder="votre pseudo" path="pseudo"/>
            </div>

            <div class="form-group w-75 p-2">

                <form:input type="password" name="password" placeholder="Saisissez votre mot de passe" class="form-control"  path="password"/>
            </div>
            <button type="submit" class="btn btn-primary btn-block">Connexion</button>
        </div>

    </form:form>

</section>
</form>
</html>

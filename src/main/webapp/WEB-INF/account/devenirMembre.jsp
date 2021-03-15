<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: deris
  Date: 09/03/2021
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>devenir membre</title>
    <%@include file="/WEB-INF/Menu/menuCo.jsp"%>
    ${sessionScope.pseudo}
    ${utilisateurConnecte}
</head>
<body>
<H2><p>voulez vous devenir membre de l'assosiation?</p></H2>
<a href="/account/devenirMembre/yes" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">oui</a>
<a href="/account/devenirMembre/no" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">non</a>

</div>
</body>
</html>

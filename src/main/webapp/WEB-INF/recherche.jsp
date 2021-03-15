<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<HTML>

<head>

    <form method="post" action="${pageContext.request.contextPath}/site" name="recherche">

        <label for="param1">Site commencant par</label><br />
        <input type="text" name="param1" id="param1">
        <br>

        <label for="param1">adresse</label><br />
        <input type="text" name="param2" id="param1">
        </br>


        <input type="submit" name="validez" value="validez">

    </form>
</head>

<body>

</br>

</body>

</HTML>
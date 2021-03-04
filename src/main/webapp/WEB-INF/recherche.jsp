<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<HTML>
<%--<style>--%>
<%--    table {--%>
<%--        border-collapse: collapse; /* Les bordures du tableau seront collées  */--%>
<%--    }--%>

<%--    td, th {--%>
<%--        border: 4px solid black;--%>

<%--    }--%>

<%--    td {--%>
<%--        color: #a52a2a;--%>
<%--    }--%>
<%--</style>--%>

<head>

    <form method="post" action="${pageContext.request.contextPath}/site" name="recherche">

        <label for="param1">Site commencant par</label><br />
        <input type="text" name="param1" id="param1">
        </br>
<%--        <label for="difficulte_Voie">difficulte voie </label><br/>--%>
<%--        <select name="difficulte_voie" id="difficulte_Voie">--%>
<%--            <option value="difficulteVoieD"> Débutant </option>--%>
<%--            <option value="difficulteVoieI"> Intermédiaire </option>--%>
<%--            <option value="difficulteVoieC"> Confirmer </option>--%>
<%--        </select>--%>
<%--        </br>--%>
<%--        <label for="nbr_relais"> nombre de relais  </label><br />--%>
<%--        <select name="nbr_relais" id="nbr_relais">--%>
<%--            &lt;%&ndash;                <option value="nbr_relais1"> 2 a 5  </option>&ndash;%&gt;--%>
<%--            <option value="nbr_relais2"> 3 a 7 </option>--%>
<%--        </select>--%>
        </br>
        <input type="submit" name="validez" value="validez">

    </form>
</head>

<body>

</br>

</body>

</HTML>
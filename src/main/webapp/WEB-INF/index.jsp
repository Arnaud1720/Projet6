<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
<head>
    <%@include file="/WEB-INF/Menu/menu.jsp"%>
</head>
<body>
<div class="carousel slide" data-ride="carousel" id="carouselExample">

    <ol class="carousel-indicators">
        <li data-target="#carouselExample" data-slide-to="0" class="active"></li>
        <li data-target="#carouselExample" data-slide-to="1"></li>
    </ol>
    <li data-target="#carouselExample" data-slide-to="2"></li>
</div>

<div class="carousel-inner">
    <div class="carousel-item active">
        <img src="https://images.alphacoders.com/698/thumb-1920-698089.jpg" alt="montagne1" class="d-block w-100" />
        <div class="carousel-caption">
            <h5>Montagne</h5>

        </div>
    </div>

    <div class="carousel-item">
        <img src="https://hdfondsdecran.com/image/201609/1830/montagne-enneige-autriche-nuit-lumiere.jpg" alt="montagne2" class="d-block w-100" />
    </div>
    <div class="carousel-item">
        <img src="https://hdfondsdecran.com/image/201609/2555/everest-montagne-vue-den-haut-nuage.jpg" alt="montagne3" class="d-block w-100" />
    </div>
</div>

<a class="carousel-control-prev" data-slide-to="prev" href="#carouselExample">
    <span class="carousel-control-prev-icon"></span>
</a>

<a class="carousel-control-next" data-slide="next" href="#carouselExample">
    <span class="carousel-control-next-icon"></span>
</a>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>

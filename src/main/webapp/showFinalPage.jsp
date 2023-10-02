<%@ page import="ru.javarush.klimovich.quest.entity.Answer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Result</title>
    <link href="/css/my.css" rel="stylesheet">
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
            crossorigin="anonymous"></script>

    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>

    </script>
</head>
<body style="background-color:rgba(0,0,0,0.38);">
<div class="col text-center">
    <div class="p-3 mb-2 bg-dark text-white"
         style="border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">
        <h3>Результат:</h3></div>
</div>

<div class="col text-center">
    <c:set var="questionId" scope="session" value="${questionId}"> </c:set>

    <c:if test="${questionId == 601}">
    <img src="/img/result1.jpg" width="400" height="400">

    <div class="col text-center">
        <div class="p-3 mb-5 bg-dark text-white"
             style=" font-size: 25px; border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">
                Ты ответил на все вопросы! Исходя из твоих ответов, я могу сказать, что ты был бы
                    ${questionText} котиком!
        </div>
    </div>
</div></c:if>

<c:if test="${questionId == 602}">
    <img src="/img/result2.jpg" width="400" height="400">
    <div class="col text-center">
        <div class="p-3 mb-5 bg-dark text-white"
             style=" font-size: 25px; border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">
            Ты ответил на все вопросы! Исходя из твоих ответов, я могу сказать, что ты был бы
                ${questionText} котиком!
        </div>
    </div></c:if>

<c:if test="${questionId == 603}">
    <img src="/img/result3.jpg" width="400" height="400">
    <div class="col text-center">
        <div class="p-3 mb-5 bg-dark text-white"
             style=" font-size: 25px; border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">
            <div style=" font-size: 25px ">
                Ты ответил на все вопросы! Исходя из твоих ответов, я могу сказать, что ты был бы
                    ${questionText} котиком!
            </div>
        </div>
    </div></c:if>

<c:if test="${questionId == 604}">
    <img src="/img/result4.jpg" width="400" height="400">
    <div class="col text-center">
        <div class="p-3 mb-5 bg-dark text-white"
             style=" font-size: 25px; border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">
            <div style=" font-size: 25px ">
                Ты ответил на все вопросы! Исходя из твоих ответов, я могу сказать, что ты был бы
                    ${questionText} котиком!
            </div>
        </div>
    </div></c:if>

<hr>
<div class="col text-center">
    <form action="/start" method="post">
        <input type="hidden" name="action" value="restart">
        <input type="submit" class="btn btn-dark" value="Заново" style="font-size: 25px">
    </form>
</div>

</body>
</html>



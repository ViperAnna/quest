<%@ page import="ru.javarush.klimovich.quest.entity.Answer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>QUEST</title>
    <meta charset="UTF-8">
    <link href="/css/my.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
            crossorigin="anonymous"></script>
</head>

<body style="background-color:rgba(0,0,0,0.38);">
<div class="col text-center">
    <div style=" font-size: 25px ">
        Выбери вариант ответа:
    </div>
</div>

<div class="col text-center">
    <img src="img/${imageLink}" width="400" height="400"></div>
<div class="col text-center">
    <div class="p-3 mb-5 bg-dark text-white"
         style="font-size: 25px; border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">
        ${questionText}
    </div>
</div>

<form action="start" method="post">
    <% List<Answer> answers = (List<Answer>) request.getAttribute("answers");
        if (answers != null) {
            for (int i = 0; i < answers.size(); i++) {
                Answer answer = answers.get(i);
    %>

    <div class="col text-center" style="font-size: 25px;">
        <input type="radio" name="selectedAnswerIndex" value="<%=i%>" required>
        <%=answer.getAnswerText()%>
        <%
                }
            }
        %>
    </div>

    <input type="submit" class="btn btn-dark" value="Дальше" style="font-size: 25px">

    <hr>
    <div class="col text-center">
        <div class="p-3 mb-5 bg-dark text-white"
             style=" font-size: 16px; border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">

            <div style=" font-size: 25px ">
                Статистика:
            </div>

            <br>

            <p>IP Address: ${ipAddress}<p>
            <p>ID SESSION: ${jSessionId}<p>
            <p>Player Name: ${name}
            <p>
            <p>Game Count: ${gameCount}
            <p>

        </div>
    </div>
</form>
</body>
</html>

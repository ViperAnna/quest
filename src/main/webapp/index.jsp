<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>QUEST</title>
    <link href="/css/my.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
            crossorigin="anonymous"></script>
</head>
<body style="background-color:rgba(0,0,0,0.38);">

<div class="col text-center">
    <div class="p-3 mb-2 bg-dark text-white"
         style="border:3px; border-style:solid; border-color: rgb(0,0,0); padding: 1em ; display: inline-block; border-radius: 25px;">
        <h3>Каким котиком ты бы был?</h3></div>
</div>

<div class="col text-center">
    <img src="img/titlePicture.jpg" width="400" height="400">
</div>
<!-- Кнопка модального окна ОПИСАНИЕ -->
<div class="col text-center">
    <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#description">Описание</button>
    <!-- Кнопка модального окна ПРАВИЛА-->
    <button type="button" class="btn btn-light" data-bs-toggle="modal" data-bs-target="#rules">Правила</button>
</div>

<!-- Модальное окно ОПИСАНИЕ-->
<div class="modal fade" id="description" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
     aria-labelledby="descriptionLable" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-3" id="descriptionLable">Описание</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Закрыть"></button>
            </div>
            <div class="modal-body">

                <p><h5>Привет!</h5>
                <p> Добро пожаловать в квест! <br> Все мы иногда задумывались: "А что если бы...?".
                    В этом квесте ты сможешь узнать,  а что, если бы ты был котиком, то каким?
                    Ответь на несколько вопросов о твоем характере, и я помогу тебе узнать,
                    с какой изюминкой ты бы был из мира кошачьих.
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
            </div>
        </div>
    </div>
</div>


<!-- Модальное окно ПРАВИЛА -->
<div class="modal fade" id="rules" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1"
     aria-labelledby="rulesLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-3" id="rulesLabel">Правила</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Закрыть"></button>
            </div>
            <div class="modal-body">

                <p> 1. На каждом вопросе будет несколько вариантов ответов.
                    Выбери тот, который наиболее точно отражает твой характер.
                <p>
                <p> 2. Ответь честно, чтобы результат был максимально точен.
                <p>
                <p>3. После ответа на все вопросы, ты узнаешь, каким котиком ты бы был.
                <p>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Закрыть</button>
            </div>
        </div>
    </div>
</div>

<div class="col text-center">
    <h3>Как к Вам обращаться?</h3>
</div>
<form action="init-user" method="get">
    <div class="col text-center">
        <input type="text" class="form-control" style="width: 200px; display: block; margin: 0 auto" name="name"
               placeholder="Имя" required>
        <input type="submit" class="btn btn-dark" value="Отправить">
    </div>
</form>
</body>
</html>


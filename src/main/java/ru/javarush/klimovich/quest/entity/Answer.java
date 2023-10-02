package ru.javarush.klimovich.quest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Answer {

    private int answerId;
    private String answerText;
    private int nextQuestionKeyId;
}

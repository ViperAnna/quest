package ru.javarush.klimovich.quest.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter

public class Question {
    private int questionId;
    private String imageLink;
    private String questionText;
    private List<Answer> answers;
}

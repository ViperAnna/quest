package ru.javarush.klimovich.quest.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.javarush.klimovich.quest.entity.Question;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionRepository {

    Map<Integer, Question> questions;
    private List<Question> questionList;

    public QuestionRepository() {
        this.questions = new HashMap<>();
        loadQuestionsFromJson();
    }

    void loadQuestionsFromJson() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/questionsAndAnswerData.json");
            questionList = objectMapper.readValue(inputStream, new TypeReference<>() {
            });
            for (Question question : questionList) {
                questions.put(question.getQuestionId(), question);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Question getQuestionById(Integer questionId) {
        return questions.get(questionId);
    }
}

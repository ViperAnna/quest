//package ru.javarush.klimovich.quest.repository;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import ru.javarush.klimovich.quest.entity.Question;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.Mockito.*;
//
//class QuestionRepositoryTest {
//
//    private QuestionRepository questionRepository;
//    private InputStream inputStream;
//    private ObjectMapper objectMapper;
//    private List<Question> questionList;
//    private Map<Integer, Question> questions;
//
//    @BeforeEach
//    public void laodRepository () {
//        questionRepository= new QuestionRepository();
//        inputStream = mock(InputStream.class);
//        objectMapper = mock(ObjectMapper.class);
//        questionList = new ArrayList<>();
//        questions = new HashMap<>();
//    }
//
//
//    @Test
//    public void loadQuestionsFromJsonTest() throws IOException {
//
//            when(questionRepository.getClass().getResourceAsStream("/questionsAndAnswerData.json")).thenReturn(inputStream);
//            when(objectMapper.readValue(inputStream, new TypeReference<List<Question>>() {
//            })).thenReturn(questionList);
////            when(questionList.get(0)).thenReturn(mock(Question.class));
////            when(questionList.get(0).getQuestionId()).thenReturn(1);
////            when(questionList.get(1)).thenReturn(mock(Question.class));
////            when(questionList.get(1).getQuestionId()).thenReturn(2);
////            when(questionList.get(2)).thenReturn(mock(Question.class));
////            when(questionList.get(2).getQuestionId()).thenReturn(3);
////            when(questionList.size()).thenReturn(3);
//        Question question1 = new Question();
//        question1.setQuestionId(1);
//        questionList.add(question1);
//
//        Question question2 = new Question();
//        question2.setQuestionId(2);
//        questionList.add(question2);
//
//        Question question3 = new Question();
//        question3.setQuestionId(3);
//        questionList.add(question3);
//
//            questionRepository.loadQuestionsFromJson();
//
//            verify(questionRepository.getClass(), times(1)).getResourceAsStream("/questionsAndAnswerData.json");
//            verify(objectMapper, times(1)).readValue(inputStream, new TypeReference<List<Question>>() {
//            });
//            verify(questionList, times(3)).get(anyInt());
//            verify(questions, times(3)).put(anyInt(), any(Question.class));
//            assertEquals(3, questionRepository.questions.size());
//        }
//    }

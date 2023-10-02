//package ru.javarush.klimovich.quest.contrioller;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletContext;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import ru.javarush.klimovich.quest.repository.QuestionRepository;
//import ru.javarush.klimovich.quest.entity.Answer;
//import ru.javarush.klimovich.quest.entity.Question;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static org.mockito.Mockito.*;
//
//public class StartServletTest {
//    private final static String path = "/index.jsp";
//
//    @Mock
//    private HttpServletRequest request;
//
//    @Mock
//    private HttpServletResponse response;
//
//    @Mock
//    private HttpSession session;
//
//    @Mock
//    private RequestDispatcher requestDispatcher;
//    @Mock
//    private ServletContext servletContext;
//
//    private StartServlet startServlet;
//    private QuestionRepository questionRepository;
//
//    @Before
//    public void setUp() throws Exception {
//        MockitoAnnotations.initMocks(this);
//
//        questionRepository = mock(QuestionRepository.class);
//        startServlet = new StartServlet(questionRepository);
//        request = mock(HttpServletRequest.class);
//        requestDispatcher = mock(RequestDispatcher.class);
//
////        when(request.getSession(true)).thenReturn(session);
//        session = mock(HttpSession.class);
//        when(request.getRequestDispatcher("quiz.jsp")).thenReturn(requestDispatcher);
//
//        servletContext = mock(ServletContext.class);
//
//    }
//
//    @Test
//    public void testDoGet() throws Exception {
//
//
////
////        String currentQuestionId = "1";
////        String questionText = "What is your favorite color?";
////        List<Answer> answers = Arrays.asList(
////                new Answer("Are you a cat?", 2),
////                new Answer("Are you a dog?", 3)
////        );
//        List<Answer> answers = mock(ArrayList.class);
//
////        Question currentQuestion = new Question(questionText, answers);
////
//        when(session.getAttribute("currentQuestionId")).thenReturn(currentQuestionId);
////        when(questionRepository.getQuestionById(Integer.valueOf(currentQuestionId))).thenReturn(currentQuestion);
//
////
////
//        verify(session).setAttribute("currentQuestionId", currentQuestionId);
//        verify(request).setAttribute("questionText", questionText);
//        verify(request).setAttribute("answers", answers);
//        verify(requestDispatcher).forward(request, response);
//
//
//        startServlet.doGet(request, response);
//
//        verify(request, times(1)).getRequestDispatcher(path);
//        verify(requestDispatcher).forward(request, response);
//    }
//
////    @Test
////    public void testDoPost() throws Exception {
////        String currentQuestionId = "1";
////
////        when(session.getAttribute("currentQuestionId")).thenReturn(currentQuestionId);
////
////        startServlet.doPost(request, response);
////
////    }
//}
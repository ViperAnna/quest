package ru.javarush.klimovich.quest.contrioller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import ru.javarush.klimovich.quest.entity.Answer;
import ru.javarush.klimovich.quest.entity.Question;
import ru.javarush.klimovich.quest.repository.QuestionRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "startServlet", value = "/start")
public class StartServlet extends HttpServlet {

    private QuestionRepository questionRepository;

    @Override
    public void init() {
        questionRepository = new QuestionRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Integer currentQuestionId = (Integer) session.getAttribute("currentQuestionId");
        if (currentQuestionId == null) {
            //start of the quest
            currentQuestionId = 1;
        }

        Question currentQuestion = questionRepository.getQuestionById(currentQuestionId);

        if (currentQuestion != null) {
            session.setAttribute("currentQuestionId", currentQuestionId);
            request.setAttribute("questionText", currentQuestion.getQuestionText());
            request.setAttribute("imageLink", currentQuestion.getImageLink());
            request.setAttribute("answers", currentQuestion.getAnswers());
            request.getRequestDispatcher("firstStartPageofQuest.jsp").forward(request, response);
        } else {
            response.getWriter().append("Invalid question ID");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);
        Integer currentQuestionId = (Integer) session.getAttribute("currentQuestionId");
        String selectedAnswerIndexStr = request.getParameter("selectedAnswerIndex");
        String action = request.getParameter("action");

        if (action != null && action.equals("restart")) {
            session.removeAttribute("currentQuestionId");
            response.sendRedirect(request.getContextPath() + "/index.jsp");
            return;
        }

        if (currentQuestionId != null && selectedAnswerIndexStr != null) {
            int selectedAnswerIndex = Integer.parseInt(selectedAnswerIndexStr);
            Question currentQuestion = questionRepository.getQuestionById(currentQuestionId);

            if (currentQuestion != null) {
                List<Answer> answers = currentQuestion.getAnswers();
                session.setAttribute("imageLink", currentQuestion.getImageLink());

                if (selectedAnswerIndex >= 0) {
                    Answer selectedAnswer = answers.get(selectedAnswerIndex);
                    int number = selectedAnswer.getNextQuestionKeyId();

                    if (number == 601 || number == 602 || number == 603 || number == 604) {
                        currentQuestion = questionRepository.getQuestionById(number);

                        session.setAttribute("imageLink", currentQuestion.getImageLink());
                        session.setAttribute("questionId", number);
                        session.setAttribute("questionText", currentQuestion.getQuestionText());
                        response.sendRedirect("showFinalPage.jsp");
                    } else {
                        session.setAttribute("currentQuestionId", selectedAnswer.getNextQuestionKeyId());
                        response.sendRedirect("start");
                    }
                }
            }
        }
        response.getWriter().append("Invalid request");
    }
}
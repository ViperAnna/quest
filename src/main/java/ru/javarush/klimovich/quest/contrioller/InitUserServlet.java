package ru.javarush.klimovich.quest.contrioller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "InitUserServlet", value = "/init-user")
public class InitUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        Integer gameCount = (Integer) session.getAttribute("gameCount");

        if (name.isBlank()) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            session.setAttribute("ipAddress", request.getLocalAddr());
            session.setAttribute("jSessionId", session.getId());
            session.setAttribute("name", name);

            if (gameCount == null) {
                gameCount = 1;
            } else {
                gameCount++;
            }
            session.setAttribute("gameCount", gameCount);
            request.getRequestDispatcher("start").include(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    }
}
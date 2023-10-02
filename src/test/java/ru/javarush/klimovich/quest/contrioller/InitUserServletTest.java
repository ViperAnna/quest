//package ru.javarush.klimovich.quest.contrioller;
//
//import jakarta.servlet.RequestDispatcher;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.Mockito;
//
//import java.io.IOException;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class InitUserServletTest {
//
//    @Test
//    public void testEmptyNameParameter() throws ServletException, IOException {
//
//        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
//        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
//        HttpSession session = Mockito.mock(HttpSession.class);
//        RequestDispatcher dispatcher = Mockito.mock(RequestDispatcher.class);
//
//        Mockito.when(request.getParameter("name")).thenReturn("");
//        Mockito.when(request.getSession(true)).thenReturn(session);
//        InitUserServlet servlet = new InitUserServlet();
////        servlet.doGet(request, response);
////        Mockito.verify(dispatcher).forward(request, response);
//        assertEquals("text/html", response.getContentType());
//    }
//    @Test
//    public void testNonEmptyNameParameter() throws ServletException, IOException {
//        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
//        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
//        HttpSession session = Mockito.mock(HttpSession.class);
//        RequestDispatcher requestDispatcher = Mockito.mock(RequestDispatcher.class);
//
//        Mockito.when(request.getParameter("name")).thenReturn("Anna");
//        Mockito.when(request.getSession(true)).thenReturn(session);
//
//        InitUserServlet servlet = new InitUserServlet();
//        servlet.doGet(request, response);
//
//        Mockito.verify(session).setAttribute("ipAddress", request.getLocalAddr());
//        Mockito.verify(session).setAttribute("jSessionId", session.getId());
//        Mockito.verify(session).setAttribute("name", "Anna");
//
//        Mockito.verify(session).getAttribute("gameCount");
//        Mockito.verify(session).setAttribute("gameCount", 1);
//
//
//        Mockito.verify(requestDispatcher).include(request, response);
//
//    }
//}
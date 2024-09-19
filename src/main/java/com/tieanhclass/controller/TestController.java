package com.tieanhclass.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Xử lý yêu cầu GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/views/test.jsp");
        request.setAttribute("model","This is get servlet");
        rd.forward(request, response);
    }

    // Xử lý yêu cầu POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/views/test.jsp");
        request.setAttribute("model","This is post servlet");
        rd.forward(request, response);
    }
}

package com.tieanhclass.controller;

import com.tieanhclass.model.UserModel;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	/*@Inject 
	private ICategoryService categoryService; */
	
	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//		request.setAttribute("categories", categoryService.findAll());
		//request.setAttribute("model", nưe);
		String action = request.getParameter("action");
		if (action != null) {
			if (action.equals("add")) {
				String firstName = request.getParameter("firstname");
				String lastName = request.getParameter("lastname");
				String email = request.getParameter("email");

				UserModel newModel = new UserModel();
				newModel.setFirstName(firstName);
				newModel.setLastName(lastName);
				newModel.setEmail(email);
				request.setAttribute("userModel", newModel);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("/views/home.jsp"); 
		rd.forward(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}

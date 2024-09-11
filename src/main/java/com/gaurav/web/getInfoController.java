package com.gaurav.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.gaurav.web.dao.userDao;
import com.gaurav.web.model.User;

public class getInfoController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		userDao dao = new userDao();
		User data = dao.getData(id);
		request.setAttribute("data", data);
		RequestDispatcher rd = request.getRequestDispatcher("showInfo.jsp");
		rd.forward(request, response);
		
	}
}

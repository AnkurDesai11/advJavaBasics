package com.filters;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Setsession
 */
@WebServlet("/Setsession")
public class Setsession extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Setsession() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session = request.getSession(true);
		String type = request.getParameter("sessiontype");
		String val = request.getParameter("val");
		//System.out.println(type+" -> "+val);
		if( type.equals("profile") ) {
			request.getSession().setAttribute("profile", val);
			//System.out.println(request.getSession().getAttribute("profile"));
		}
		else if( type.equals("order") ) {
			request.getSession().setAttribute("order", val);
			//System.out.println(request.getSession().getAttribute("order"));
		}
		else {
			//System.out.println("Hi");
			response.sendRedirect("filterexample.html");
			
		}
	}

}

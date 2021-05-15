package com.myfirstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hiddenformServlet1
 */
@WebServlet("/hiddenformServlet1")
public class hiddenformServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public hiddenformServlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<head>");
		out.println("<title>urlModServlet1</title>");
		out.println("</head>");
		out.println("<body>");
		
		String nameString = request.getParameter("user_name");
		out.println("<h1>Hi "+nameString+"!</h1>");
		
		out.println(""
				+ "<form action='hiddenformServlet2' >"
				+ "<input type='hidden' name='user_name' value='"+nameString+"' />"
				+ "<button>Go to second servlet</button>"
				+ "</form>"
				+ "");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class OrderFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)req;
		HttpSession session = request.getSession();
		if( session.getAttribute("order") != null && session.getAttribute("order") != "" )
			chain.doFilter(req, resp);
		else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<h2>Please log order<h2>");
			//out.println("<h2>"+session.getAttribute("order")+"<h2>");
		}
	}

}

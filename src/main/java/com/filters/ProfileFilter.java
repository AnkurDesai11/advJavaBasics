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

public class ProfileFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//Filter.super.destroy();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		//Filter.super.init(filterConfig);
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//pre-processing
		//System.out.println("Before Servlet");
		//chain.doFilter(req, resp);
		//post-processing
		//System.out.println("After Servlet");
		HttpServletRequest request = (HttpServletRequest)req;
		HttpSession session = request.getSession();
		if( session.getAttribute("profile") != null && session.getAttribute("profile") != "" )
			chain.doFilter(req, resp);
		else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<h2>Please log profile<h2>");
			//out.println("<h2>"+session.getAttribute("profile")+"<h2>");
		}
	}

}

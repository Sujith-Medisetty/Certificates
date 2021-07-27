package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		ServletContext context=getServletContext();
		
		ServletConfig config=getServletConfig();
		
		PrintWriter out=response.getWriter();
		out.print("<h1>"+config.getInitParameter("servlet-name")+"</h1>");
		out.print("<h3>"+config.getInitParameter("query-1")+"</h3>");
		
		out.print("<b>"+context.getInitParameter("Global-name")+"</b>");
		
	}

}

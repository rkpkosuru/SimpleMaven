package com.kst.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



	public class  ServletLifeCycle extends GenericServlet
	{
		public void init(ServletConfig config) 
		{
			System.out.println("In SimpleMaven init method");
		}

		public void service(ServletRequest req, ServletResponse resp) throws ServletException,IOException 
		{
			System.out.println("In SimpleMaven service method");
// to write dynamic data to our console
			resp.setContentType("text/html");
			PrintWriter out	 = resp.getWriter();

			out.println(" Welcome to SimpleMaven. Please check server console");

		}
		public void destroy() 
		{
			System.out.println("In SimpleMaven destroy method");
		}
	}


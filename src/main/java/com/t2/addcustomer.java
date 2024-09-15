package com.t2;

import com.t2.customerservise;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addcustomer")
public class addcustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addcustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath()+"/home.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
customer cus =new customer();

cus.setName(request.getParameter("name"));
cus.setEmail(request.getParameter("email"));
cus.setPassword(request.getParameter("password"));
cus.setAge(Integer.parseInt( request.getParameter("age")));


	customerservise servise =new customerservise();
	servise.regCustomer(cus);

//		doGet(request, response);

		RequestDispatcher dispacher =request.getRequestDispatcher("home.jsp");
		dispacher.forward(request, response);

	}


	
}

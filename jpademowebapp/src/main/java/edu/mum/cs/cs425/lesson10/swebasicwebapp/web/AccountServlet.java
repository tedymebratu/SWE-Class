package edu.mum.cs.cs425.lesson10.swebasicwebapp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.cs.cs425.lesson10.swebasicwebapp.dataaccess.DBFacade;
import edu.mum.cs.cs425.lesson10.swebasicwebapp.model.Account;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet(urlPatterns = { "/AccountServlet" })
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AccountServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("index.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String accountNo = request.getParameter("accountNo");
		String accountName = request.getParameter("accountName");
		request.getSession().setAttribute("currAccountNo", accountNo);
		request.getSession().setAttribute("currAccountName", accountName);
		Account a = new Account();
		a.setAccountno(accountNo);
		a.setAccountname(accountName);
		DBFacade.saveAccount(a);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/feedback.jsp");
		rd.forward(request, response);
	}

}

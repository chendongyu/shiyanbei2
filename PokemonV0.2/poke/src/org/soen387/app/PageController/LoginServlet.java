package org.soen387.app.PageController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.soen387.app.TransactionScript.ViewUserTS;
import org.soen387.app.rdg.UserRDG;
import org.soen387.app.viewHelper.UserHelper;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		UserHelper viewHelper = new UserHelper();
		ViewUserTS.exceute(viewHelper, user);
		
		if(user==null || user.isEmpty() || pass==null || pass.isEmpty() ) {
			request.setAttribute("message", "Please enter both a username and a password.");
			request.getRequestDispatcher("WEB-INF/jsp/fail.jsp").forward(request, response);
		} else if(pass.equals(viewHelper.getPassWord())) {
			request.setAttribute("message", "Successfully logged in.");
			request.getSession(true).setAttribute("login", user);
			request.getRequestDispatcher("WEB-INF/jsp/success.jsp").forward(request, response);
			
		} else {
			request.setAttribute("message", "I do not recognize that username and password combination.");
			request.getRequestDispatcher("WEB-INF/jsp/fail.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CalculateSimpleInterest;

/**
 * Servlet implementation class getPrinAmt
 */
@WebServlet("/getPrinAmt")
public class getPrinAmt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPrinAmt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Forward prin amount to the APR Rate jsp
		String userPrinAmt = request.getParameter("prinAmt");
		
		
		HttpSession mySession = request.getSession();
		mySession.setAttribute("pr1", userPrinAmt);
		
		//response.sendRedirect("/aprRate.jsp");
		getServletContext().getRequestDispatcher("/aprRate.jsp").forward(request, response);
	}

}

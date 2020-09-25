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
 * Servlet implementation class getYearCount
 */
@WebServlet("/getYearCount")
public class getYearCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public getYearCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession mySession = request.getSession();
		String userPrin = mySession.getAttribute("pr1").toString();
		String userAPR = mySession.getAttribute("apr1").toString();

		String userYears = request.getParameter("yearCount");
		// mySession.setAttribute("yr1", userYears);

		double pr = Double.parseDouble(userPrin);
		double apr = Double.parseDouble(userAPR);
		int yr = Integer.parseInt(userYears);

		CalculateSimpleInterest myConvertedValue = new CalculateSimpleInterest(pr, apr, yr);
		request.setAttribute("ResultsDisplay", myConvertedValue);

		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);

	}

}

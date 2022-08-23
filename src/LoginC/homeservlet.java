package LoginC;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/homeservlet")
public class homeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public homeservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		String usertype = request.getParameter("type");
		System.out.println(username);
		System.out.println(password);
		System.out.println(usertype);
		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		session.setAttribute("usertype", usertype);

		if (usertype.equals("student")) {

			RequestDispatcher rd = request.getRequestDispatcher("student.jsp");
			rd.forward(request, response);

		} else if (usertype.equals("teacher")) {
			RequestDispatcher rd = request.getRequestDispatcher("teacher.jsp");
			rd.forward(request, response);

		} else {
			request.setAttribute("msg", "<font color=\"red\">TYPE IS NOT CORRECT..</font>");
			RequestDispatcher rd = request.getRequestDispatcher("home.jsp");

			rd.forward(request, response);

		}
	}

}

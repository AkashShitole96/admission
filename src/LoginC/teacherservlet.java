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
 * Servlet implementation class teacherservlet
 */
@WebServlet("/teacherservlet")
public class teacherservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public teacherservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String youname=request.getParameter("youname");
		String fathername=request.getParameter("fathername");
		String mothername=request.getParameter("mothername");
		String aadhar=request.getParameter("aadhar");
		String phoneno=request.getParameter("phoneno");
		String email=request.getParameter("email");
		String dateofbirth=request.getParameter("dateofbirth");
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		String dist=request.getParameter("dist");
		
		HttpSession session=request.getSession();
		session.setAttribute("youname", youname);
		session.setAttribute("fathername", fathername);
		session.setAttribute("mothername", mothername);
		session.setAttribute("aadhar", aadhar);
		session.setAttribute("phoneno", phoneno);
		session.setAttribute("email", email);
		session.setAttribute("dateofbirth", dateofbirth);
		session.setAttribute("state", state);
		session.setAttribute("city", city);
		session.setAttribute("dist", dist);
		
		RequestDispatcher rd = request.getRequestDispatcher("teacherpreview.jsp");
		rd.forward(request, response);
	}

}

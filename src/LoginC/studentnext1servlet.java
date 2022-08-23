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
 * Servlet implementation class studentnext1servlet
 */
@WebServlet("/studentnext1servlet")
public class studentnext1servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentnext1servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String preclgname=request.getParameter("preclgname");
		String medium=request.getParameter("medium");
		String percentage=request.getParameter("percentage");
		String parentmobile=request.getParameter("parentmobile");
		String address=request.getParameter("address");
		
		HttpSession session=request.getSession();
		session.setAttribute("preclgname", preclgname);
		session.setAttribute("medium", medium);
		session.setAttribute("percentage", percentage);
		session.setAttribute("parentmobile", parentmobile);
		session.setAttribute("address", address);
		
		RequestDispatcher rd=request.getRequestDispatcher("studentpreview.jsp");
		rd.forward(request, response);
		
	}

}

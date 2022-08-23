package LoginC;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import LoginC.DbUtil;

/**
 * Servlet implementation class studentDB
 */
@WebServlet("/studentDB")
public class studentDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public studentDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Statement statement = DbUtil.giveStatement();
		HttpSession session=request.getSession();
		
		
		
		String youname=session.getAttribute("youname").toString();
		String fathername=session.getAttribute("fathername").toString();
		String mothername=session.getAttribute("mothername").toString();
		String aadhar=session.getAttribute("aadhar").toString();
		String phoneno=session.getAttribute("phoneno").toString();
		String email=session.getAttribute("email").toString();
		String dateofbirth=session.getAttribute("dateofbirth").toString();
		String state=session.getAttribute("state").toString();
		String city=session.getAttribute("city").toString();
		String dist=session.getAttribute("dist").toString();
		String previousclgname=session.getAttribute("preclgname").toString();
		String medium=session.getAttribute("medium").toString();
		String percentage=session.getAttribute("percentage").toString();
		String parentmobile=session.getAttribute("parentmobile").toString();
		String address=session.getAttribute("address").toString();
		
		
		
		
		request.setAttribute("youname", youname);
		request.setAttribute("fathername", fathername);
		request.setAttribute("mothername", mothername);
		request.setAttribute("aadhar", aadhar);
		request.setAttribute("phoneno", phoneno);
		request.setAttribute("email", email);
		request.setAttribute("dateofbirth", dateofbirth);
		request.setAttribute("state", state);
		request.setAttribute("city", city);
		request.setAttribute("dist", dist);
		
		session.setAttribute("preclgname", previousclgname);
		session.setAttribute("medium", medium);
		session.setAttribute("percentage", percentage);
		session.setAttribute("parentmobile", parentmobile);
		session.setAttribute("address", address);
		
		

		String sql = "insert into student1 (youname,fathername,mothername,addhar,phoneno,email,dateofbirth,state,city,dist,preclgname,medium,percentage,parentmobile,address)"
				+ " values ('"+youname+"','" + fathername + "', '"
				+ mothername + "','" + aadhar + "','" + phoneno + "','"+ email +"'"
						+ ",'"+ dateofbirth +"','"+ state +"','"+ city +"','"+ dist +"','"+previousclgname+"','"+medium+"','"+percentage+"','"+parentmobile+"','"+address+"') ";
		System.out.println(sql);
		int rowsupdated = 0;
		try {
			rowsupdated = statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (rowsupdated == 1) {
			request.setAttribute("msg", "<font color=\"green\">Data is saved..</font>");
			RequestDispatcher rd = request.getRequestDispatcher("studentpreview.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("msg", "<font color=\"orange\">Data not saved..</font>");
			RequestDispatcher rd = request.getRequestDispatcher("studentpreview.jsp");
			rd.forward(request, response);
		}
		
	}
	}



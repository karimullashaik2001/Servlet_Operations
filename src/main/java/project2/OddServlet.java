package project2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OddServlet
 */
public class OddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(request.getParameter("v1"));
		PrintWriter pw=response.getWriter();
		if(n%2>0)
		{
			response.setContentType("text/html");
			pw.println(n+" is Odd <br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
		else
		{
			response.setContentType("text/html");
			pw.println(n+" is Not Odd <br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
	}

}

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
 * Servlet implementation class PrimeNumberServlet
 */
public class PrimeNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeNumberServlet() {
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
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count<=2)
		{
			response.setContentType("text/html");
			pw.println(n+" is a Prime Number <br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
		else
		{
			response.setContentType("text/html");
			pw.println(n+" is not a Prime Number <br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
	}

}

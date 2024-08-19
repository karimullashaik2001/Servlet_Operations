package project2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FibonacciServlet
 */
public class FibonacciServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FibonacciServlet() {
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
		int a=0;
		int b=1;
		int c;
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print(a+" "+b+" ");
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			pw.print(c+" ");
		}
		RequestDispatcher rd=request.getRequestDispatcher("input.html");
		rd.include(request, response);
	}

}

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
 * Servlet implementation class PalindromeServlet
 */
public class PalindromeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PalindromeServlet() {
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
		response.setContentType("text/html");
		int num=n;
		int sum=0;
		int rem;
		while(num!=0)
		{
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		if(sum==n)
		{
			pw.println(n+" is Palindrome");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
		else
		{
			pw.println(n+" is Not Palindrome");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
	}

}

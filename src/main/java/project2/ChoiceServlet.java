package project2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChoiceServlet
 */
public class ChoiceServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public ChoiceServlet() 
    {
        // TODO Auto-generated constructor stub
    }
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
	}
	public void destroy() 
	{
		// TODO Auto-generated method stub
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("s1");
		if(s1.equals("Odd"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("odd");
			rd.forward(request, response);
		}
		else if(s1.equals("Even"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("even");
			rd.forward(request, response);
		}
		else if(s1.equals("PrimeNumber"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("primenumber");
			rd.forward(request, response);
		}
		else if(s1.equals("ArmStrong"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("armstrong");
			rd.forward(request, response);
		}
		else if(s1.equals("Fibonacci"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("fibonacci");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("palindrome");
			rd.forward(request, response);
		}
	}

}

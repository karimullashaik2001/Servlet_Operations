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
 * Servlet implementation class ArmStrongServlet
 */
public class ArmStrongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArmStrongServlet() {
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
		int s=n;
		int sum=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(s==sum)
		{
			response.setContentType("text/html");
			pw.println(s+" is ArmStromg <br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
		else
		{
			response.setContentType("text/html");
			pw.println(s+" is Not ArmStromg <br><br>");
			RequestDispatcher rd=request.getRequestDispatcher("input.html");
			rd.include(request, response);
		}
	}

}

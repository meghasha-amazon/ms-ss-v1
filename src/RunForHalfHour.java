

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RunForHalfHour
 */
@WebServlet("/RunForHalfHour")
public class RunForHalfHour extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RunForHalfHour() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer j;
		Integer num = 100;
		Double fact = 1.00;
		for (j = 0; j < 300000000; j++) {
			num = 100;
			 fact = 1.00;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
		}
		PrintWriter out = response.getWriter();
        out.print("<html><body><h1 align='left'>" + "Factorial of " +
        num.toString() + " is: " + fact.toString() + ". this was run for " + j +" many times. "+"</h1></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

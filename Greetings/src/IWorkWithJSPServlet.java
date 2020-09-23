

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IWorkWithJSPServlet
 */
@WebServlet("/greetingsServletNew")
public class IWorkWithJSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IWorkWithJSPServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String counter = (String) request.getSession().getAttribute("counter");
		if (counter == null) {
			counter = "1";
		} else {
			Integer counterInt = Integer.parseInt(counter);
			counterInt++;
			counter = counterInt.toString();
		}
		
		request.getSession().setAttribute("counter", counter);
		
		String msg = "Hello " + request.getParameter("name") + "!";
		
		msg += "\nYou visited " + counter + " times!!";
		
		request.setAttribute("personalizedGreeting", msg);
		
		RequestDispatcher rs = request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/NewGreetingsJSP.jsp");

		rs.forward(request, response);
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

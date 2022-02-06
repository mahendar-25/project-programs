import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// Set the content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// Get the userName from the request
		String uname = request.getParameter("Username");
		String upassword = request.getParameter("Password");
		// Get a reference to the HttpSession object
		HttpSession theSession = request.getSession();
		// Validateor check the username
		if(uname.trim().equals("java") && upassword.trim().equals("eclipse@123")) {
	
		theSession.setAttribute("Username", uname);
		theSession.setAttribute("Password", upassword);
		// back to the Dashboard
		response.sendRedirect("dashboard");
		}
		else {
		out.println("Invalid Username or Password...");
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);
		}
		}
	}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class FirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));
		
		String firstname = request.getParameter("firstname");
		
		String lastname = request.getParameter("lastname");
		
		String username = request.getParameter("username");
		
		String email = request.getParameter("email");
		
		String pass = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		
		pw.println("id :" +id);
		
		pw.println("firstname :" +firstname);
		
		pw.println("lastname  :" +lastname);
		
		pw.println("username :" + username);
		
		pw.println("email :" +email);

		pw.println("password :" + pass);
		
	}
}

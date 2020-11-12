package fr.geoffroy.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet({ "/Third", "/disconnect" })
public class ThirdServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
			
		if(! session.equals(null)) {
		if (request.getServletPath().equals("/third")) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/third.jsp").forward(request, response);
		}
		}
		else {
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

		}
		
		if (!request.getServletPath().equals("/third")) {{
		
			session.invalidate();
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		}
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

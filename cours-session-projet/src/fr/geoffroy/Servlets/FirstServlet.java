package fr.geoffroy.Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.geoffroy.models.Personne;
import fr.geoffroy.services.PersonneService;

/**
 * Servlet implementation class firstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PersonneService personneService = new PersonneService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
  	
  
  // TODO Auto-generated method stub
		if( session.isNew()) {
 
		this.getServletContext().getRequestDispatcher("/WEB-INF//first.jsp").forward(request, response);
		}
		else {
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		Personne personne = new Personne(nom, prenom);

	
	if (personneService.findByNomAndPrenom(nom, prenom)) {
			session.setAttribute("perso", personne);

			this.getServletContext().getRequestDispatcher("/WEB-INF/first.jsp").forward(request, response);

		} else {
			request.setAttribute("error", "cet utilisateur n'existe pas");
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			
		}

	}

}

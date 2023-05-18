package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelLogin;

@WebServlet("/ServletLogin") // mapeamento da URL que vem da tela
public class ServletLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ServletLogin() {
		super();
	}

	// recebe os dados enviados pela URL em parametros
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	// recebe os dados enviados por um formulario
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) {
			ModelLogin modelLogin = new ModelLogin();
			modelLogin.setLogin(login);
			modelLogin.setSenha(senha);
			
			if(modelLogin.getLogin().equals("admin") 
					&& modelLogin.getSenha().equals("admin")) {
				
				request.getSession().setAttribute("usuario", modelLogin);//Colocando o usuario na sessao
				
				RequestDispatcher redirecionar = request.getRequestDispatcher("principal/principal.jsp");
				redirecionar.forward(request, response);
				
			} else {
				
				RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp"); 
				request.setAttribute("msg", "Informe o login e senha novamente");
				redirecionar.forward(request, response);
			}
		} else {
			/*
			 * FIXME Se caso der senha incorreta, temos que 'despachar' ou 
			 * como o nome ja diz, redirecionar para outra página/local.
			 * Atraves do 'Dispatcher' fazemos o redirecionamento. 
			 */
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Informe o login e senha novamente");
			redirecionar.forward(request, response);
		}
	}
}
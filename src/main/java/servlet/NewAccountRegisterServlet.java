package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.newAccountDTO;

/**
 * Servlet implementation class NewAccountRegisterServlet
 */
@WebServlet("/NewAccountRegisterServlet")
public class NewAccountRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAccountRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("UTF-8");
			
	       
			String mail = request.getParameter("email");
			String pw = request.getParameter("pw");
			String pw2 = request.getParameter("pw2");
			String name = request.getParameter("name");
			String furigana = request.getParameter("furigana");
			
			newAccountDTO account = new newAccountDTO(-1, mail, null, pw, null,name,furigana);
			
			
			
			HttpSession session = request.getSession();
			
			
			session.setAttribute("input_data", account);
			
			String path = "";
			if(pw.equals(pw2)) {
			     path = "WEB-INF/view/confirm.jsp";
			}else {
				 path = "WEB-INF/view/new_account.jsp?error=1";
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(path);
			dispatcher.forward(request, response);		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

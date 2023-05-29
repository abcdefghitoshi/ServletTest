package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/servlet/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("utf-8");

       String info = request.getParameter("info");
       String mails="";
       String[] mail= request.getParameterValues("mail");
		
       //チェックボックスの表示処理
		if(mail!=null) {
		for(int i=0;i<mail.length;i++ ) {
			mails=mails+"「"+mail[i]+"」"+" ";
		}request.setAttribute("mails", mails);
			
		}else{
			mails="選択なし";
			request.setAttribute("mails", mails);
		}
		
		//資料請求の選択による、遷移先JSPファイル指定
        if(info.equals("No")){
			
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/contact2.jsp");
			rd.forward(request, response);
			
        } else {
        	RequestDispatcher rd = request.getRequestDispatcher("/jsp/contact3.jsp");
			rd.forward(request, response);
        }
	      

	    
		
        
	}
	
	    

}

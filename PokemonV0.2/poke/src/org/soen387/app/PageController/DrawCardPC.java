package org.soen387.app.PageController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.soen387.app.TransactionScript.DrawCardTS;
import org.soen387.app.TransactionScript.ListGamesTS;
import org.soen387.app.TransactionScript.UploadDeckTS;
import org.soen387.app.common.Constants;
import org.soen387.app.viewHelper.GameHelper;
import org.soen387.app.viewHelper.ViewHelper;


@WebServlet("/DrawCard")
public class DrawCardPC extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DrawCardPC() {
        super();
        // TODO Auto-generated constructor stub
    }
	private GameHelper viewHelper;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		viewHelper = new GameHelper();
		String gameId = (String)request.getAttribute("gameId");
		String loginId = (String)request.getSession(true).getAttribute("loginId");	
		String deckId = loginId;
		
		ListGamesTS.exceute(viewHelper, loginId);
		
		String thisGameId = viewHelper.getId();
		
		if(loginId == null) {
			PrintWriter writer = response.getWriter();
			writer.write(Constants.FAILUREJSON);
			writer.close();
		}
		
		else if(!gameId.equals(thisGameId)) {
			PrintWriter writer = response.getWriter();
			writer.write(Constants.FAILUREJSON);
			writer.close();
		}
		
		if(DrawCardTS.exceute(deckId)) {
			
			PrintWriter writer = response.getWriter();
			writer.write(Constants.SUCCESSJSON);
			writer.close();
		}else {
			
			PrintWriter writer = response.getWriter();
			writer.write(Constants.FAILUREJSON);
			writer.close();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

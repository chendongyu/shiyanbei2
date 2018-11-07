package org.soen387.app.PageController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.soen387.app.TransactionScript.ListPlayerTS;
import org.soen387.app.TransactionScript.playerChallengeTS;
import org.soen387.app.common.CommonUtil;
import org.soen387.app.common.Constants;
import org.soen387.app.viewHelper.UserHelper;
import org.soen387.app.viewHelper.ViewHelper;

/**
 * Servlet implementation class ListPlayer
 */
@WebServlet("/ChallengePlayer")
public class updateChallengerPC extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//String player1_id = req.getParameter("challengerID");
		String player1_id = (String)req.getSession(true).getAttribute("loginId");		
		String player2_id = req.getParameter("challengeeID");
		String status = "0";
		if(player2_id == null) {
			String jsonStr = Constants.FAILUREJSON;
			PrintWriter writer = resp.getWriter();
			writer.write(jsonStr);
			writer.close();
		} else if(playerChallengeTS.exceute(player1_id, player2_id, status)){
			String jsonStr =Constants.FAILUREJSON; // convert to json
			PrintWriter writer = resp.getWriter();
			writer.write(jsonStr);
			writer.close();
		} else {
			playerChallengeTS.exceute(player1_id, player2_id, status);
			String jsonStr =Constants.SUCCESSJSON; // convert to json
			PrintWriter writer = resp.getWriter();
			//test
			writer.write(jsonStr);
			writer.close();
		}
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}

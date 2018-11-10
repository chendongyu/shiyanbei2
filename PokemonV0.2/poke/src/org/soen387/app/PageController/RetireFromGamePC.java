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
import org.soen387.app.TransactionScript.updateChallengeStatusTS;
import org.soen387.app.common.CommonUtil;
import org.soen387.app.common.Constants;
import org.soen387.app.viewHelper.UserHelper;
import org.soen387.app.viewHelper.ViewHelper;


@WebServlet("/Retire")
public class RetireFromGamePC extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String status = "2";
		String challengeID = req.getParameter("challengeID");
		
		
		
		
		
		if(challengeID == null) {
			String jsonStr = Constants.FAILUREJSON_ACCEPTCHALLENGE;
			PrintWriter writer = resp.getWriter();
			writer.write(jsonStr);
			writer.close();
		} else if(updateChallengeStatusTS.exceute(challengeID, status)){
			String jsonStr =Constants.FAILUREJSON_ACCEPTCHALLENGE; // convert to json
			PrintWriter writer = resp.getWriter();
			writer.write(jsonStr);
			writer.close();
		} else {
			updateChallengeStatusTS.exceute(challengeID, status);
			String jsonStr =Constants.SUCCESSJSON_ACCEPTCHALLENGE; // convert to json
			PrintWriter writer = resp.getWriter();
			writer.write(jsonStr);
			writer.close();
		}
		
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	
}

package org.soen387.app.rdg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.soen387.app.common.CommonUtil;

public class PlayRDG extends BaseRDG {

	private String userId;
	
	private String handSize;
	
	private String discardSize;

	private String deckSize;
	
	private String status;
	
	
	
	public PlayRDG() {
		super();
	}
	


	public PlayRDG( String status,String userId, String handSize, String deckSize, String discardSize) {
		super();
		this.userId = userId;
		this.handSize = handSize;
		this.deckSize = deckSize;
		this.discardSize = discardSize;
		this.status = status;
	}


	public static PlayRDG findAll(String userId)
	{
		PlayRDG PlayRDG = null;
		
		try {
			ResultSet resultSet = excuteSelSql("SELECT USER.STATUS, SUM(INHAND.CARD_ID) AS HANDSIZE, SUM(DECK1.CARD_ID) AS DECKSIZE, SUM(DECK2.CARD_ID) AS DISCARDSIZE FROM USER INNER JOIN INHAND ON USER.USER_ID = INHAND.USER_ID INNER JOIN DECK DECK1 ON DECK1.DECK_ID = USER.USER_ID AND DECK1.STATUS = 0 INNER JOIN DECK DECK2 ON DECK2.DECK_ID = USER.USER_ID AND DECK2.STATUS = 2 WHERE USER.USER_ID = ?\r\n", 
					userId);
			while (resultSet.next()) {
				PlayRDG = new PlayRDG(resultSet.getString(1),userId,resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
			}
		return PlayRDG;
		
	
		
	}

	

	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getHandSize() {
		return handSize;
	}



	public void setHandSize(String handSize) {
		this.handSize = handSize;
	}



	public String getDiscardSize() {
		return discardSize;
	}



	public void setDiscardSize(String discardSize) {
		this.discardSize = discardSize;
	}



	public String getDeckSize() {
		return deckSize;
	}



	public void setDeckSize(String deckSize) {
		this.deckSize = deckSize;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	


}

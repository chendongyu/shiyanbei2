package org.soen387.app.viewHelper;

import org.soen387.app.rdg.BenchRDG;

public class PlayHelper implements ViewHelper{

	private String userId;
	
	private String handSize;

	private String deckSize;
	
	private String status;
	
	private String discardSize;
	
	private BenchRDG[] benchRDG;
	


	public String getUserId() {
		return userId;
	}




	public void setUserId(String userId) {
		this.userId = userId;
	}





	public String getHandSize() {
		return handSize;
	}



	public String getDiscardSize() {
		return discardSize;
	}




	public void setDiscardSize(String discardSize) {
		this.discardSize = discardSize;
	}


	public void setHandSize(String handSize) {
		this.handSize = handSize;
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







	public BenchRDG[] getBenchRDG() {
		return benchRDG;
	}




	public void setBenchRDG(BenchRDG[] benchRDG) {
		this.benchRDG = benchRDG;
	}



	public void changeBenchToJSON() {
		
	}


	public String toJson() {
		
		StringBuffer playJson = new StringBuffer();
		playJson.append("{\"status\":\"");
		playJson.append(status);
		playJson.append("\",\"handSize\":\"");
		playJson.append(handSize);
		playJson.append("\",\"deckSize\":\"");
		playJson.append(deckSize);
		playJson.append("\",\"discardSize\":\"");
		playJson.append(discardSize);
		
		
		playJson.append("\"}");
		return playJson.toString();
	}
}

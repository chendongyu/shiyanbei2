package org.soen387.app.viewHelper;

import java.util.List;

import org.soen387.app.common.CommonUtil;
import org.soen387.app.rdg.DeckRDG;

public class BoardHelper implements ViewHelper {

	private String id;
	
	private String challenger;
	
	private String challengee;
	
	private List<DeckRDG> challengerDeck;
	
	private String gameId;
	
	private List<DeckRDG> challengeeDeck;
	@Override
	public String toJson() {
		
		StringBuffer playJson = new StringBuffer();
		
		playJson.append("{\"board\":{");
		if(!CommonUtil.isEmpty(id)) {
			playJson.append("\"id\":");
			playJson.append(id);
			playJson.append(",\"players\":[");
			playJson.append(challenger);
			playJson.append(",");
			playJson.append(challengee);
			playJson.append("]");
			playJson.append(",\"decks\":[");
			playJson.append(challenger);
			playJson.append(",");
			playJson.append(challengee);
			playJson.append("]");
			playJson.append(",\"play\":{");
			playJson.append("\"");
			playJson.append(challenger);
			playJson.append("\":{");
			playJson.append("\"handsize\":");
			playJson.append("0");//TODO 改为手牌数
			playJson.append(",\"decksize\":");
			playJson.append(challengerDeck.size());
			playJson.append("},");	
			playJson.append("\"");
			playJson.append(challengee);
			playJson.append("\":{");
			playJson.append("\"handsize\":");
			playJson.append("0");//TODO 改为手牌数
			playJson.append(",\"decksize\":");
			playJson.append(challengeeDeck.size());
			playJson.append("},");
			playJson.append("}");

		}
		playJson.append("}");
		return playJson.toString();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChallenger() {
		return challenger;
	}

	public void setChallenger(String challenger) {
		this.challenger = challenger;
	}

	public String getChallengee() {
		return challengee;
	}

	public void setChallengee(String challengee) {
		this.challengee = challengee;
	}
	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public List<DeckRDG> getChallengerDeck() {
		return challengerDeck;
	}

	public void setChallengerDeck(List<DeckRDG> challengerDeck) {
		this.challengerDeck = challengerDeck;
	}

	public List<DeckRDG> getChallengeeDeck() {
		return challengeeDeck;
	}

	public void setChallengeeDeck(List<DeckRDG> challengeeDeck) {
		this.challengeeDeck = challengeeDeck;
	}

	

	
}

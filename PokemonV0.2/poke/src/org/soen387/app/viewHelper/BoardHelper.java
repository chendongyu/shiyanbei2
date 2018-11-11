package org.soen387.app.viewHelper;

import java.util.List;

import org.soen387.app.common.CommonUtil;
import org.soen387.app.rdg.DeckRDG;

public class BoardHelper implements ViewHelper {

	private String[] players;
	
	private String[] decks;
	
	private List<PlayHelper> playHelpers;
	
	@Override
	public String toJson() {
		
		StringBuffer playJson = new StringBuffer();
		
		playJson.append("{\"board\":{\"players\":[");
		for(String s : players) {
			playJson.append(s);
			playJson.append(",");
		}
		playJson.deleteCharAt(playJson.length()-1);
		playJson.append("],\"decks\":[");
		for(String s : decks) {
			playJson.append(s);
			playJson.append(",");
		}
		playJson.deleteCharAt(playJson.length()-1);
		playJson.append("],\"play\": {");
		for(int index=0; index<playHelpers.size(); index++) {
			playJson.append(playHelpers.get(index).toJson());
			playJson.append(",");
		}
		playJson.deleteCharAt(playJson.length()-1);
		playJson.append("}}}");
		return playJson.toString();
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	public String[] getDecks() {
		return decks;
	}

	public void setDecks(String[] decks) {
		this.decks = decks;
	}

	public List<PlayHelper> getPlayHelpers() {
		return playHelpers;
	}

	public void setPlayHelpers(List<PlayHelper> playHelpers) {
		this.playHelpers = playHelpers;
	}
}

package org.soen387.app.TransactionScript;

import java.util.List;


import org.soen387.app.rdg.DeckRDG;

public class DrawCardTS {

	public static boolean exceute(String deckId) {
		
		
		DeckRDG.updateCardStatus(deckId);
		
	
		return true;
		
		
		
	}
	
}

package org.soen387.app.rdg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.soen387.app.common.CommonUtil;

public class DeckRDG extends BaseRDG{

	private String deckId;
	
	private String name;
	
	private String type;
	
	private String order;
	
	private String status;
	
	private String cardId;

	public DeckRDG() {
		
	}
	
	public DeckRDG(String name,String type,String cardId) {
		
		this.name = name;
		this.type = type;
		this.cardId = cardId;
		
	}
	
	public static int delete(String deckId) {
		
		if(CommonUtil.isEmpty(deckId)) {
			return 0;
		}
		
		int num = excuteInsertSql("UPDATE deck SET DECK_ID = '' WHERE DECK_ID = ?",deckId);
		
		return num;
	}
	
	public static int insert(DeckRDG deckRDG) {

		if(deckRDG == null) {
			return 0;
		}
		
		int num = excuteInsertSql("INSERT INTO DECK(DECK.DECK_ID, DECK.NAME, "
				+ "DECK.TYPE, DECK.STATUS, DECK.ORDER) VALUES(?,?,?,?,?)",
				deckRDG.getDeckId(),deckRDG.getName(),deckRDG.getType(),0,deckRDG.getOrder());
	
		return num;
	}
	
	public static List<DeckRDG> findAll(String deckId){
		
		List<DeckRDG> userList = new ArrayList<DeckRDG>();
		
		ResultSet resultSet = excuteSelSql("SELECT DK.NAME,DK.TYPE,DK.CARD_ID "
				+ "FROM DECK DK WHERE DK.DECK_ID = ? AND DK.STATUS <> 1 ORDER BY DK.ORDER ",deckId);
		
		try {
			while(resultSet.next()) {
				
				DeckRDG deckRDG = new DeckRDG(resultSet.getString(1),
						resultSet.getString(2),resultSet.getString(3));
				userList.add(deckRDG);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList;
	}
	
	/**
	 * TODO !!!!
	 * @param deckId
	 * @param rolNum
	 * @return
	 */
	public static List<DeckRDG> getByRolNum(String deckId,int rolNum){
		
		 List<DeckRDG> userList = new ArrayList<DeckRDG>();
		
		ResultSet resultSet = excuteSelSql("SELECT DK.NAME,DK.TYPE,DK.CARD_ID FROM DECK DK "
				+ "WHERE DK.DECK_ID = ? AND DK.STATUS <> 1 ORDER BY DK.ORDER limit 0,?",deckId,rolNum);
		
		try {
			while(resultSet.next()) {
				
				DeckRDG deckRDG = new DeckRDG(resultSet.getString(1),
						resultSet.getString(2),resultSet.getString(3));
				userList.add(deckRDG);
				
				excuteInsertSql("UPDATE DECK SET STATUS = 1 WHERE CARD_ID = ?;",resultSet.getString(3));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userList;
	}

	public String getDeckId() {
		return deckId;
	}

	public void setDeckId(String deckId) {
		this.deckId = deckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
}

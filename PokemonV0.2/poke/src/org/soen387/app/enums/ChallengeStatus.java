package org.soen387.app.enums;

public enum ChallengeStatus {
	OPEN(1),REFUSED(2),WITHDRAWN(3),ACCEPTED(4);
	
	private int value;
	
	ChallengeStatus(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}

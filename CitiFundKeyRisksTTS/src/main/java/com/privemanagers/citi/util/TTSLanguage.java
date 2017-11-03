package com.privemanagers.citi.util;

public enum TTSLanguage {

	ENG(1),CAN(2),MAN(3);
	
	private int langType;
	
	private TTSLanguage(int langType){
		this.langType = langType;
	}

	public int getValue(){
		return this.langType;
	}
}

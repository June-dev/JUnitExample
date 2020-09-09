package com.wordboundary;

import java.text.BreakIterator;

public class WordBoundaryIterator {
	public static final int DONE = BreakIterator.DONE;
	private static final BreakIterator iterator = BreakIterator.getWordInstance();
	private static final WordBoundaryIterator INSTANCE = new WordBoundaryIterator();
	
	public static WordBoundaryIterator getInstacne() {
		return INSTANCE;
	}
	
	//가장 최근에 호출된 next()가 리턴한 인덱스를 리턴
	public int current() {
		return iterator.current();
	}
	
	//지정된 offset 다음에 나오는 단어의 경계에 대한 인덱스 리턴
	public int following(int offset) {
		return iterator.following(offset);
	}
	
	//현재 경계의 다음 경계를 리턴하고, 마지막에는 DONE을 리턴
	public int next() {
		return iterator.next();
	}
	
	//작업할 문자열 설정
	public void setText(String text) {
		iterator.setText(text);
	}
	
	
}

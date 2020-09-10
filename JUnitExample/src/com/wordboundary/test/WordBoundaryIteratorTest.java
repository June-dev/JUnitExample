package com.wordboundary.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wordboundary.WordBoundaryIterator;

class WordBoundaryIteratorTest {

	private WordBoundaryIterator iterator;

	@BeforeEach
	protected void setUp() throws Exception {
		iterator = WordBoundaryIterator.getInstacne();
	}

	@Test
	void testCurrent() {
		String text = "aaa bbb";
		
		iterator.setText(text);
		assertEquals(0, iterator.current());
		System.out.println(iterator.DONE);
		
		iterator.next();
		assertEquals(3, iterator.current());
		System.out.println(iterator.DONE);
		
		iterator.next();
		assertEquals(4, iterator.current());
		System.out.println(iterator.DONE);
		
		iterator.next();
		assertEquals(7, iterator.current());
		System.out.println(iterator.DONE);
		
		iterator.next();
		assertEquals(7, iterator.current());
		System.out.println(iterator.DONE);
		
		iterator.next();
		assertEquals(7, iterator.current());
		System.out.println(iterator.DONE);		
	}

	@Test
	void testFollowing() {
		String text = "aaa bbb";
		iterator.setText(text);
		assertEquals(3, iterator.following(1));
		assertEquals(3, iterator.current());
		assertEquals(4, iterator.next());
		
	}

	@Test
	void testNext() {
	}

}

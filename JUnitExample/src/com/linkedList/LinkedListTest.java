package com.linkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void test() {
		LinkedList numbers = new LinkedList();
		
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		
		numbers.addLast(100);
		System.out.println(numbers.toString());
	}

}

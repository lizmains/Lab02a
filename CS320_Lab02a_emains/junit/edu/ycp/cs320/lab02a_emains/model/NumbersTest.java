package edu.ycp.cs320.lab02a_emains.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_emains.model.Numbers;

public class NumbersTest {
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testSetFirst() {
		model.setFirst(10);
		assertEquals(10, model.getFirst(), .0);
	}
	
	@Test
	public void testSetSecond() {
		model.setSecond(100);
		assertEquals(100, model.getSecond(), .0);
	}
	
	@Test
	public void testSetThird() {
		model.setThird(15);
		assertEquals(15, model.getThird(), .0);
	}
	
	@Test
	public void testSetResults() {
		model.setResult((double) 125);
		assertEquals(125, model.getResult(), .0);
	}
}

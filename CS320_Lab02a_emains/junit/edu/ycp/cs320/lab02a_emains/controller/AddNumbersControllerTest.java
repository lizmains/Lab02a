package edu.ycp.cs320.lab02a_emains.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_emains.controller.NumbersController;
import edu.ycp.cs320.lab02a_emains.model.Numbers;

public class AddNumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		controller.setModel(model);
		
		model.setFirst(10);
		model.setSecond(2);
		model.setThird(2);
		
	}
	
	@Test
	public void testAddNumbers() {
		double total = controller.add();
		assertEquals(14, total, .0);
	}
	
	@Test
	public void testMultiplyNumbers() {
		double total = controller.multiply();
		assertEquals(20, total, .0);
	}
}

package edu.esprit.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import edu.esprit.SimpleCalculator;

public class SimpleCalculatorTest {

	@Test
	public void test() {
		
		SimpleCalculator sc = new SimpleCalculator();
		
		
		assertEquals(10, sc.add(Arrays.asList(1,2,3,4)), 0);
		
		
	}

}

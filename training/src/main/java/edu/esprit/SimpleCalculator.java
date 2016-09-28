package edu.esprit;

import java.util.List;

public class SimpleCalculator {

	public int add(List<Integer> ints) {

		return ints.stream().mapToInt(i -> i).sum();

	}

}

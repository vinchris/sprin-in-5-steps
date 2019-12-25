package de.max.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm algorithm;

	public BinarySearchImpl(SortAlgorithm algorithm) {
		super();
		this.algorithm = algorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int sortedNumbers = algorithm.sort(numbers);

		System.out.println(sortedNumbers);
		
		return sortedNumbers;
	}

}

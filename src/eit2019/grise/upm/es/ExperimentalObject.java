package eit2019.grise.upm.es;

import java.util.ArrayList;
import java.util.List;

public class ExperimentalObject {

	public static void main(String[] args) {
		try {
			System.out.println(ExperimentalObject.getPrimeFactorDecomposition(4));		
			System.out.println(ExperimentalObject.getPrimeFactorDecomposition(6));
			System.out.println(ExperimentalObject.getPrimeFactorDecomposition(15));
		} catch (NegativeNumbersNotAllowed e) {
			e.printStackTrace();
		}

	}
	
	public static List<Integer> getPrimeFactorDecomposition(int number) throws NegativeNumbersNotAllowed {
		
		List<Integer> list = new ArrayList<Integer>();
		
		boolean stillDivisible = true;
		
		int divisible = number;
			for(int i = 2; i < number; i++) {
				if(divisible%i == 0) {
					list.add(i);
					divisible = divisible/i;
				}
			}
		if(divisible > 1) {
			list.add(divisible);
		}
			
		return list;
	}

}

/**
 * 
 */
package com.in28mins.oops2.interfaces;

/**
 * @author dstar - this is the class where we gonna use ComplexAlgorithm logic
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// lets assume there are hundreds of lines of code here

		ComplexAlgorithm algorithm = new DummyComplexAlgorithm();

		System.out.println(algorithm.complexAlgorithmMethod(2, 3)); // here we use dummy algorithm

		// to use the real algorithm

		algorithm = new RealComplexAlgorithm();

		System.out.println(algorithm.complexAlgorithmMethod(2, 3));

		// Again assume there are hundreds of lines of code here

	}

}

/**
 * 
 */
package com.in28mins.oops2.interfaces;

/**
 * @author dstar - for simplicity sake, lets consider our real complex logic is
 *         to perform multiplication, which will be done in RealComplexAlgorithm
 *         class, here as a placeholder we are just gonna do some addition
 *         operation here
 *
 */
public class DummyComplexAlgorithm implements ComplexAlgorithm {

	@Override
	public int complexAlgorithmMethod(int a, int b) {
		return a + b;
	}

}

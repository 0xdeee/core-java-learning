/**
 * 
 */
package com.in28mins.oops2.interfaces;

/**
 * @author dstar - this is another excellent use case for interfaces here we
 *         have a project class & it is going to employ a complex algorithm the
 *         team working on project class's progress will be halt untill the
 *         complex alogrithm is delivered by the other team The other team is
 *         going to work on a class called realComplexAlgorithm which implements
 *         ComplexAlgorithm interface
 * 
 *         until they deliver their code, the project team doesn't have to wait,
 *         they can create a DummyComplexAlgorithm class which also implements
 *         ComplexAlgorithm interface and give a dummy placeholder logic for
 *         methods in ComplexAlgorithm interface
 * 
 *         ComplexAlgorithm algorithm = new DummyComplexAlgorithm(), and
 *         continue with our project class code
 * 
 *         once the other team comes up with logic for complex algorithm and
 *         delivers the RealComplexAlgorith class we can make our project call
 *         RealComplexAlgorithm class intead of the fake one we have created as
 *         a placeholder.
 * 
 *         ComplexAlgorithm algorithm = new RealComplexAlgorithm()
 *
 */
public interface ComplexAlgorithm {

	public int complexAlgorithmMethod(int a, int b);

}

package ch.hslu.busod.calculator.api;

/**
 * This interface declare the functionalities of a calculator.
 * @author jsucur
 * @version 1.0
 */
public interface Calculator {

	/**
	 * Returns the sum of the passed values.
	 * @param a the first value
	 * @param b the second value
	 * @return the result of summation
	 */
	double add(double a, double b);
	
	/**
	 * Returns the difference of the passed values.
	 * @param a the first value
	 * @param b the second value
	 * @return the result of the subtraction
	 */
	double sub(double a, double b);
	
	/**
	 * Returns the product of the passed values.
	 * @param a the first value
	 * @param b the second value
	 * @return the result of the multiplication
	 */
	double mul(double a, double b);
	
	/**
	 * Returns the quotient of the passed values.
	 * @param a the first value
	 * @param b the second value
	 * @return the result of the division
	 */
	double div(double a, double b);
}

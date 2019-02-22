package cse360assign2;
/*
 *Author: Brian Moore
 *ClassID 496
 *Assignment #2
 *Program will calculate values based on the called method of either add, subtract,
 *multiply, or divide. Will store a history of the commands in a history variable.
 *Will display the results. 
 */
/**
 * Class constructor <code>Calculator</code> specifying private variable for
 * total and string object to store history. Class contains 6 methods:
 * <code>getTotal, add, subtract,
 * multiply, divide</code> and <code>getHistory</code>.
 * 
 * @see #getTotal()
 * @see #add(int)
 * @see #subtract(int)
 * @see #multiply(int)
 * @see #divide(int)
 * @see #getHistory()
 */
public class Calculator {

	private int total;
	

	public Calculator() {
		total = 0; // not needed - included for clarity
		

	}

	/**
	 * Method <code>getTotal()</code> will return the total value that has been
	 * calculated.
	 * 
	 * @return total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Method <code>add()</code> adds parameter to the existing <code>total</code>
	 * variable. Will concatenate the history variable.
	 * 
	 * @param value
	 */
	public void add(int value) {
		
	}

	/**
	 * Method <code>subtract()</code> subtracts parameter from the existing
	 * <code>total</code> variable. Will concatenate the history variable
	 * 
	 * @param value
	 */
	public void subtract(int value) {
		
	}

	/**
	 * Method <code>multiply</code> multiplies parameter and existing
	 * <code>total</code> together. will concatenate the history variable
	 * 
	 * @param value
	 */
	public void multiply(int value) {
	
	}

	/**
	 * Method <code>divide</code> divides <code>total</code> by the parameter.
	 * Will check for 0 input value and concatenate the history variable in either case
	 * @param value
	 */
	public void divide(int value) {
	
	}

	/**
	 * Method <code>getHistory</code> will return a string of the history of all
	 * actions.
	 * 
	 * @return
	 * 
	 */
	public String getHistory() {
		return "";
	}
}

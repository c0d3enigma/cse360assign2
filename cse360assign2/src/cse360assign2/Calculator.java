package cse360assign2;

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
	 * variable.
	 * 
	 * @param value
	 */
	public void add(int value) {
		total = +value;
	}

	/**
	 * Method <code>subtract()</code> subtracts parameter from the existing
	 * <code>total</code> variable.
	 * 
	 * @param value
	 */
	public void subtract(int value) {
		total = -value;
	}

	/**
	 * Method <code>multiply</code> multiplies parameter and existing
	 * <code>total</code> together.
	 * 
	 * @param value
	 */
	public void multiply(int value) {
		total = total * value;
	}

	/**
	 * Method <code>divide</code> divides <code>total</code> by the parameter.
	 * 
	 * @param value
	 */
	public void divide(int value) {
		if (value != 0) {
			total = total / value;
		} else {
			total = 0;
		}
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

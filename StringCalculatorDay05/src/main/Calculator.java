/**
 * 
 */
package main;

/**
 * @author quynhlt
 * 
 */
public class Calculator {

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}

}

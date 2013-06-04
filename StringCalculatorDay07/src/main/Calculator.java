/**
 * 
 */
package main;

/**
 * @author quynhlt
 * 
 */
public class Calculator {

	private static final String COMMAS = ",";

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else if (number.contains(COMMAS)) {
			String[] tokens = number.split(COMMAS);
			result = toInt(tokens[0]) + toInt(tokens[1]);
		} else {
			result = Integer.parseInt(number);
		}
		return result;
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

}
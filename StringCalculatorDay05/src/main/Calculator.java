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
	private static final String OR = "|";
	private static final String NEWLINE = "\n";
	private static final String SEPARATE = "//";
	private static final int MAXNUMBER = 1000;

	public static void main(String[] args) {
		add("//[@@@]\n1@@@2");
	}

	public static int add(String number) {
		int result = 0;
		if (number.isEmpty()) {
			result = 0;
		} else {
			String[] tokens = getToken(number);
			for (String token : tokens) {
				result += toInt(token);
			}
		}
		return result;
	}

	private static int toInt(String number) {
		int newInt = Integer.parseInt(number);
		if (newInt < 0) {
			throw new RuntimeException("Negatives not allowed");
		} else if (newInt > MAXNUMBER) {
			newInt = 0;
		}
		return newInt;
	}

	private static String[] getToken(String number) {
		if (number.startsWith(SEPARATE)) {
			int startIndex = SEPARATE.length();
			int endIndex = number.indexOf(NEWLINE);
			String newDelim = number.substring(startIndex, endIndex);
			if (newDelim.length() > 0) {
				newDelim = newDelim.replace("[", "").replace("]", "");
			}
			startIndex = (SEPARATE + newDelim + NEWLINE).length();
			String newText = number.substring(startIndex, number.length());
			System.out.println(newText);
			return newText.split(newDelim);
		} else {
			return number.split(COMMAS + OR + NEWLINE);
		}
	}
}

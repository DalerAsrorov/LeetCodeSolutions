package excersises;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *	
 *	For example:
 *
 *	Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
*/

public class AddDigits {
	public int addDigits(int num) {
		int newSum = 0;
		String strToLength = Integer.toString(num);
		int strLength = strToLength.length();
		
		while(strLength > 1) {
			newSum = sumUp(num);
			strLength = Integer.toString(newSum).length();
			num = newSum;
		}
		
		return num;
	}
	
	/*
	 * Get the number and form a sum
	 * of the digits of this number.
	 * Return the final result.
	 */
	public int sumUp(int num) {
		String str = Integer.toString(num);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.charAt(i) + "");
		}
		
		return sum;
	}
}

/**
 * 
 */

/**
 * @author Sandeep LeetCode Question - 258: Add Digits
 *         https://leetcode.com/problems/add-digits/
 *
 */
public class Solution258 {
	public int addDigits(int num) {
		if (num < 10)
			return num;
		else if (num % 9 == 0)
			return 9;
		else
			return num % 9;

	}
}

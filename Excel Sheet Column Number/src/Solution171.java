/**
 * 
 */

/**
 * @author Sandeep LeetCode Question: Excel Sheet Column Number
 *         https://leetcode.com/problems/excel-sheet-column-number/
 * 
 *
 */
public class Solution171 {
	public int titleToNumber(String s) {
		int len = s.length();
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = sum * 26 + (s.charAt(i) - 'A' + 1);
		}
		return sum;
	}
}

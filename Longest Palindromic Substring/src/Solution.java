/**
 * 
 */

/**
 * @author Sandeep
 *
 */
public class Solution {
	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return s;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {
			String oddPal = findLengthofPalindrome(s, i, i);
			if (longest.length() < oddPal.length()) {
				longest = oddPal;
			}

			String evenPal = findLengthofPalindrome(s, i, i + 1);
			if (longest.length() < evenPal.length()) {
				longest = evenPal;
			}
		}
		return longest;

	}

	private String findLengthofPalindrome(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
}

/**
 * 
 */

/**
 * @author Sandeep
 * 
 *         LeetCode: Question 242: Valid Anagram -
 *         https://leetcode.com/problems/valid-anagram/
 *
 */
public class Solution242 {

	// Trick is to return false if the lengths of the strings are different.
	// Otherwise use a 256 size int array and keep increasing the count of the
	// index to which the string character belongs.
	public boolean isAnagram(String s, String t) {
		if (s == null)
			return (t == null);
		if (t == null || s.length() != t.length())
			return false;

		int[] arr = new int[256];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}
		for (int i = 0; i < t.length(); i++) {
			if (arr[t.charAt(i)]-- == 0)
				return false;
		}
		return true;
	}
}

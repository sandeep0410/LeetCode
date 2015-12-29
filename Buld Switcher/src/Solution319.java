/**
 * 
 */

/**
 * @author Sandeep
 * 
 *         LeetCode Question 319 https://leetcode.com/problems/bulb-switcher/
 *         Bulb Switcher
 *
 */
public class Solution319 {
	/**
	 * @param n
	 * @return
	 * 
	 * 		They key here is to understand that the square numbers have odd
	 *         number of factors and the non-square numbers have vene number of
	 *         factors. For exampe: 16 has (1,4,16) and 15 has (1,3,5,15). Now
	 *         for a bub to remain on it should be crossed odd number of times.
	 *         Thus the answer is total number of square numbers present less
	 *         than n.
	 */
	public int bulbSwitch(int n) {
		return (int) Math.sqrt(n);
	}
}

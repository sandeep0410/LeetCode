/**
 * 
 */

/**
 * @author Sandeep
 *
 *         LeetCode: 292. Nim Game https://leetcode.com/problems/nim-game/
 */
public class Solution292 {
	public boolean canWinNim(int n) {
		return !((n % 4) == 0);
	}

}

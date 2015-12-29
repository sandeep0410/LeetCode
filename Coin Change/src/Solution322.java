/**
 * 
 */

/**
 * @author Sandeep
 * 
 *         LeetCode Question: 322 https://leetcode.com/problems/coin-change/ 
 *         Coin Change
 *
 */
public class Solution322 {
	/**
	 * The folowwing solution uses dynamic programming. We start with 1 and count the minimum number of coins at each that can add up to that amount. This process is calculated until the final amount.
	 * @param coins
	 * @param amount
	 * @return
	 */
	
	public int coinChange(int[] coins, int amount) {
		int[] count = new int[amount + 1];
		for (int i = 1; i < count.length; i++) {
			count[i] = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) {
				if (i - coins[j] == 0) {
					count[i] = 1;
					break;
				} else if ((i - coins[j]) > 0 && count[i - coins[j]] > 0) {
					count[i] = Math.min(count[i], 1 + count[i - coins[j]]);
				}
			}
			if (count[i] == Integer.MAX_VALUE)
				count[i] = -1;
		}
		return count[amount];
	}
}

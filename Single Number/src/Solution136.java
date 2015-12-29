/**
 * 
 */

/**
 * @author Sandeep
 * 
 *         LeetCode: Question -136. Single Number
 *         https://leetcode.com/problems/single-number/
 *
 */
public class Solution136 {
	public int singleNumber(int[] nums) {
		int xor = 0;
		for (int num : nums)
			xor ^= num;
		return xor;
	}
}

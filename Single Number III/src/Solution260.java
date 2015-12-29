/**
 * 
 */

/**
 * @author Sandeep
 * 
 * LeetCode Question 260
 * https://leetcode.com/problems/single-number-iii/
 *
 */
public class Solution260 {

	// TO solve the problem in linear time and constant space complexity, we
	// will use bit manipulation
	public int[] singleNumber(int[] nums) {
		int[] result =new int[2];
		int xor = 0;
		for (int n : nums)
			xor ^= n;
		//To find the difference in the two numbers that are present we will find the least difference bit
		//for example we have the difference (6 and 5 as 0110 & ~(0101) = 0010
		int lowDiff = xor & (~(xor-1));
		for(int n: nums){
			if((n&lowDiff) == 0)
				result[0]^=n;
			else
				result[1]^=n;
		}
		return result;
	}
}

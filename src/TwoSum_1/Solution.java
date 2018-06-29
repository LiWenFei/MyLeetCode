package TwoSum_1;

import java.util.HashMap;
/**
 * 这里的思路是：遍历数组，依次将每个元素插入一个缓存区。每次都对当前元素nums[i]进行判断：
 * 若target - nums[i]不在缓冲区，将nums[i]加入缓冲区；
 * 若target - nums[i]在缓冲区，则当前元素和缓冲区中找到的那个元素就是要求的两个数，返回它们的位置即可。 
 * 
 * @author wenfei1
 *
 */

public class Solution {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				if (i > map.get(target - nums[i])) {
					result[0] = map.get(target - nums[i]);
					result[1] = i;
				} else {
					result[0] = i;
					result[1] = map.get(target - nums[i]);
				}
			} else {
				map.put(nums[i], i);
			}
		}

		return result;
	}
}
package TwoSum_1;

import java.util.HashMap;
/**
 * �����˼·�ǣ��������飬���ν�ÿ��Ԫ�ز���һ����������ÿ�ζ��Ե�ǰԪ��nums[i]�����жϣ�
 * ��target - nums[i]���ڻ���������nums[i]���뻺������
 * ��target - nums[i]�ڻ���������ǰԪ�غͻ��������ҵ����Ǹ�Ԫ�ؾ���Ҫ������������������ǵ�λ�ü��ɡ� 
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
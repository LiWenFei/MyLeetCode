package TwoSum_1;

/**
 * ����һ�����������һ��Ŀ��ֵ���ҳ������к�ΪĿ��ֵ����������
 * ����Լ���ÿ������ֻ��Ӧһ�ִ𰸣���ͬ����Ԫ�ز��ܱ��ظ����á�
 * ʾ��:
 * ���� nums = [2, 7, 11, 15], target = 9
 * ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 * ���Է��� [0, 1]
 * @author wenfei1
 *
 */
public class Main {
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int[] result = Solution.twoSum(nums, 9);
		System.out.println("[" + result[0] + " ," + result[1] + "]");
	}

}

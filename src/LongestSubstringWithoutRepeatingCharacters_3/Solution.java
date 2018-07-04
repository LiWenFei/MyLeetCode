package LongestSubstringWithoutRepeatingCharacters_3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int lengthOfLongestSubstring(String s) {
		if ("".equals(s) || s == null) {
			return 0;
		}
		int n = s.length();
		int relsult = 0;
		Map<Character, Integer> map = new HashMap<>();
		//i为上一次重复出现的位置
		for(int i = 0, j = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
				System.err.println(i);
			}
			relsult = Math.max(relsult, j - i + 1);
			map.put(s.charAt(j), j+1);
		}
		return relsult;
	}
}
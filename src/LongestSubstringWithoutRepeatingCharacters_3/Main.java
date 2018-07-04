package LongestSubstringWithoutRepeatingCharacters_3;

/**
 * 无重复字符的最长子串
 * 示例：给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串
 * @author wenfei1
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(Solution.lengthOfLongestSubstring("abcabcdde"));
	}
}

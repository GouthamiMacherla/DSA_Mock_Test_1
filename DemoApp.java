/*
 * First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

    @gouthami.504@gmail.com
 */


package in.ineuron;

import java.util.HashMap;
import java.util.Map;

	public class DemoApp {
		   public int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequencyMap.get(c) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        DemoApp demo = new DemoApp();

        // Example 1
        String s1 = "leetcode";
        System.out.println("First non-repeating character index in " + s1 + ": " + demo.firstUniqChar(s1));

        // Example 2
        String s2 = "loveleetcode";
        System.out.println("First non-repeating character index in " + s2 + ": " + demo.firstUniqChar(s2));

        // Example 3
        String s3 = "aabb";
        System.out.println("First non-repeating character index in " + s3 + ": " + demo.firstUniqChar(s3));
    }
}
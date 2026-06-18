import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int sLength = s.length();

        HashMap<Character, Integer> h1 = new HashMap<>();

        while (right < sLength) {

            while (left <= right && h1.containsKey(s.charAt(right))) {
                h1.remove(s.charAt(left));
                left++;
            }

            h1.put(s.charAt(right), 1);
            maxLen = Math.max(maxLen, right - left + 1);

            right++;
        }

        return maxLen;
    }
}
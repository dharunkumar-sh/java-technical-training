class Solution {

    public int firstUniqChar(String s) {
        int[] arr = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "leetcode";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + sol.firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + sol.firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + sol.firstUniqChar(s3));
    }
}
import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, right = 0, maxLen = 0;
        int fruitsLength = fruits.length;

        HashMap<Integer, Integer> h1 = new HashMap<>();

        while (right < fruitsLength) {

            Integer count = h1.get(fruits[right]);
            if (count == null) {
                h1.put(fruits[right], 1);
            } else {
                h1.put(fruits[right], count + 1);
            }

            while (left <= right && h1.size() > 2) {
                count = h1.get(fruits[left]);

                if (count - 1 == 0) {
                    h1.remove(fruits[left]);
                } else {
                    h1.put(fruits[left], count - 1);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}
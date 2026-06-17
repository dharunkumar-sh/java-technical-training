class Solution {
    public int search(int[] nums, int target) {
        int numsLength = nums.length;
        int i;
        for (i = 0; i < numsLength; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
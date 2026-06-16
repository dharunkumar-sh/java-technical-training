class Solution {
    public int matrixSum(int[][] nums) {
        for (int[] row : nums)
            Arrays.sort(row);
        int score = 0;
        for (int col = 0; col < nums[0].length; col++) {
            int max = 0;
            for (int row = 0; row < nums.length; row++) {
                max = Math.max(max, nums[row][col]);
            }
            score += max;
        }
        return score;
    }
}
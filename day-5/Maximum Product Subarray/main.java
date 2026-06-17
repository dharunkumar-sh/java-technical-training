class Solution {
    public int maxProduct(int[] nums) {
        int i, j, Prod = 1;
        int max_Prod = Integer.MIN_VALUE;// to conside negavitive value also in java
        for (i = 0; i < nums.length; i++) {
            Prod = 1;
            for (j = i; j < nums.length; j++) {
                Prod = Prod * nums[j];
                max_Prod = Math.max(max_Prod, Prod);
            }
        }
        return max_Prod;
    }
}
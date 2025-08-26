class Solution {
    public int maxSubArray(int[] nums) {
         int max = nums[0];
         int maxEnding = nums[0];
         for (int i = 1; i < nums.length; i++) {
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
                     max = Math.max(max, maxEnding);
         }
         return max;
    }
}
       
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // init
        int[] prefix = new int[nums.length];
        prefix[0] = 1;

        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = 1;

        // answer will be stored here
        int[] output = new int [nums.length];

        // all numbers before index multiplied
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        // all numbers after index multiplied
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        // multiply before and after tgt and store
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix[i] * suffix[i];
        }

        // return stored
        return output;
    }
}

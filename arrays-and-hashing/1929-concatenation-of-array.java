class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] sol = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            sol[i] = nums[i];
        }

        for (int i = nums.length; i < (nums.length * 2); i++) {
            sol[i] = nums[i - nums.length];
        }
        return sol;
    }
}

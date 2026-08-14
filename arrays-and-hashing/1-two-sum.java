class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create the hash map
        Map<Integer, Integer> hash = new HashMap<>();

        // create array to store indices producing target
        int[] sol = new int[2];

        for (int i = 0; i < nums.length; i++) {
            // checks to see if the value of target - current value at index i exists
            if (hash.containsKey(target - nums[i])) {
                // the current index we are on
                sol[0] = i;

                // the second index that produces the target
                sol[1] = hash.get(target - nums[i]);
            }
            // store the value and the index representing it
            hash.put(nums[i], i);
        }
        return sol;
    }
}


class Solution {
    public int singleNumber(int[] nums) {
        // sort array
        Arrays.sort(nums);

        // hash map => int in array and # of times it appears
        HashMap<Integer, Integer> map = new HashMap<>();

        // iterate through array
        for (int i = 0; i < nums.length; i++) {
            // current index is key
            int key = nums[i];
            // if key exists in map
            if (map.containsKey(key)) {
                // increment the frequency
                map.put(key, map.get(key) + 1);
            } else {
                // first time key appeared
                map.put(key, 1);
            }
        }

        // for each key inside the key set of the map
        for (int key : map.keySet()) {
            // if the key maps to 1, return the key (unique)
            if (map.get(key) == 1) {
                return key;
            }
        }
        // no element with only 1 time appearance
        return -1;
    }
}
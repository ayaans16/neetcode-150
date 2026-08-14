class Solution {
    public int search(int[] nums, int target) {
        // lowest index is 0, highest is length (n) - 1
        int low = 0;
        int high = nums.length - 1;

        // iterate while lowest value is lower or equal to highest value
        while (low <= high) {

            // find mid index
            int mid = (low + high) / 2;

            // if mid value is target return index value of mid 
            if (nums[mid] == target) {
                return mid;
            // if mid value is less than target, low + 1 so we move right
            } else if (nums[mid] < target) {
                low = mid + 1;
            // if mid value is greater than target, low - 1 so we move left
            } else {
                high = mid - 1;
            }
        }
        // if non existent
        return -1;
    }
}
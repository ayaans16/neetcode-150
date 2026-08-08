**Problem:** https://leetcode.com/problems/contains-duplicate/ <br />
**Language:** Java

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // sort the array in ascending order
        Arrays.sort(nums);

        int init = nums[0]; // first num
        for (int i = 1; i < nums.length; i++) {
            if (init == nums[i]) {
                return true;
            } else {
                init = nums[i];
            }
        }
        return false;
    }
}
```

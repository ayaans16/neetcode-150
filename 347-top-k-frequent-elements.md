```java
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // mapping integer with number of times it appeared
        Map<Integer, Integer> map = new HashMap<>();

        // iterate through array to see when key appeared, if it did, increment # of times spotted, if no key exists, add it to map
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        // # of buckets inside the map
        List<Integer>[] buckets = new List[nums.length + 1];

        // iterate through # of keys in map
        for (int key : map.keySet()) {
            // # of times the key appeared in map
            int frequency = map.get(key);

            // if null, create a list for it
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<Integer>();  
            }

            // add key to frequency
            buckets[frequency].add(key);
        }

        // determine k # of buckets that appeared multiple times
        int sol[] = new int[k];
        int index = 0;

        // iterate through entire list of buckets
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    if (index == k) {
                        break;
                    }
                    sol[index] = num;
                    index += 1;
                }
            }
        }
        return sol;
    }
}
```
> [!IMPORTANT]
> - [ ] understand necessity for frequency table
> - [ ] array indexing was important

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // create a hash map to store sorted string with anagrams
        HashMap<String, List<String>> hash = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            // convert string into char => then create into a key
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            // if the hash contains the key pointing to a list
            if (hash.containsKey(key)) {
                // put the element into the bucket
                hash.get(key).add(strs[i]);
            } else {
                // create a new list, add the value to the list, add the list to the map
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hash.put(key, list);
            }
        }
        // return a list of the hash values
        return new ArrayList<>(hash.values());
    }
}

**Problem:** https://leetcode.com/problems/valid-anagram <br />
**Language:** Java
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        String[] r = s.split("");
        String[] u = t.split("");

        Arrays.sort(r);
        Arrays.sort(u);

        if (Arrays.equals(r, u)) {
            return true;
        }

        return false;
    }
}
```
> [!CAUTION]
> Do not compare arrays literally (i.e., do not do `if (r == u) ...`, use `Arrays.equals(a, b)` which will return a Boolean.

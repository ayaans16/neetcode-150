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
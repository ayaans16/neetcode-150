class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String temp = "";

        // using a for loop to reverse the word
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i) + temp;
        }

        if (s.equals(temp)) {
            return true;
        }
        return false;
    }
}
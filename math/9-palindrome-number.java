class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        String str = Integer.toString(x);
        String str2 = str;

        StringBuilder res = new StringBuilder();
        res.append(str2);
        res.reverse();

        if (str.equals(res.toString())) {
            return true;
        }

        return false;
    }
}

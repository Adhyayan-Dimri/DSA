class Solution {
    public int titleToNumber(String columnTitle) {
        int n = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int val = columnTitle.charAt(i) - 'A' + 1;
            n = n * 26 + val;
        }

        return n;
    }
}
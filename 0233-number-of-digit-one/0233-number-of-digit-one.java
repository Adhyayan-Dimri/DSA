class Solution {
    public int countDigitOne(int n) {
        long count = 0;

        for (long place = 1; place <= n; place *= 10) {
            long left = n / (place * 10);
            long current = (n / place) % 10;
            long right = n % place;

            if (current == 0) {
                count += left * place;
            } else if (current == 1) {
                count += left * place + right + 1;
            } else {
                count += (left + 1) * place;
            }
        }

        return (int) count;
    }
}
interface PairCounter {
    int count(int n);
}

final class DivisorPairCounter implements PairCounter {
    @Override
    public int count(int n) {
        int r = (int) Math.sqrt(n);
        int cnt = 0;
        for (int i = 1; i <= r; i++) {
            if (n % i == 0) {
                cnt += (i == n / i) ? 1 : 2;
            }
        }
        return cnt;
    }
}

class Solution {
    private final PairCounter counter = new DivisorPairCounter();
    public int solution(int n) {
        return counter.count(n);
    }
}

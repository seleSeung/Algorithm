class Solution {
    public int[] solution(int n, int[] numlist) {
        NumberFilter filter = new DivisibleByN(n);
        NumberCollection collection = new NumberCollection(numlist);
        return collection.filterToArray(filter);
    }

    private interface NumberFilter {
        boolean test(int number);
    }

    private static final class DivisibleByN implements NumberFilter {
        private final int base;
        DivisibleByN(int base) {
            this.base = base;
        }
        public boolean test(int number) {
            return number % base == 0;
        }
    }

    private static final class NumberCollection {
        private final int[] data;
        NumberCollection(int[] data) {
            this.data = data;
        }
        int[] filterToArray(NumberFilter filter) {
            int count = 0;
            for (int x : data) {
                if (filter.test(x)) count++;
            }
            int[] result = new int[count];
            int i = 0;
            for (int x : data) {
                if (filter.test(x)) result[i++] = x;
            }
            return result;
        }
    }
}

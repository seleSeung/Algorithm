class Solution {
    public int[] solution(String[] strlist) {
        LengthCalculator calculator = new StringLengthCalculator();
        StringCollection collection = new StringCollection(strlist);
        return collection.mapLengths(calculator);
    }

    private interface LengthCalculator {
        int calculate(String value);
    }

    private static final class StringLengthCalculator implements LengthCalculator {
        public int calculate(String value) {
            return value.length();
        }
    }

    private static final class StringCollection {
        private final String[] data;

        StringCollection(String[] data) {
            this.data = data;
        }

        int[] mapLengths(LengthCalculator calculator) {
            int[] result = new int[data.length];
            for (int i = 0; i < data.length; i++) {
                result[i] = calculator.calculate(data[i]);
            }
            return result;
        }
    }
}

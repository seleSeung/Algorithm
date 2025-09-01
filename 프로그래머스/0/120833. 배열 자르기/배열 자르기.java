class Solution {

    // [num1, num2] 구간을 표현하는 값 객체
    static final class SliceRange {
        private final int start;
        private final int endInclusive;

        SliceRange(int start, int endInclusive) {
            if (start < 0 || endInclusive < start) {
                throw new IllegalArgumentException("잘못된 범위: " + start + " ~ " + endInclusive);
            }
            this.start = start;
            this.endInclusive = endInclusive;
        }
        int start() { return start; }
        int length() { return endInclusive - start + 1; }
    }

    // 배열 슬라이싱 역할 객체
    static final class ArraySlicer {
        int[] slice(int[] src, SliceRange range) {
            int len = range.length();
            int[] out = new int[len];
            System.arraycopy(src, range.start(), out, 0, len);
            return out;
        }
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        SliceRange range = new SliceRange(num1, num2);
        ArraySlicer slicer = new ArraySlicer();
        return slicer.slice(numbers, range);
    }
}

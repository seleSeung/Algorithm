class Solution {

    static final class Triangle {
        private final int[] sides;

        Triangle(int[] sides) {
            this.sides = sides;
        }

        boolean isValid() {
            int a = sides[0], b = sides[1], c = sides[2];
            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;
            return max < (sum - max);
        }
    }

    public int solution(int[] sides) {
        return new Triangle(sides).isValid() ? 1 : 2;
    }
}
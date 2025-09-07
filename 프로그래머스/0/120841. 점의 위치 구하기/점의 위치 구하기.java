final class Point {
    private final int x;
    private final int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(int[] dot) {
        if (dot == null || dot.length != 2) {
            throw new IllegalArgumentException("점은 길이 2의 배열이어야 합니다.");
        }
        return new Point(dot[0], dot[1]);
    }

    public int x() { return x; }
    public int y() { return y; }
    public boolean isOnAxis() { return x == 0 || y == 0; }
}

enum Quadrant {
    I(1), II(2), III(3), IV(4);

    private final int value;
    Quadrant(int value) { this.value = value; }
    public int toInt() { return value; }

    public static Quadrant from(Point p) {
        if (p.isOnAxis()) {
            throw new IllegalArgumentException("좌표축 위의 점은 사분면이 정의되지 않습니다.");
        }
        int x = p.x(), y = p.y();
        if (x > 0 && y > 0) return I;
        if (x < 0 && y > 0) return II;
        if (x < 0 && y < 0) return III;
        return IV;
    }
}

final class CartesianPlane {
    public Quadrant locate(Point p) {
        return Quadrant.from(p);
    }
}

class Solution {
    public int solution(int[] dot) {
        Point p = Point.of(dot);
        CartesianPlane plane = new CartesianPlane();
        return plane.locate(p).toInt();
    }
}









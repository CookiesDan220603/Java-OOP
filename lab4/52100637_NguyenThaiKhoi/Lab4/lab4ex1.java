class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
}

public class lab4ex1 {
    public static void main(String[] args) {
        Point2D a = new Point2D();
        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D(5.6f, 9.9f);
        System.out.println(b.getX());
        System.out.println(b.getY());
    }
}
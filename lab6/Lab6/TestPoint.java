public class TestPoint {
    public static void main(String[] agrs) {
        Point2D p1 = new Point2D(3, 4);
        Point3D p2 = new Point3D(6, 7, 8);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        float[] arr1 = p1.getXY();
        float[] arr2 = p2.getXYZ();
        for (float x: arr1) {
            System.out.println(x);
        }
        for (float y: arr2) {
            System.out.println(y);
        }
    }
}

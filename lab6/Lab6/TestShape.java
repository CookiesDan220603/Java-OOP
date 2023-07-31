public class TestShape {
    public static void main(String[] args) {
        CircleExercise4 c1 = new CircleExercise4(2.0, "green", true);
        System.out.println(c1.toString());
        Rectangle r1 = new Rectangle(3, 4, "black", false);
        System.out.println(r1.toString());
        Square s1 = new Square(5, "red", true);
        System.out.println(s1.toString());
    }
}

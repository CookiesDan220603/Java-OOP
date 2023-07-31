public class CircleExercise4 extends Shape{
    private double radius;
    public CircleExercise4() {
        super();
        this.radius = 1.0;
    }    
    public CircleExercise4(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double width) {
        this.radius = width;
    }
    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    public double getPerimeter() {
        double perimeter = Math.PI * this.radius * 2;
        return perimeter;
    }
    public String toString() {
        return "Circle[" + super.color + ", " + super.filled + ", " + this.radius + ", " + getArea() + ", " + getPerimeter() + "]";
    }
}

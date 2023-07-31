public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }
    public boolean equals(Shape s) {
        if (s instanceof Circle) {
            Circle temp = (Circle) s;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "Circle[" + super.getColor() + ", " + super.isFilled() + ", " + this.radius + ", " + getArea() + ", " + getPerimeter() + "]";
    }
}
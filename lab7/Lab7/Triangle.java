public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle() {
        this.base = 0;
        this.height = 0;
    }
    public Triangle(double base, double height, String color) {
        super.setColor(color);
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
    public String toString() {
        return "Triangle[" + super.getColor() + ", " + this.base + ", " + this.height + ", " + getArea() + "]";
    }
}
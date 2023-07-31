public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        double area = this.length * this.width;
        return area;
    }
    public double getPerimeter() {
        double perimeter = (this.length + this.width) / 2.0;
        return perimeter;
    }
    public String toString() {
        return "Rectangle[" + super.color + ", " + super.filled + ", " + this.length + ", " + this.width + ", " + getArea() + ", " + getPerimeter() + "]";
    }
}

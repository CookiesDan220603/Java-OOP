public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        double area = getWidth() * getLength();
        return area;
    }
    public double getPerimeter() {
        double perimeter = (getLength() + getWidth()) * 2;
        return perimeter;
    }
    public boolean equals(Shape s) {
        if (s instanceof Rectangle) { 
            Rectangle temp = (Rectangle) s;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }
    public String toString() {
        return "Rectangle[" + getColor() + ", " + isFilled() + ", " + getLength() + ", " + getWidth() + ", " + getArea() + ", " + getPerimeter() + ']';
    }
}

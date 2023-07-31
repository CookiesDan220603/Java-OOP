public class Circle {
    protected double radius;

    public Circle() {
        this.radius = 1.0;
    }
    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;
        return perimeter;
    }  
}

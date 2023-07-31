public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super(radius);
        this.height = 0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        double volume = Math.PI * Math.pow(this.radius, 2) * this.height;
        return volume;
    }
    public String toString() {
        return "Cylinder[" + this.color + ", " + this.radius + ", " + this.height + ", " + getVolume() + "]";
    }
}
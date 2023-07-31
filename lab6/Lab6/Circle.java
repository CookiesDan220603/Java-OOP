public class Circle {
        protected double radius;
        protected String color;

        public Circle() {
            this.radius = 1.0;
            this.color = "red";
        }
        public Circle(double radius) {
            this.radius = radius;
            this.color = "";
        }
        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }
        public double getRadius() {
            return this.radius;
        }
        public String getColor() {
            return this.color;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public double getArea() {
            double area = Math.PI * Math.pow(this.radius, 2);
            return area;
        }
        public String toString() {
            return "Circle[" + this.color + ", " + this.radius +", " + getArea() + "]";
        }
}

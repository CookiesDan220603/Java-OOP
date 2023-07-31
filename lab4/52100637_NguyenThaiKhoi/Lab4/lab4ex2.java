class Rectangle {
    private float width = 1.0f;
    private float length = 1.0f;
    
    public Rectangle() {
        this.width = 1.0f;
        this.length = 1.0f;
    }
    public Rectangle(float width, float length) {
        this.width = width;
        this.length = length;
    }
    public float getWidth() {
        return this.width;
    }
    public float getLength() {
        return this.length;
    }
    public float getArea() {
        return this.width * this.length;
    }
    public float getPerimeter() {
        return (this.width + this.length) * 2;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public String toString() {
        return "Rectangle[" + "Width: " + width + " , " + "Length: " + length;
    }
}

public class lab4ex2 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        System.out.println(a.getWidth());
        System.out.println(a.getLength());
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println(a.toString());

        a.setWidth(5.0f);
        a.setLength(9.0f);
        System.out.println(a.getWidth());
        System.out.println(a.getLength());

        Rectangle b = new Rectangle(6.9f, 8.2f);
        System.out.println(b.getWidth());
        System.out.println(b.getLength());
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(b.toString());
    }
}

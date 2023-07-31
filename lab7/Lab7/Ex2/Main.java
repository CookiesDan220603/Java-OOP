public class Main {
    public static Shape findMaxArea(Shape[] shapes) {
        Shape shapeHasMaxArea = shapes[0];
        for(int i = 1; i < shapes.length; i++) {
            if(shapes[i].getArea() > shapeHasMaxArea.getArea()) {
                shapeHasMaxArea = shapes[i];
            }
        }
        return shapeHasMaxArea;
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        for(int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].toString());
        }
        Shape shapeHasMaxArea = findMaxArea(shapes);
        System.out.println("Shape has the largest area:");
        System.out.println(shapeHasMaxArea.toString());
    }
}

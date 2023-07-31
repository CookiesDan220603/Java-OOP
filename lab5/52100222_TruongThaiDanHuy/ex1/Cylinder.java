public class Cylinder extends Circle {
    private double height;
    public Cylinder (){
        super();
        height = 1.0;
    }
    public Cylinder (double radius){
        super(radius);
    }
    public Cylinder (double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder (double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double getVolume (){
        return Math.PI * Math.pow(radius, 2)*height;
    }
    @Override
    public String toString(){
        return "radius : " + radius +" , color " + color + " , height " + height ;
    }
}

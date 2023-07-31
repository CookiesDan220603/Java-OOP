public class Point3D extends Point2D {
    private float z ;
    public Point3D(){
        super();
        z = 0.0f;
    }
    public float getZ(){
        return z;
    }
    public void setZ( float z){
        this.z = z;
    }
    public float [] getXYZ (){
        float mang[] = new float[100];
        mang[0]= x;
        mang[1]= y;
        mang[2]= z;
        return mang;
    }
    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString(){
        return "X : " + x + " , Y : " + y + " , Z : " + z;
    
}

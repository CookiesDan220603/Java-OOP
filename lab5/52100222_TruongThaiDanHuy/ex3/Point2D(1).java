public class Point2D {
  protected float x;
  protected float y;
  public Point2D(){
      x = 0.0f;
      y = 0.0f;
  }  
  public Point2D(float x, float y){
      this.x = x;
      this.y = y;
  }
  public float getX(){
      return x;
  }
  public float getY(){
      return y;
  }
  public float[] getXY(){
      float mang[] = new float[100];
      mang[0] = x;
      mang[1] = y;
      return mang ;
  }
  public void setX(float x){
      this.x = x;
  }
  public void setY(float y){
      this.y = y;
  }
  public void setXY (float x, float y){
      this.x = x;
      this.y = y;
  }
  @Override
  public String toString(){
      return "X : " + x + " , Y : " + y;
  }
}

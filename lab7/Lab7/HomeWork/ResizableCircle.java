public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle() {
        super();
    }
    public void resize(int percent) {
        super.radius *= percent / 100;
    }
}

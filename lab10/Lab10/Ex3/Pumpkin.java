public class Pumpkin implements Vegetable{
    private double weight;

    public Pumpkin(double weight) {
        this.weight = weight;
    }
    public String getInfor() {
        return "Pumpkin[" + this.weight + "]";
    }
}

public class Carot implements Vegetable{
    private String type;

    public Carot(String type) {
        this.type = type;
    }
    public String getInfor() {
        return "Carot[" + this.type + "]";
    }
}

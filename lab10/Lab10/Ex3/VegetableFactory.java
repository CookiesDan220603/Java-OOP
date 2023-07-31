public class VegetableFactory {
    public Vegetable getVegetable(String vegetable) {
        if (vegetable.equals(null)) return null;

        if (vegetable.equalsIgnoreCase("Carot")) {
            return new Carot("A");
        }
        else if (vegetable.equalsIgnoreCase("Cabbage")) {
            return new Cabbage("A", 1.5);
        }
        else if (vegetable.equalsIgnoreCase("Pumpkin")) {
            return new Pumpkin(2.5);
        }
        return null;
    }
}

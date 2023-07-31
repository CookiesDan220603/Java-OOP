public class Test {
    public static void main(String[] args) {
        VegetableFactory vegetableFactory = new VegetableFactory();

        Vegetable obj1 = vegetableFactory.getVegetable("Carot");
        System.out.println(obj1.getInfor());

        Vegetable obj2 = vegetableFactory.getVegetable("Cabbage");
        System.out.println(obj2.getInfor());

        Vegetable obj3 = vegetableFactory.getVegetable("Pumpkin");
        System.out.println(obj3.getInfor());
    }
}

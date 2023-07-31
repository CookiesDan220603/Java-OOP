class House {
    private String houseCode;
    public int numOfBedRooms;
    public boolean hasSwimmingPool;
    public double area;
    public double costPerSquareMeter; 
    
    public House() {
        this.houseCode = "A01";
        this.numOfBedRooms = 2;
        this.hasSwimmingPool = false;
        this.area = 0;
        this.costPerSquareMeter = 0;
    }
    public House(String houseCode, int numOfBedRooms, boolean hasSwimmingPool, double area, double costPerSquareMeter) {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }
    public String getHouseCode() {
        return this.houseCode;
    }
    public int getNumOfBedRooms() {
        return this.numOfBedRooms;
    }
    public boolean getHasSwimmingPool() {
        return this.hasSwimmingPool;
    }
    public double getArea() {
        return this.area;
    }
    public double getCostPerSquareMeter() {
        return this.costPerSquareMeter;
    }
    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode;
    }
    public void setNumOfBedRooms(int numOfBedRooms) {
        this.numOfBedRooms = numOfBedRooms;
    }
    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setCostPerSquareMeter(double costPerSquareMeter) {
        this.costPerSquareMeter = costPerSquareMeter;
    }
    public double calculateSellingPrice() {
        double subTotal = this.costPerSquareMeter * this.area;
        if (this.hasSwimmingPool == true) {
            subTotal += 0.1 * subTotal;
        }
        double sellingPrice = subTotal + (0.15 * subTotal);
        return sellingPrice;
    }
    public String toString() {
        return "House[" + this.houseCode + ", " + this.numOfBedRooms + ", " + this.hasSwimmingPool + ", " + calculateSellingPrice() + "]";
    }
}

public class lab4ex4 {
    public static void main(String[] args) {
        House firstHouse = new House("21A", 2, true, 100, 2500000);
        System.out.println(firstHouse.toString());
        System.out.println(firstHouse.calculateSellingPrice());
        System.out.println(firstHouse.getCostPerSquareMeter());
    }
}

public class House {
    private String houseCode;
    private int numOfBedRooms;
    
    private double area;
    private boolean hasSwimmingPool;
    private double costPerSquareMeter;


    public House(){
        this.houseCode = "A01" ;
        this.numOfBedRooms = 2;
        this.hasSwimmingPool = false;
        this.area = 0.0;
        this.costPerSquareMeter = 0.0;
    }   

    public House(String houseCode, int numOfBedRooms,boolean hasSwimmingPool, double area, double costPerSquareMeter)
    {
        this.houseCode = houseCode;
        this.numOfBedRooms = numOfBedRooms;
        this.hasSwimmingPool = hasSwimmingPool;
        this.area = area;
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public String gethouseCode(){
        return houseCode;
    }


    public double getarea(){
        return area;
    }

    public int getnumOfBedRooms(){
        return numOfBedRooms;
    }

    public double getcostPerSquareMeter(){
        return costPerSquareMeter;
    }

    public boolean gethasSwimmingPool(){
        return hasSwimmingPool;
    }


    
    public void sethouseCode(String houseCode){
        this.houseCode = houseCode;
    }

    public void sethasSwimmingPool(boolean hasSwimmingPool){
        this.hasSwimmingPool = hasSwimmingPool;
    }

    public void setarea(double area){
        this.area = area;
    }

    public void setnumOfBedRooms(int numOfBedRooms){
        this.numOfBedRooms = numOfBedRooms;
    }
    public void setcostPerSquareMeter(double costPerSquareMeter){
        this.costPerSquareMeter = costPerSquareMeter;
    }

    public double calculateSellingPrice(){

        double s = area * costPerSquareMeter;
        
        if(hasSwimmingPool){
            s = s+ s *(10.0/100);
        }
        double price = s + (15.0/100) * s;
        
        return price;

    }

    public String toString(){
        return "House["+ houseCode +", "+ numOfBedRooms +", "+ hasSwimmingPool +", "+ area +", "+ costPerSquareMeter +"]";
    }
}
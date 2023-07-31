public class Manager extends Employee{
    private String positon;
    private String department;
    private double salaryCoefficientByPosition;

    public Manager() {
        super();
        this.positon = "Head of the Office";
        this.department = "Administrative Office";
        this.salaryCoefficientByPosition = 0.5;
    }
    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientByPosition) {
        super(ID, fullName, coefficientsSalary);
        super.yearJoined = 2020;
        super.numDaysOff = 0;
        this.department = "";
        this.positon = position;
        this.salaryCoefficientByPosition = salaryCoefficientByPosition;
    }
    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff, String position, String department, double salaryCoefficientByPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.positon = position;
        this.department = department;
        this.salaryCoefficientByPosition = salaryCoefficientByPosition;
    }
    public String considerEmulation() {;
        return "A";
    }
    public double bonusByPosition() {
        double bonus = 5000000 * this.salaryCoefficientByPosition;
        return bonus;
    }
    public double getSalary() {
        double salary;
        salary = super.getSalary() + bonusByPosition();
        return salary;
    }
}

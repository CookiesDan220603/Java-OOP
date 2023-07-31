import javax.print.attribute.standard.Sides;

public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;

    public Employee() {
        this.ID = 0;
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }
    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numDaysOff = 0;
    }
    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }
    public double getSenioritySalary() {
        int yearsOfWork = 2022 - this.yearJoined;
        double senioritySalary;
        if (yearsOfWork >= 5) {
            senioritySalary = yearsOfWork * 5000000 / 100;
            return senioritySalary;
        }
        return 0;
    }
    public String considerEmulation() {
        if (this.numDaysOff <= 1) {
            return "A";
        }
        else if (this.numDaysOff >= 2 && this.numDaysOff <= 3) {
            return "B";
        }
        return "C";
    }
    public double getSalary() {
        double emulationCoefficient;
        if (considerEmulation().equals("A")) {
            emulationCoefficient = 1; 
        }
        else if (considerEmulation().equals("B")) {
            emulationCoefficient = 0.75;
        }
        else {
            emulationCoefficient = 0.5;
        }
        double salary;
        salary = 5000000 + 5000000 * (this.coefficientsSalary + emulationCoefficient) + getSenioritySalary();
        return salary;
    }
}

class Student {
    private int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName =  firstName;
        this.lastName = lastName;
    }
    public int getID() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setID(int id) {
        this.id = id;
    } 
    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    public String toString() {
        return "Student[ID: " + this.id + ", " + "First Name: " + this.firstName + ", " + "Last Name: " + this.lastName;
    }
}

public class lab4ex3 {
    public static void main(String[] args) {
        Student student1 = new Student(52100637, "Nguyen", "Thai Khoi");
        System.out.println(student1.getID());
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastName());
        System.out.println(student1.getName());
        System.out.println(student1.toString());

        student1.setFirstName("Truong");
        student1.setID(52100222);
        student1.setLastName("Thai Dan Huy");
        System.out.println(student1.getID());
        System.out.println(student1.getName());
        System.out.println(student1.toString());
    }
}

public class Student {
    private String name;
    private String gender;
    private int age;
    public Student() {
    this.name = "";
    this.gender = "male";
    this.age = 0;
    }
    public Student(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    }
    public Student(Student st) {
    this.name = st.name;
    this.gender = st.gender;
    this.age = st.age;
    }
    void studying() {
    System.out.println("studying...");
    }
    void reading() {
    System.out.println("reading...");
    }
    public String getName() {
    return this.name;
    }
    public String getGender() {
    return this.gender;
    }
    public int getAge() {
    return this.age;
    }
    public void setName(String name) {
    this.name = name;
    }
    public void setGender(String gender) {
    this.gender = gender;
    }
    public void setAge(int age) {
    this.age = age;
    }
    public String toString() {
        return "Student[" + name + ", " + gender + ", " + age + "]";
        }
    }
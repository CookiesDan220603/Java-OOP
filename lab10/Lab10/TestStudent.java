public class TestStudent {
    public static void main(String[] agrs) {
        Student st1 = new Student("Dan Huy", "60/56", "M", 8);
        Student.StudentOperator student1 = st1.new StudentOperator();
        student1.print();
        System.out.println(student1.type());
    }
}

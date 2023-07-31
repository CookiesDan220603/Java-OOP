public class Student {
    int id;
    String firstname;
    String lastname;
    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public int getId(){
        return this.id;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getName(){
        return firstname + " " + lastname ;
    }
    public String toString(){
        return "Student ["+ id +", "+ firstname + " " + lastname +"] ";
    }
}

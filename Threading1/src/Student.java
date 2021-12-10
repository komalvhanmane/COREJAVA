public class Student {
    int rollNo;
    String sname;

    //Constructor
    public Student(int rollNo, String sname) {
        this.rollNo = rollNo;
        this.sname = sname;
    }
    //Getter and setter

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}

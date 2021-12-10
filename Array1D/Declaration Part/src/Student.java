public class Student {
    int rollNo;
    String sName;

    public Student(int rollNo, String sName) {
        this.rollNo = rollNo;
        this.sName = sName;
    }

    public static void main(String[] args) {
        Student[] s=new Student[2];
        s[0]=new Student(12,"Komal");
        s[1]=new Student(13,"Sonali");
        s[2]=new Student(14,"Sonu");
        //RunTime Error :-array out of Index bound
    }
}

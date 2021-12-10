import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Student s[]=new Student[3];//Creating array of Student class

        //Accepting the Inputs
        for(int i=0;i<s.length;i++){
            System.out.println("Enter the Roll No. and Student Name of : "+(i+1));
            s[i]=new Student(sc.nextByte(),sc.next());
        }
        //Displaying
        System.out.println("-----------------------------");
        System.out.println("\t\tRoll No. \t\tName");
        for(int i=0;i<s.length;i++){
            System.out.println("\t\t"+s[i].rollNo+"\t\t"+s[i].sname);
        }
    }
}

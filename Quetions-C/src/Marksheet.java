import java.util.Scanner;
public class Marksheet {
    public float percentage(int marks[]){
        int total=0;
        for(int i=0;i<marks.length;i++){
            total=total+marks[i];
        }
        float per=(float) total/5;
        return per;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        System.out.println("Enter the Student Name");
        String name=sc.next();
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter the marks of subjectNo."+(i+1));
            marks[i]=sc.nextInt();
        }
        Marksheet m=new Marksheet();
        float per=m.percentage(marks);
        char grade;
        if(per>90){
            grade='O';
        }else if(per>80 && per<90){
            grade='A';
        }else if(per>70 && per<80){
            grade='B';
        }else if(per>60 && per<70){
            grade='C';
        }else if(per>50 && per<60){
            grade='D';
        }else if(per<50){
            grade='E';
        }else {
            grade='F';
        }
        System.out.println("Student Name :"+name);
        System.out.println("Percentage   :"+per);
        System.out.println("Student Grade:"+grade);
    }
}

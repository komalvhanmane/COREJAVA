import java.util.Scanner;

public class Quetion5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the No of Days" );
        int noOfDays=sc.nextInt();
        int year=noOfDays/365;
        int month=(noOfDays%365)/30;
        int day=((noOfDays%365)%30)%7;
        System.out.println("No of Year : "+year);
        System.out.println("No of Month: "+month);
        System.out.println("No of Days : "+day);
    }
}

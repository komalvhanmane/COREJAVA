import java.util.Scanner;
public class LogicJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Logic l=new Logic();
        do{
            System.out.println("Enter the choice \n1-Factor\n2-Factorial\n3-Prime Number\n4-Reverse\n5-check palindrome\n6-Neon number\n7-Armstrong number\n8-Fibonacci Series\n9-Arithematic series \n10-Geomatric Series");
            switch (sc.nextInt()){
                case 1->{
                    System.out.println("Enter the number for finding the factors");
                    int n=sc.nextInt();
                    l.factor(n);
                }
                case 2->{
                    System.out.println("Enter the number to find the factorial");
                    int n=sc.nextInt();
                    l.factorial(n);
                }
                case 3->{
                    System.out.println("Enter the number upto which you to find the prime numbers");
                    int n=sc.nextInt();
                    l.primeTilln(n);
                }
                case 4->{
                    System.out.println("Enter the number which you want to reverse");
                    int n=sc.nextInt();
                    l.reverse1(n);
                }
                case 5->{
                    System.out.println("Enter the number to which you want to check palindrome or not ");
                    int n=sc.nextInt();
                    l.palindrome(n);
                }
                case 6->{
                    System.out.println("Enter the number to check Neon number or not");
                    int n=sc.nextInt();
                    l.neonnumber(n);
                }
                case 7->{
                    System.out.println("Enter the number to check if it is armstrong or not");
                    int n=sc.nextInt();
                    l.armstrongNumber(n);
                }
                case 8->{
                    System.out.println("Enter the Number of fibbonacci series");
                    int n=sc.nextInt();
                    l.fibbo(n);
                }
                case 9->{
                    System.out.println("Enter the first number , difference and Total numbers in series you want ");
                    int a=sc.nextInt();
                    int d=sc.nextInt();
                    int n=sc.nextInt();
                    l.arithematic(a,n,d);
                }
                case 10->{
                    System.out.println("Enter the first number ,common ratio , total number of elements you want");
                    int a=sc.nextInt();
                    int d=sc.nextInt();
                    int n=sc.nextInt();
                    l.geometric(a,d,n);
                }
            }
            System.out.println("Do you want to continue if yes press 1");
        }while (sc.nextInt()==1);
        System.out.println("------------------Thank You----------------");
    }
}

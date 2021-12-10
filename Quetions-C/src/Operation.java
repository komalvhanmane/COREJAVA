import java.util.Scanner;
public class Operation {
    public int addition(int a,int b){
        return a+b;
    }
    public int substraction(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Operation op=new Operation();//creating object
        do{
            System.out.println("Enter Two Numbers For Operation");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Enter \n1-Addition\n2-Substraction");
            switch (sc.nextInt()){
                case 1:{
                    int sum=op.addition(a,b);
                    System.out.println("Sum is :"+sum);
                    break;
                }
                case 2:{
                    int diff=op.substraction(a,b);
                    System.out.println("Difference  is :"+diff);
                    break;
                }
            }
            System.out.println("Enter 1 for continuing");
        }while (sc.nextInt()==1);
        System.out.println("thank you");
    }
}

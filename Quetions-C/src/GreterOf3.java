import java.util.Scanner;
public class GreterOf3 {
    public int greater(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>c && b>a){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GreterOf3 g=new GreterOf3();
        do{
            System.out.println("enter the 1st Number");
            int a=sc.nextInt();
            System.out.println("enter the 2nd Number");
            int b=sc.nextInt();
            System.out.println("enter the 3rd Number");
            int c=sc.nextInt();
            System.out.println("Greater of 3 is "+g.greater(a,b,c));
            System.out.println("enter for continuation 1");
        }while (sc.nextInt()==1);
        System.out.println("--------------Thank You-------------");
    }
}

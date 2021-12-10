import java.util.Scanner;

public class Solution {
    /*
    * 4.Write a code for following
    * 1.Input two integers :a,b
    * 2.Initialize the value of x to a and the value of y to b
    * 3.If x>y then set x to x-y
    * 4.if x<y then set y-x
    * 5.Repeat steps 3 and 4 until x=y
    * 6.Output x (or y)and halt.
    * What will this algorithm output in step 6 if we begin with a=2437,b=875
    * */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//a
        int b=sc.nextInt();//b
        int x=a,y=b;
        while (x == y){
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        System.out.println(x+" "+y);


    }
}

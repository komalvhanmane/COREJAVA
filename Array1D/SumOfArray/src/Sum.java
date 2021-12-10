import java.util.Scanner;

public class Sum {
    //static method is called without creating object
    public static void SumArray(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum is :"+sum);
    }
    //return array from method
    public static int[] Add(int arr[]){

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        //accepting
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        SumArray(a);//Method for addition
        int []arr=Add(a);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum is :"+sum);
    }
}

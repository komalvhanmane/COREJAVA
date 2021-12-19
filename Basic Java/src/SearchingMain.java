import java.util.Scanner;

public class SearchingMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Searching s=new Searching();
        System.out.println("Enter the number of total elements ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("lets accept the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        s.binarySearch(arr,5);
       // s.linearSearch(arr,3);
    }
}

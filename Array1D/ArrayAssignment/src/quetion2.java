import java.util.Scanner;

public class quetion2 {
    public static void main(String[] args) {
        /*
        * Given an array , you must increment any duplicate elements are unique. in
        * Addtion, the sum of its elements mmust be minimum. for ex if arr = [3,2,1,2,7],
        * then arrUnique = [3,2,1,4,7]
        * and sum of all its elements is
        * write a program fi*/
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]==arr[i]){
                    arr[j]+=2;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}

import java.util.Scanner;

public class SearchingMain {
    public static void main(String[] args) {
      /*  Scanner sc=new Scanner(System.in);
        Searching s=new Searching();
        System.out.println("Enter the number of total elements ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("lets accept the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter choice \n1-Linear search \n2- Binary Search");*/
      /*  String str="I am komal";
        StringBuilder ans= new StringBuilder("" + (str.charAt(0)));
        ans = new StringBuilder(ans.toString().toUpperCase());
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==' '){
                String temp=str.charAt(i)+"";
                ans.append(temp.toUpperCase());
            }
            else{
                ans.append(str.charAt(i));
            }
        }
        int i=3;
        System.out.println(ans);*/
        String message="aaaabbbccd";
        StringBuilder ans= new StringBuilder(message.charAt(0) + "");
        int c=1;
        for(int i=1;i<message.length();i++){
            if(message.charAt(i-1)==message.charAt(i)){
                c++;
            }
            else{
                ans.append(Integer.toString(c));
                ans.append(message.charAt(i));
                c=1;
            }
        }
        ans.append(Integer.toString(c));
        System.out.println(ans);
    }
}

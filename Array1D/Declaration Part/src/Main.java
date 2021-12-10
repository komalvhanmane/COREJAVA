import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Both Valid Declaration
        int []a;
        int a1[];
        byte byteArray[];
        short shortArray[];
        int intArray[];
        long longArray[];
        char charArray[];
        boolean booleanArray[];
        float floatArray[];
        double doubleArray[];

        //Allocating Memory To Array
        a1=new int[3];//Java all arrays are dynamically allocated
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }
        //Displaying
        for(int i=0;i<a1.length;i++){
            System.out.println("Element "+(i+1)+" is :"+a1[i]);
        }
    }
}

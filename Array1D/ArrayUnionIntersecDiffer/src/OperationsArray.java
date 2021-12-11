import java.util.Scanner;

public class OperationsArray {
    Scanner sc=new Scanner(System.in);
    public int[] createArray(){
        System.out.println("Enter the Total the Number of elements in an array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the Array Element Number "+(i+1));
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public int Union (int[] arr1, int[] arr2,int[]result){
       // int maxsize=arr1.length+ arr2.length;
        //int[] result =new int[maxsize];
        int c=0;
        if(arr1.length>arr2.length){
            for(int i=0;i<arr1.length;i++){
                c++;
                result[i]=arr1[i];
            }
            for(int j=0;j<arr2.length;j++){
                boolean flag=true;
                for(int i=0;i<arr1.length;i++){
                    if(arr2[j]==arr1[i]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    result[c]=arr2[j];
                    c++;
                }
            }
        }
        else{
            for(int i=0;i<arr2.length;i++){
                c++;
                result[i]=arr2[i];
            }
            for(int j=0;j<arr1.length;j++){
                boolean flag=true;
                for(int i=0;i<arr2.length;i++){
                    if(arr1[j]==arr2[i]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    result[c]=arr1[j];
                    c++;
                }
            }
        }
        return c;
    }
    public int intersection(int[] arr1, int[] arr2, int[] result){
        int c=0;
        if(arr1.length<arr2.length){
            for(int j=0;j<arr2.length;j++){
                boolean flag=true;
                for(int i=0;i<arr1.length;i++){
                    if(arr2[j]==arr1[i]){
                        flag=false;
                        break;
                    }
                }
                if(!flag){
                    result[c]=arr2[j];
                    c++;
                }
            }
        }
        else{
            for(int j=0;j<arr1.length;j++){
                boolean flag=true;
                for(int i=0;i<arr2.length;i++){
                    if(arr1[j]==arr2[i]){
                        flag=false;
                        break;
                    }
                }
                if(!flag){
                    result[c]=arr1[j];
                    c++;
                }
            }
        }
        return c;
    }
    public int difference(int[]arr1,int[]arr2,int result[]){
        //int temp[];
        int minsize=0;
        if(arr1.length>arr2.length){
            minsize=arr1.length;
        }
        else{
            minsize=arr2.length;
        }
        int c=0;
        int temp[]=new int[minsize];//intersection
        intersection(arr1,arr2,temp);
        for(int j=0;j<temp.length;j++){
            boolean flag=true;
            for(int i=0;i<arr1.length;i++){
                if(temp[j]==arr1[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                result[c]=arr1[j];
                c++;
            }
        }
        return c;
    }
    public void displayArray(int[]arr,int n){
       // System.out.println("-----------------------Displauying Array-----------------------------");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
public class SetOperations {
    public static void main(String[] args) {
        int[] arr ={2,4,5,6,7};
        int[] arr1 ={2,8,9,4};
        int[] ArrU =new int[20];//Union
        int[] ArrInt =new int[20];//Intersection
        int i,j,k=0,j1=0;
        for(i=0;i<arr.length;i++,k++){
            ArrU[k]=arr[i];//First Converting All element in Union
        }
        for(i=0;i<arr1.length;i++){
            boolean b=true;
            for(j=0;j<arr.length;j++){
                if(arr1[i]==arr[j]){
                    b=false;
                    break;
                }
            }
            if(b){
                ArrU[k]=arr1[i];
                k++;
            }else {
                ArrInt[j1]=arr1[i];
                j1++;
            }
        }
        System.out.println("Union");
        for(i=0;i<k;i++){
            System.out.print(" "+ArrU[i]);
        }
        System.out.println("\nIntersection");
        for(i=0;i<j1;i++){
            System.out.print(" "+ArrInt[i]);
        }
    }


}

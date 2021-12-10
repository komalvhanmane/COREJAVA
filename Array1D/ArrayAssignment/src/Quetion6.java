public class Quetion6 {
    public static void main(String[] args) {
        int[] arr ={4,2,-1,3,6};

        for(int i=0;i<5;i++){//0
            for(int j=0;j<=i;j++){//0<0
                int sum=0;
                sum=sum+arr[j];//4
                if(sum==0){
                    System.out.println("Happy");
                }
            }
        }
    }
}

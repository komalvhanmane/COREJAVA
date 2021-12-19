public class Searching {
    public void linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at position "+(i+1));
                break;
            }
        }
    }
    public void binarySearch(int[] arr, int key){//1 2 3 4 5  , 5
        int start=0;
        int end=arr.length-1;//4
        int mid;
        while (start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("Element found at "+mid);
                break;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
        }
    }
}

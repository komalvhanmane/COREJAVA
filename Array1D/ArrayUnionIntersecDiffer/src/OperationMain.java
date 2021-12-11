public class OperationMain {
    public static void main(String[] args) {
        OperationsArray op=new OperationsArray();
        int arr1[]=op.createArray();
        int arr2[]=op.createArray();
        int maxsize=arr1.length+ arr2.length;
        int result[]=new int[maxsize];
        int size=op.Union(arr1,arr2,result);
        System.out.println("\n\nArray 1: ");
        op.displayArray(arr1,arr1.length);
        System.out.println("\n\nArray 2: ");
        op.displayArray(arr2, arr2.length);
        System.out.println("\n\nUnion of Two above arrays : ");
        op.displayArray(result,size);
        int minsize=0;
        if(arr1.length>arr2.length){
            minsize=arr1.length;
        }
        else{
            minsize=arr2.length;
        }
        int result1[]=new int[minsize];
       int c= op.intersection(arr1,arr2,result1);
        System.out.println("\n\nIntersection of Two above arrays : ");
        op.displayArray(result1,c);
        System.out.println("\n\nDifference of Arr1 and Arr2 : ");
        int result2[]=new int[arr1.length];
        int c1=op.difference(arr1,arr2,result2);
        op.displayArray(result2,c1);
    }
}

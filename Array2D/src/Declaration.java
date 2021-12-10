public class Declaration {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{4,3,3}};
        //displaying
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}

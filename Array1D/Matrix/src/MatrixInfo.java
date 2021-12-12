import java.util.Scanner;

public class MatrixInfo {
    Scanner sc=new Scanner(System.in);
    public int[][] createMatrix(){
        System.out.println("Enter the Row Number ");
        int row=sc.nextInt();
        int Matrix[][]=new int[row][];
        for(int i=0;i<Matrix.length;i++){
            System.out.println("Enter the Col in "+(i+1)+" Row");
            Matrix[i]=new int[sc.nextInt()];
        }
        return Matrix;
    }
    public void insert(int [][]matrix){
        for(int i=0;i< matrix.length;i++){
            System.out.println("Enter the Row "+(i+1)+"Elements ");
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    public void display(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print("\t"+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public void addition(int Matrix1[][],int Matrix2[][]){
        int[][]Matrix=null;
        if(Matrix1.length!=Matrix2.length){
            System.out.println("Addition Not Possible");
        }
        else{
            int i;
            for(i=0;i<Matrix1.length;i++){
                if(Matrix1[i].length!=Matrix2[i].length){
                    break;
                }
            }
            if(i==Matrix1.length){
                Matrix=new int[Matrix1.length][];
                for(int k=0;k< Matrix.length;k++){
                    Matrix[k]=new int[Matrix1[k].length];
                }
                for(int j=0;j< Matrix1.length;j++){
                    for(int k=0;k<Matrix1[j].length;k++){
                        Matrix[j][k]=Matrix1[j][k]+Matrix2[j][k];
                    }
                }
                System.out.println("Addtion Matrix");
                display(Matrix);
            }
            else{
                System.out.println("Addition Not Possible");
            }
        }
    }
    public void Multiplication(int[][]Matrix1,int[][]Matrix2){
        int[][]Matrix = new int[Matrix1[0].length][Matrix2.length];
        if(Matrix1[0].length==Matrix2.length){
            for(int i=0;i< Matrix1.length;i++){
                for(int j=0;j<Matrix1[i].length;j++){
                    Matrix[i][j]=0;
                    for(int k=0;k< Matrix2.length;k++){
                        Matrix[i][j]+=Matrix1[i][k]*Matrix2[k][j];
                    }
                }
            }
            display(Matrix);
        }
        else{
            System.out.println("Multiplication Invalid");
        }
    }
}

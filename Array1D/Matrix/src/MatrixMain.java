import java.util.Scanner;

public class MatrixMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MatrixInfo mi=new MatrixInfo();
        System.out.println("Matrix 1");
        int[][] Matrix =mi.createMatrix();
        System.out.println("Matrix 2");
        int[][] Matrix1 =mi.createMatrix();
        System.out.println("Matrix 1");
        mi.insert(Matrix);
        System.out.println("Matrix 2");
        mi.insert(Matrix1);
        System.out.println("Matrix 1");
        mi.display(Matrix);
        System.out.println("Matrix 2");
        mi.display(Matrix1);
       // mi.addition(Matrix,Matrix1);
        //mi.display(result);
        mi.Multiplication(Matrix1,Matrix);
    }
}

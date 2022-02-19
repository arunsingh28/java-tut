import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of rows: ");
      int rows = sc.nextInt();
      System.out.print("Enter number of columns: ");
      int cols = sc.nextInt();
      int[][] matrix = new int[rows][cols];
      // input
      System.out.println("Enter the elements of the matrix");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix.length; j++) {
            System.out.print("Enter element " + i + " " + j + ":");
            matrix[i][j] = sc.nextInt();
         }
      }
      // output
      System.out.println("Output");
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix.length; j++) {
            System.out.print("Matrix " + i + " " + j + ":");
            System.out.println(matrix[i][j]);
         }
      }

   }
}

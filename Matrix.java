import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
   public static void main(String[] args) {
      int[][] matrix = new int[3][3];
      Scanner sc = new Scanner(System.in);
      // input
      System.out.println("Enter the elements of the matrix");
      for (int i = 0; i <= matrix.length; i++) {
         for (int j = 0; j <= matrix.length; j++) {
            System.out.println("Enter element " + i + " " + j);
            matrix[i][j] = sc.nextInt();
         }
      }
      // output
      System.out.println("Output");
      for (int i = 0; i <= 3; i++) {
         for (int j = 0; j <= 3; j++) {
            matrix[i][j] = sc.nextInt();
         }
      }

   }
}

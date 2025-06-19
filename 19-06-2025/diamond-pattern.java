import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the diamond (half height): ");
        int numRows = scanner.nextInt();

      // first half
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

      //second half 
        for (int i = numRows - 1; i >= 1; i--) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}


/// Output

Enter the number of rows for the diamond (half height): 3
  
  *
 ***
*****
 ***
  *

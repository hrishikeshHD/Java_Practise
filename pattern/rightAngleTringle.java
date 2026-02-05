package pattern;//printing the right angle tringle

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rightAngleTringle{
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the height of the triangle");

        int n = Integer.parseInt(br.readLine());
        /// for printing the right angle triangle
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /// for printing the hollow right angle triangle

        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
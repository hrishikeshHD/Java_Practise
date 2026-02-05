package pattern;

import java.util.Scanner;

public class invertRotatedHPyramid{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){

            //loop for spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");
            }
            //loop for stars
            for(int k = 0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
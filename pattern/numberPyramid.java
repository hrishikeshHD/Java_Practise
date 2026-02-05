package pattern;

import java.util.Scanner;

public class numberPyramid{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            //for spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print("  ");

            }
            //for numbers
            for(int j = i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int k = 2;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
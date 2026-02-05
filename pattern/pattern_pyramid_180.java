package pattern;

import java.util.*;
public class pattern_pyramid_180{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the pyramid");
        int size = sc.nextInt();

        for(int i = 1;i<=size;i++){
            //loop for spaces
            for(int j = 1;j<=size-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
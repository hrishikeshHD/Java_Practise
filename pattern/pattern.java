package pattern;

import java.util.*;
public class pattern {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        //we are printing star pattern of 4*5 with space after each star

        System.out.println("Enter the number of rows ");
        int row = sc.nextInt();
        System.out.println("Enter the number of colums ");
        int col = sc.nextInt();

        //outer for loop for number of rows
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package pattern;

import java.util.*;
public class pattern_inverted_hPyramid{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pyramid ");

        int size = sc.nextInt();

        System.out.println("Which Pyramid do you want ? ( 2 - '*' || 1 - 'numbers' ) ");
        int choice = sc.nextInt();
        if (choice == 1) {
            for (int i = size; i > 0; i--) {
                for (int j = i; j > 0; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        else if(choice ==2){
            for(int i = size;i>0;i--){
                for(int j = i;j>0;j--){
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
        else{
            System.out.println("Invalid Choice. Enter the correct choice ");
        }
    }
}
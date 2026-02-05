package pattern;

import java.util.*;
public class pattern_floyd{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size you want to proceed with ");
        int size = sc.nextInt();
        int num = 1;
        for(int i = 1;i<=size;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

    }
}
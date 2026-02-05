package pattern;

import java.util.Scanner;

public class numSpacePyramid{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i =1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for numbers
            for(int j = 1;j<=(2*i)-1;j++){
                if(j%2!=0) {
                    System.out.print(i + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

    }
}
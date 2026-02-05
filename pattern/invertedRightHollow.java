package pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class invertedRightHollow{
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the height of triangle");

        int height = Integer.parseInt(br.readLine());

        for(int i = height;i>0;i--){
            for(int j = 1;j<=i;j++){
                if(i==height || j == 1 || i==j ){
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
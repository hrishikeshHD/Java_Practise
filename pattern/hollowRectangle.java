package pattern;
// Hollow rectangle

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hollowRectangle{
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows ");
        int row = Integer.parseInt(br.readLine());
        System.out.println(" and columns  ");
        int col = Integer.parseInt(br.readLine());

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(i==0 || j==0||i==row-1||j==col-1){
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
package pattern;
//5*5 solid rectangle;

import java.util.*;

public class basicStar{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);

       System.out.println("enter the height pf stars you want to print ");
       int n = sc.nextInt();

       for(int i = 0;i<n;i++){
           for(int j =0;j<n;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}
package pattern;//*****
//****
//***
//**
//*

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class invertedTriangle{
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of stars you want to print ");
        int n = Integer.parseInt(br.readLine());

        for(int i =n;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
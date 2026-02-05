package Array;

public class array{
    public static void main(String [] args){
        String [] s= new String[5];
    s[0] = "Hello";
    s[1] = "My";
    s[2] = "Name";
    s[3] = "is";
    s[4] = "RAJESH";

        for(String i :s){
            System.out.print(i+ " ");
        }
    s[0] = "NOT HELLO ";
        for(String i :s){
            System.out.print(i+ " ");
        }
    }
}
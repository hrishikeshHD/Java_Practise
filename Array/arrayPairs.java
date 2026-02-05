package Array;
public class arrayPairs{

    public static void arrans(int [] arr){
        System.out.print("(");
        for(int i = 0;i<arr.length;i++){
            int current = arr[i];

            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
        System.out.print(")");

    }

    public static void main(String [] args){
        int arr[] = {2,1,3,4,5};

        arrans(arr);
    }
}
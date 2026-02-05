package Array;

public class pairSum{
    public static void sumPairs(int []arr,int sum){
        for(int i = 0;i<arr.length;i++){
            int current = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(current+arr[j] == sum){
                    System.out.print("("+current+","+arr[j]+") ");
                }
            }
        }
    }
public static void main(String [] args){
    int [] arr = {0,1,2,4,5,3};
    int sum = 5;

    sumPairs(arr,sum);
}
}
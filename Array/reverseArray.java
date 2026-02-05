package Array;

public class reverseArray{
    public static int [] rev(int [] arr){
        int size = arr.length;
        int [] rev =new int [size];
        int j = 0;
        for(int i =  size-1;i>=0;i--){
            rev[j]=arr[i];
            if(j<size-1){
                j++;
            }
        }
        return rev;
    }

    public static int[] revOptimise(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        return arr;
    }

    public static void main(String [] args){
        int []arr = {1,3,4,5,6,7,8};
        System.out.println("BruteForce Approach");
        for(int i : rev(arr)){
        System.out.print(i+" ");
        }

        System.out.println("\nOptimised Approach ");

        for(int i :revOptimise(arr)){
            System.out.print(i+" ");
        }

    }
}
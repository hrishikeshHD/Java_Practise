package Array;

public class arrayMaxMin {

    public static int[]  minmax(int [] arr){
        int [] minmax = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        minmax[0] = min;
        minmax[1]=max;
        return minmax;
    }
    public static void main(String []args){
        int [] arr = {2,9,6,7,3,1,9,7};
        int [] result = minmax(arr);
        System.out.println("the min element in array is : "+result[0]);

        System.out.println("the max element in array is : "+result[1]);

    }
}

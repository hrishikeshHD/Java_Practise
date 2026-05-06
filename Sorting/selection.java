package Sorting;

public class selection {
    public static void main(String[]args){
        int [] arr={3,6,2,5,1,8,4,0};

        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            int minPos = i;
            for(int j = i+1;j<len;j++){
                if(arr[j]<arr[minPos]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

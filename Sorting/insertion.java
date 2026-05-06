package Sorting;

public class insertion {


    //logic only search if element (j)<(j-1) if so do the swapping
    // run the loop j-- till j>0;

    public int [] insertSort(int [] arr){
        for(int i = 1;i<arr.length -1 ;i++) {
            int curr = arr[i];
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
//            int prev = i-1;
//
//            while(prev >=0 && arr[prev]>curr){
//                arr[prev+1] = arr[prev];
//                prev--;
//            }
//            arr[prev+1] = curr;
        }
        return arr;
    }

    public static void main(String [] args){
        int [] arr = {2,4,1,5,6,3};

        insertion in = new insertion();
        int [] ans = in.insertSort(arr);
        for(int i :ans){
            System.out.print(i+" ");
        }

    }
}

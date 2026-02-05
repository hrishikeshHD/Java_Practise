package Array;

public class binaryS{

    public static int binaryS(int[] arr,int key ){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
    public static void main(String [] args) {
        int[] arr = {2, 3, 4, 5, 7, 8, 9, 12, 14, 15, 16, 17, 18};

        int key = 6;
        int op = binaryS(arr,key);
        if (op == -1) {
            System.out.println("key is not present in the Array");
        } else {
            System.out.println("Key is present at "+ op);
        }
    }
}
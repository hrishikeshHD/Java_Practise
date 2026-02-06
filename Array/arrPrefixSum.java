package Array;

public class arrPrefixSum {
    public static void prefixS(int [] arr){
        int len = arr.length;
        int [] prefix = new int[len];
        int sum =arr[0];

        prefix[0]=arr[0];
        for(int i = 1;i< len;i++){
            sum += arr[i];
            prefix[i]=sum;
        }
//        for(int i:prefix){
//            System.out.print(i+" ");
//        }
        int maxSum = 0;
        for(int i = 0;i< len;i++){
            int start = i;
            int currentSum = 0;
            for(int j = i;j< len;j++){
                int end = j;
                System.out.print(arr[start]+" ");
                currentSum = start == 0 ? prefix [end] : prefix[end] - prefix[start-1];
                System.out.print(arr[end]+" ");
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
                System.out.print(" => "+currentSum+"\n");
            }

        }
        System.out.print(maxSum);
    }

    public static void main(String [] args){
        int [] arr = {2,4,3,-3,-1,2};
        prefixS(arr);

    }
}

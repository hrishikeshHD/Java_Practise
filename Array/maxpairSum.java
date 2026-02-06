package Array;

public class maxpairSum{
    public static void maxsum(int []arr){
        int maxs = 0;

        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
                int nsum = 0;
                int end = j;
                System.out.print("[");
                for(int k = start;k<=end;k++){
                    nsum+=arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.out.print("]");
                System.out.println(" = "+nsum);
                if(maxs<nsum){
                    maxs=nsum;
                }
            }
        }
        System.out.println(maxs);

    }

    public static void main(String[]args){
        int [] arr = {2,4,6,8,10};
        maxsum(arr);
    }
}
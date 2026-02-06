///basic logic behind the kadane code is we iterate through and will get the
/// sub arrays sum if current sum += (arr[i]) < 0 then current sum = 0;
/// and also we will add the max sum only the highest value thus will get the highest sum
/// catch ** this only works if largest sub array sum is positive
/// if all elements are negative then it will not work directly.


package Array;
public class arrSumKadane {

    public static int kadan(int []arr){
        int msum = 0;
        int csum = 0;
        int len = arr.length;
        int maxnum = Integer.MIN_VALUE;
        for(int i = 0;i<len;i++){
            if(arr[i]>maxnum){
                maxnum = arr[i];
            }
            csum+=arr[i];

            if(csum<0){
                csum = 0;
            }
            msum = Math.max(csum,msum);
        }
        if(maxnum>0)
        return msum;
        else{
            return maxnum;
        }
    }

    public static void main(String []args){
    int []arr= {-2,-3,-1,-2,-3,0};
    System.out.println(kadan(arr)+" ");
    }
}

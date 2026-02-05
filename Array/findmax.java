package Array;



public class findmax{
    public static int find(int []arr){
    int max = Integer.MIN_VALUE;
    for(int i :arr)
        if (i>max) {
            max = i;
        }
    return max;

}
    public static int findsm(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i :arr){
            if(min>i){
                min = i;
            }
        }
        return min;
    }

    public static void main(String []args){
        int [] arr = {10,3,9,1,100,2,87,};
        System.out.println("The largest element in Array is "+find(arr));
        System.out.println("The smallest element in Array is "+findsm(arr));

    }
}
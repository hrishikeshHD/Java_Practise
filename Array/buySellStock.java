package Array;

public class buySellStock {
    public static void stockProfit(int [] arr) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i = 0;i< arr.length;i++){
            if(buyPrice<arr[i]){
                int profit = arr[i] - buyPrice;
                maxprofit = Math.max(profit,maxprofit);
            }
            else{
                buyPrice = arr[i];
            }
        }
        System.out.println(maxprofit);
    }
    public static void main(String [] args){
        int [] height={2,6,4,7,8,2,1};
        stockProfit(height);

    }
}

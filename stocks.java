public class stocks {
    public static void main(String[] args) {
        int prices[]={7,2,5,3,1,6};
        //int prices[]={4,3,2,1};
        solution(prices);
    }
    public static void solution(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0 ;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        System.out.println(maxProfit);
    }
}

public class HundredFourtyNine {
    public static void main(String[] args) {
        // Program 149: Best time to buy and sell stocks
        int[] prices = {2, 1, 2, 1, 2, 1};
        int result = maxProfit(prices);
        System.out.println(result);
    }

    public static int maxProfit(int[] prices) {
        int buy=0, max = 0;

        for (int sell=1; sell<prices.length; sell++) {
            if (prices[buy] > prices[sell]) {
                buy = sell;
            } 
            max = Math.max(max, prices[sell] - prices[buy]);
        }
        return max;
    }
}

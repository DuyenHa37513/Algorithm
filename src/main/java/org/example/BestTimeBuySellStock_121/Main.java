package org.example.BestTimeBuySellStock_121;

public class Main {
    public static void main(String[] args) {
        int[] prices = {3,1,6,1,2,4};
        Way1 bt = new Way1();
        Way2 w2 = new Way2();
        System.out.println(w2.maxProfit(prices));;
    }
}

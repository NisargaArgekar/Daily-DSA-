import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] prices = new int[n];
            for(int i=0; i<n; i++)
            {
                prices[i] = sc.nextInt();
            }

            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for(int price:prices){
                if(price < minPrice){
                    minPrice = price;
                }
                else if(price - minPrice > maxProfit){
                    maxProfit = price - minPrice;
                }
            }
        System.out.println("Max Profit: " + maxProfit);
    }
}

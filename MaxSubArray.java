import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(maxProduct(num));

    }

    public static int maxProduct(int[] num){

        int maxEnding = num[0];
        int minEnding=num[0];
        int result = num[0];
        for(int i=1; i<num.length; i++){
            if(num[i] < 0){
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }
            maxEnding = Math.max(num[i], num[i]*maxEnding);
            minEnding = Math.min(num[i], num[i]*minEnding);
            result = Math.max(result, maxEnding);
        }

        return result;
    }
    
}

import java.util.Scanner;

public class SumofEvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            }
            else {
                oddSum += arr[i];
            }
        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd sum: " + oddSum);
    }
}
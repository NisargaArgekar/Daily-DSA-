import java.util.Scanner;

public class DescendingOrderCharm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(minSpells(arr));
    }

    public static int minSpells(int[] arr){
        int res = 0;
        for(int i=0; i<= arr.length-2; i++){
            if(arr[i+1] > arr[i]){
                res = res + arr[i+1] - arr[i];
                arr[i+1] = arr[i];
            }
        }
        return res;
    }
    
}

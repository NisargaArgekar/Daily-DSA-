import java.util.Scanner;

public class firstPeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

       
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            boolean leftcheck = (i == 0 || arr[i] > arr[i-1]);
            boolean rightcheck = (i == arr.length - 1 || arr[i] > arr[i+1]);
            if(leftcheck==true && rightcheck== true){
                System.out.println(i + " ");
                break;
            }
        }
    }
}
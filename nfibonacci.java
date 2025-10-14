import java.util.Scanner;

public class nfibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c ;
        for(int i=3; i<n; i++){
            c = a+b;
            b = a;
            a = c;
        }
    }
}

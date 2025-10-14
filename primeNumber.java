import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1){
            System.out.println(n + " not a Prime number");
        }
        else {
            findPrime(n);
        }
    }

        //  int count = 0;N
        // for(int i=2; i<= n; i++){
        //     if(n % i == 0){
        //         count++;
        //     }
        // }

        // if(count == 0){
        //     System.out.println(n + " is a prime number");
        // } else {
        //      System.out.println(n + " is not a prime number");
        // }

        // int count = 0;
        // for(int i=2; i<= Math.sqrt(n); i++){
        //     if(n % i == 0){
        //         count++;
        //     }
        // }

        // if(count == 0){
        //     System.out.println(n + " is a prime number");
        // } else {
        //      System.out.println(n + " is not a prime number");
        // }

   public static void findPrime(int n){
         int count = 0;
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                count++;
            }
        }

        if(count == 0){
            System.out.println(n + " is a prime number");
        } else {
             System.out.println(n + " is not a prime number");
        }
    }
    
}
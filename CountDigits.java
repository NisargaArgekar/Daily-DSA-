// /Optimal Solution

public class CountDigits{
    public static void main(String[] args){
        int n = 12345678;
        int count = 0;
        int temp = n;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        System.out.println("Digits: " + count);
    }
}




// Brute force 
// public class countingDigits {
//     public static void main(String[] args){
//         int n = 1234567890;
//         String num = String.valueOf(n);
//         System.out.println("Digits: " + num.length());
//     }
// }



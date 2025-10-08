public class ArmStrong {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            sum +=  digit * digit * digit;
            temp /= 10;
        }
        if(sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not Armstrong number");
        }
    }
}

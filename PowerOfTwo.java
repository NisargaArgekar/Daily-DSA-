// Check if a Number is a Power of 2

public class PowerOfTwo {
    public static void main(String[] args){
        int num = 17;
        if(num > 0 && (num & (num -1)) == 0) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is Not a power of 2.");
        }
    }
}

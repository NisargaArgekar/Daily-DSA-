import java.util.Scanner;

public class RemoveLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int num = sc.nextInt();

        int n = num;
        n = num / 10;
        System.out.println("Number after removing last digit: " + n);
    }
}

import java.util.Scanner;

public class simply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = scan.next();
        char org[] = s.toCharArray();
        int n = org.length;
        char rev[] = new char[n];
        int j = rev.length-1;
        for(int i=0; i<=n-1; i++){
            rev[j] = org[i];
            j--;
        }
        String revs = new String(rev);
        System.out.println(revs);
    }
}
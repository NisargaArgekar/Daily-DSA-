import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][];
        a[0] = new int[5];
        a[1] = new int[4];
        a[2] = new int[3];
        System.out.println("Enter the ELements");
        for(int i=0; i<a.length-1; i++) {
            for(int j=0; j<a[i].length-1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements are: ");
         for(int i=0; i<a.length-1; i++) {
            for(int j=0; j<a[i].length-1; j++) {
               System.out.println(a[i][j] + " ");
            }
        }
    }
}

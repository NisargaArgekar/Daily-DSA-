import java.util.Scanner;

public class CommonELements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int[] c = new int[n];
        int res = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    boolean exists = false;

                    for (int k = 0; k < res; k++) {
                        if (c[k] == a[i]) {
                            exists = true;
                            break;
                        }
                    }

                    if (!exists) {
                        c[res] = a[i];
                        res++;
                    }
                }
            }
        }

        System.out.print("Common Elements: [ ");
        for (int i = 0; i < res; i++) {
            if (i < res - 1) {
                System.out.print(c[i] + ", ");
            } else {
                System.out.print(c[i]);
            }
        }
        System.out.println(" ]");
    }
}

import java.util.*;

public class AddRemoveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> supplies = new ArrayList<>();
        for(int i=0; i<n; i++){
            supplies.add(sc.next());
        }

        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            String purchasedItem = sc.next();
            supplies.remove(purchasedItem);
        }
    }
}

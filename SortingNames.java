import java.util.*;

public class SortingNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        TreeSet <String> names = new TreeSet<>();
        System.out.println("Enter names: ");
        for(int i=0; i<n; i++){
            String name = sc.nextLine();
            names.add(name);
        }
        
        System.out.println("Sorted names: ");
        for(String name : names){
            System.out.println(name);
        }
    }
    
}

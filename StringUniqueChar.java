import java.util.HashSet;
import java.util.Scanner;

public class StringUniqueChar {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    HashSet<Character> set = new HashSet<>();
    boolean isUnique = true ;
    for(char c : s.toCharArray()){
       if(set.contains(c)){
        isUnique = false;
        break;
       }
       set.add(c);
    }
    System.out.println(isUnique);
}
}

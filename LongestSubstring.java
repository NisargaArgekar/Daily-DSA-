import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int n = s.length();
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);

        int left = 0;
        int maxLength = 0;

        for(int right = 0; right<n; right++){
            char ch = s.charAt(right);

            if(lastIndex[ch] >= left){
                left = lastIndex[ch] + 1;
            }

            lastIndex[ch] = right;
            maxLength=Math.max(maxLength, right- left + 1);
        }
        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
    }
}

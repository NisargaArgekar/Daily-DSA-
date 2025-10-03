import java.util.*;
public class UniqueAdjacentChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reorganizeString(s));
    }

    public static String reorganizeString(String s){
        int n = s.length();
        int count[] = new int[26];

        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            char ch = arr[i];
            count[ch - 'a']++;
        }

        int maxFreq = 0, maxChar = 0;
        for(int i = 0; i<=count.length-1; i++){
            if(count[i] > maxFreq) {
                maxFreq = count[i];
                maxChar = i;
            }
        }

        if(maxFreq > (n+1)/2) return "";
        char[] result = new char[n];
        int idx = 0;

        while(count[maxChar] > 0){
            result[idx] = (char) (maxChar + 'a');
            idx += 2;
            count[maxChar]--;
        }

        for(int i=0; i<26; i++){
            while(count[i] > 0){
                if(idx >= n) idx=1;
                result[idx] = (char)(i+'a');
                idx+=2;
                count[i]--;
            }
        }
        return new String(result);
    }
}

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq)
            if (count != 0) return false;

        return true;
    }
}














































// import java.util.Arrays;

// public class ValidAnagram{
//     public static void main(String[] args) {
//         String s = "anagram";
//         String t = "nagaram";


//         System.out.println(isAnagram(s, t));

//     }


//     public static boolean isAnagram(String s, String t){
//         if(s.length() != t.length()) 
//             return false;
//         else {
//         {

//             char[] arr1 = s.toCharArray();
//             char[] arr2 = t.toCharArray();

//             Arrays.sort(arr1);
//             Arrays.sort(arr2);

//             return Arrays.equals(arr1, arr2);
//         }
//     }
//     }
// }
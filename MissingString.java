import java.util.HashSet;

public class MissingString {
    public static void main(String[] args) {
        String[] arr1 = {"apple", "banana", "mango", "grape"};
        String[] arr2 = {"banana", "grape", "apple"};

        System.out.println(findMissing(arr1, arr2));
    }

    public static String findMissing(String[] arr1, String[] arr2) {
        HashSet<String> set = new HashSet<>();
        for (String s : arr2) {
            set.add(s);
        }

        for (String s : arr1) {
            if (!set.contains(s)) {
                return s;
            }
        }

        return "";
    }
}









































//  Brute force for finding the missing string in the given array
// public class MissingString {
//     public static void main(String[] args) {
//         String[] arr1 = {"apple", "banana", "mango", "grape"};
//         String[] arr2 = {"banana", "grape", "apple"};

//         System.out.println(findMissing(arr1, arr2));
//     }

//     public static String findMissing(String[] arr1, String[] arr2) {
//         for (int i = 0; i < arr1.length; i++) {
//             boolean found = false;
//             for (int j = 0; j < arr2.length; j++) {
//                 if (arr1[i].equals(arr2[j])) {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) {
//                 return arr1[i];
//             }
//         }
//         return "";
//     }
// }

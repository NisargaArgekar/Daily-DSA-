// num = [1,2,3,4,1]

// Brute Force with Time Complexity: o(n^2) and Space Complexity:o(1) 

// public class ContainsDuplicate{
//     public static void main(String[] args) {
//         int num[] = {1,2,3,4};
//         System.out.println(Duplicate(num));
       
//     }

//     public static boolean Duplicate(int[] num){
//          for(int i=0; i<num.length; i++){
//             for(int j=i+1; j<num.length; j++){
//                 if(num[i] == num[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// Better approach using Sorting with --Time Complexity: o(n log n) --Space Complexity: o(1)

import java.util.Arrays;

public class ContainsDuplicate{
    public static void main(String[] args) {
        int[] num = {1,7,2,3,7};
        System.out.println(Duplicate(num));
    }

    public static boolean Duplicate(int[] num){
        Arrays.sort(num);
        for(int i=1; i<num.length; i++){
            if(num[i] == num[i-1]){
                return true;
            }
        }
        return false;
    }
}
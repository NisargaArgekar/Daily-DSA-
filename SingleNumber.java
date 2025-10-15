import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,3,2,4,5,5};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num:arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num: map.keySet()) {
            if(map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}














// brute force for finding out the non-repeating elements in array

// public class SingleNumber {
//     public static void main(String[] args) {
//         int arr[] = {1,1,2,2,3};
//         System.out.println(singleNumber(arr));
//     }

//     public static int singleNumber (int[] arr) {
       
//         for(int i=0; i<arr.length; i++){
//              int count = 0;
//             for(int j=0; j<arr.length; j++){
//                 if(arr[i] == arr[j]) {
//                     count++;
//                 }
//             }

//             if(count == 1) {
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
// }

// public class CheckSorted {
//     public static boolean arraySorted(int[] arr) {
//     for(int i=0; i<arr.length - 1; i++){
//             if(arr[i] > arr[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }
    
//     public static void main(String[] args){
//         int[] arr = {1,0,5,9,2,7};
//         System.out.println(arraySorted(arr));
//     }
// }





// Brute force 
public class CheckSorted{
    public static void main(String[] args){
       int[] arr = {1,2,3,4,5,6,7,8};
       boolean isSorted = true;
       for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] > arr[j]){
                isSorted = false;
                break;
            }
        }
        if(!isSorted) break;
       }

       if(isSorted){
        System.out.println("Array is sorted");
       } else{
        System.out.println("Array is not sorted");
       }
    }
}
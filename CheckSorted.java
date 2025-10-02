public class CheckSorted {
    public static boolean arraySorted(int[] arr) {
    for(int i=0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] arr = {1,0,5,9,2,7};
        System.out.println(arraySorted(arr));
    }
}






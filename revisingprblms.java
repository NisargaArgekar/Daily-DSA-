public class revisingprblms {
     public static void main(String[] args){

    //  ------ REVERSE ARRAY ------
    //     int[] arr = {1, 2, 3, 5, 6, 7};
    //     int start = 0;
    //     int end = arr.length - 1;

        
    //         while(start < end) {
    //             int temp = arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;
    //             start ++;
    //             end --;
    //         }
        
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+ " ");
    //     }


        int[] arr = {3, 7, 1, 8, 2};
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            
            if(arr[i] >  max){
                max = arr[i];
            }
        }
       
         System.out.println(" Maximum Element " + max);
       

    }
}

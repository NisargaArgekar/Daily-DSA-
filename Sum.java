public class Sum {
    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5};

         double sum = findSum(arr);
         System.out.println(sum);
    }

    public static double findSum(double arr[]) {
        double sum = 0;
        for(int i=0; i< arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

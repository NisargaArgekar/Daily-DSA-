public class ContainsDuplicate {
    public static boolean dulicate(int[] num) {
        boolean isTrue = true;
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                if(num[i] == num[j]){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        
    }
}

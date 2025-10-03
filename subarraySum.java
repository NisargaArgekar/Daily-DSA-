import java.util.*;
public class subarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        int k = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int currsum = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            currsum += arr[i];
            if(map.containsKey(currsum-k)){
                count+= map.get(currsum-k);
            }
            map.put(currsum, map.getOrDefault(currsum, 0)+1);
        }
        System.out.println(count);
    }
}

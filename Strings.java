public class Strings {
    public static void main(String[] args) {
        String s1 = "Nisa";
        String s2 = "Nisa";

        String s3 = new String("Nisa");
        String s4 = new String("Nisa");

        // if(s1 == s2) {
        //     System.out.println("Both are equal");
        // } else {
        //     System.out.println("Both are not equal");
        // }     --> this compares the reference memory locations and here duplicates are not created in string pool.

         if(s3 == s4) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
        // --> this compares the reference memory locations and here duplicates are created in heap memory.
    }
}

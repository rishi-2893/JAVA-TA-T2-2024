public class MainClass{
    public static void main(String[] args) {

        // String Pooling
        String a = "Hello";
        String b = "Hallo";
        String c = "Hello";
          
        String s = "ABC";
        
        System.out.println(a == b); // True
    }
}



// public class MainClass{
//     public static void main(String[] args) {
//           String [] a = {'1', '2', '3'};
//           String [] b = {'1', '2', '3'};
          
//           System.out.println(a == b);
//     }
// }
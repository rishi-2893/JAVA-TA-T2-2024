public class CallByValueExample {

    public static void main(String[] args) {
        // primitive data type
        int num = 10;
        
        System.out.println("Before method call: " + num); // 10
        
        // primitive data type is passed to the function
        modifyValue(num);
        
        System.out.println("After method call: " + num); // 10
    }

    public static void modifyValue(int value) {
        value = 20;
        System.out.println("Inside method: " + value); // 20
    }
}

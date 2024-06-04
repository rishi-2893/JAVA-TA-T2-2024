class MyObject {
    int num;

    MyObject(int num) {
        this.num = num;
    }
}

public class CallByReferenceExample {
    public static void main(String[] args) {
        MyObject obj = new MyObject(10); // object

        System.out.println("Before method call: " + obj.num); // 10
        
        // object is passed to the function
        modifyObject(obj);
        System.out.println("After method call: " + obj.num); //20
    }
    public static void modifyObject(MyObject obj) {
        obj.num = 20;
        System.out.println("Inside method: " + obj.num); // 20
    }
}

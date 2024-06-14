public class MethodOverloading {
    void sayHi(){
        System.out.println("Hello User");
    }

    void sayHi(String username){
        System.out.println("Hello " + username);
    }
    public static void main(String[] args) {
        MethodOverloading method = new MethodOverloading();
        method.sayHi(); //  Hi User
        method.sayHi("Java"); // Hi Java
    }
}
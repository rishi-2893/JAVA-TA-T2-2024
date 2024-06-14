class Example{
    static int n = 0;
    Example(){
        n += 1;
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        
        Example ex1 = new Example();

        Example ex2 = new Example();
        
        Example ex3 = new Example();

        Example ex4 = new Example();
        System.out.println(Example.n);
    }
}
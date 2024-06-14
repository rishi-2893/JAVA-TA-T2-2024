class Example{
    private int n_pvt;
    Example(int n_pvt){
        n_pvt = n_pvt;
    }
    void getter(){
        System.out.println(n_pvt);
    }
}

public class PrivateVariable {
    public static void main(String[] args) {
        Example exObj = new Example(12);
        exObj.getter();
        
    }
}
public class Rectangle {
    int width, height;

    // First constructor with two parameters
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    // Second constructor with one parameter (overloaded)
    public Rectangle(int sideLength, String h) {
        width = sideLength;
        height = sideLength;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5, 10);

        Rectangle square = new Rectangle(7, "as");
        
        System.out.println("Rectangle dimensions: " + rect1.width + "x" + rect1.height);
        System.out.println("Square dimensions: " + square.width + "x" + square.height);
    }
}

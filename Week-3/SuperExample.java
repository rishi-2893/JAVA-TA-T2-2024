class Animal{
    int legs;
    String sound;

    Animal(int legs, String sound){
        this.legs = legs;
        this.sound = sound;
    }
}

class Dog extends Animal{
    int xyz;

    Dog(int legs, String sound, int xyz){
        // How to initialize all the attributes
        // M-1
        // this.legs = legs;
        // this.sound = sound;
        // this.xyz = xyz

        // Use constructor of parent to initialize the above attributes
        super(legs, sound);
        this.xyz = xyz;
    }
}


public class SuperExample {
    public static void main(String[] args){

    }
}

package Learning.methodoverriding;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
abstract class Animal {
    abstract void sound();  // Abstract method → must be overridden

    private Number eat() {            // Concrete method → optional to override
        System.out.println("Animal eats");
        return 0;
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        //super.eat();
        System.out.println("Dog barks");
    }
   public Double eat() {
        // Concrete method → optional to override
        System.out.println("Dog eats bones");
        return 0.00000;
    }
}


public class LearnOverriding {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Dog d = new Dog();
        d.eat();
        d.sound();

    }
}


    class Engine {
        // For testing purpose
    }

    class Car {
        Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }
    }

    public class Coupling {
        public static void main(String[] args) {
            Engine e = new Engine();         // Line 1
            Car c = new Car(e);              // Line 2

            // Print identity hash codes to simulate memory address
            System.out.println("e:           " + System.identityHashCode(e));
            System.out.println("c.engine:    " + System.identityHashCode(c.engine));
            System.out.println("c:           " + System.identityHashCode(c));

            // Check if references point to the same Engine object
            System.out.println("e == c.engine: " + (e == c.engine));
            //System.out.println("c==e" +(c == c.engine));
        }
    }



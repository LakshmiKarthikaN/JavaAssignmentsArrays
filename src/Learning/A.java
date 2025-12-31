package Learning;

public class A {

        public static void main(String[] args) {
            AccessModifier obj = new AccessModifier();

            // System.out.println(obj.privateNum); //  Not accessible (private)
            System.out.println(obj.defaultNum);    //  Accessible (default)
            System.out.println(obj.protectedNum);  // Accessible (protected)
            System.out.println(obj.publicNum);     // Accessible (public)

            // obj.privateMethod(); //  Not accessible (private)
            obj.defaultMethod();   // Accessible (default)
            obj.protectedMethod(); // Accessible (protected)
            obj.publicMethod();    // Accessible (public)
        }
    }



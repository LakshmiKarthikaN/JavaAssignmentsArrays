
package test;

import Learning.AccessModifier;

public class B extends AccessModifier {
    public static void main(String[] args) {
        B obj = new B();

        // System.out.println(obj.privateNum); //  Error: private
        // System.out.println(obj.defaultNum); // Error: default (not same package)
        System.out.println(obj.protectedNum);  //  OK: protected via inheritance
        System.out.println(obj.publicNum);     //  OK: public

        // obj.privateMethod(); //  Error
        // obj.defaultMethod(); //  Error
        obj.protectedMethod(); // OK: inherited
        obj.publicMethod();    // OK
    }
}

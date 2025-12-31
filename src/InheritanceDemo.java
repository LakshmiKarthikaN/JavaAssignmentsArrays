class A{
    int a=7;
    int b=20;//instance variable access the whole objects
    public void B(){

      System.out.println("Super class");

    }
}
class C extends A{
   public void D(){
       System.out.println("class D prints");
       System.out.println(super.b);//access super class variable
       super.B();//access super class method
   }
}

public class InheritanceDemo {

    public static void main(String[] args){
         C obj=new C();
         obj.D();
         //obj.B();
         System.out.println(obj.a);


    }
}

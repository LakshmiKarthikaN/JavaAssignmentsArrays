package Learning;

public class AccessModifier {
    private int privateNum = 1;
    int defaultNum = 2;            // default access
    protected int protectedNum = 3;
    public int publicNum = 4;

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

}

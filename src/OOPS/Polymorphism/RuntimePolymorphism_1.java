package OOPS.Polymorphism;

public class RuntimePolymorphism_1 extends MethodOverriding_1 {  //Runtime Polymorphism is method overriding
    public void engine() {  // method name and parameters should be same
        System.out.println("Express engine");
    }
    public void cc(int num)
    {
        System.out.println("High CC");

    }
    public static void main(String[] args) {

        RuntimePolymorphism_1 mo = new RuntimePolymorphism_1();
        {
            mo.engine();
            mo.engine();
            mo.cc(162);
        }
    }
}
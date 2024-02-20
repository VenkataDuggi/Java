package OOPS.Polymorphism;

public class MethodOverloading {

    public void engine()
    {
        System.out.println("Normal engine");
    }
    public void engine(String str)  //Compile time Polymorphism
    {
        System.out.println("Power engine");

    }

    public static void main(String[] args) {

        MethodOverloading mo = new MethodOverloading();

        mo.engine("xpress");

        mo.engine();
    }
}

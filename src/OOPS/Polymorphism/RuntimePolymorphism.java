package OOPS.Polymorphism;

public class RuntimePolymorphism extends MethodOverriding {  //Runtime Polymorhism is method overriding

    public void engine(String str) {
        System.out.println("Express engine");
    }

    public void cc(int num)
    {
        System.out.println("High CC");

    }

    public static void main(String[] args) {


        RuntimePolymorphism mo = new RuntimePolymorphism();
        {
            mo.engine();
            mo.engine("express");
            mo.cc(162);


        }
    }


}


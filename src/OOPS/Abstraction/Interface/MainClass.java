package OOPS.Abstraction.Interface;

public class MainClass {

    public static void main(String[] args) {

        Pig p = new Pig();
     //   Animal a = new Animal();  //it is not possible to create an "Animal" object in the MainClass

        p.eat();
        p.sleep();
        p.sound();

        /*
    Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
    Interface methods do not have a body - the body is provided by the "implement" class
    On implementation of an interface, you must override all of its methods
    Interface methods are by default abstract and public
    Interface attributes are by default public, static and final
    An interface cannot contain a constructor (as it cannot be used to create objects)
*/
    }
}

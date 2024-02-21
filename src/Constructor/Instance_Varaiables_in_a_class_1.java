package Constructor;

public class Instance_Varaiables_in_a_class_1 {

    String name;
    int age;
    String Email;   // all the Variables are Instance variables or class variables which will access by creating class/reference object

    void talk()
    {
        System.out.println("Always talktive");
    }

    void printdetails()  // you can use protected and public also, but not private
    {
        System.out.println(name);
        System.out.println(Email);  // We can call instance variables as they are
    }
}

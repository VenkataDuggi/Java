package Constructor;

public class Reference_object_class {

    public static void main(String[] args) {

        Instance_Varaiables_in_a_class test = new Instance_Varaiables_in_a_class();
        test.name="venkat";
        test.age=33;


     /*   int a;
        System.out.println(a); // You cannot declare and not use because it is local varaible
       */

    test.talk();
    test.printdetails();


    }
}

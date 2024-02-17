package Constructor;

public class Reference_object_class_1 {

    public static void main(String[] args) {

        Instance_Varaiables_in_a_class_1 test = new Instance_Varaiables_in_a_class_1();
        test.name="venkat";
        test.age=33;


     /*   int a;
        System.out.println(a); // You cannot declare and not use because it is local varaible
       */

    test.talk();
    test.printdetails();


    }
}

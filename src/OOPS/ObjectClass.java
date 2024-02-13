package OOPS;

public class ObjectClass {
    public static void main(String[] args) {

        Basic_OOPS_Attri_Beha Person1 = new Basic_OOPS_Attri_Beha();
        Person1.name="Duggi";
        Person1.Age=45;
        System.out.println(Person1.name);

        Basic_OOPS_Attri_Beha Person2 = new Basic_OOPS_Attri_Beha();
        Person2.name="Chan";
        Person2.Age=55;
        System.out.println(Person2.Age);

        Person2.Age=66;
        System.out.println(Person2.Age);

        Person1.eat();
        Person2.isMArried();

        new Basic_OOPS_Attri_Beha();
        Basic_OOPS_Attri_Beha Person3 = null;
        System.out.println("End of Program");


    }
}

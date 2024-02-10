package Strings;

public class StringConstantPool {

    public static void main(String[] args) {

        String str = "SCP area when declared as Varaible";  // String Constant Pool
        String str1 = new String("Heap area when you declared as object");  // Heap Area

        System.out.println(str);
        System.out.println(str1);

        str = "Hi";

        System.out.println(str);

        System.out.println(str1.concat(" + which stores in Heap area"));

        System.out.println(str1.contains("z"));
        System.out.println(str.contains("i"));

    }
}

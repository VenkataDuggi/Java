package Constructor;

public class DemoConstructor {

  DemoConstructor()
    {
        System.out.println("Default Constructor called");
    }

    public static void main(String[] args) {


        DemoConstructor demo = new DemoConstructor();
        new DemoConstructor();  //We cac call constructor like this also

        DemoConstructor DC = null;

        DC= new DemoConstructor();


    }


}

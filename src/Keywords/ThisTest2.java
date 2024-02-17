package Keywords;

public class ThisTest2 {


    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        //m();//same as this.m()
        this.m();

        //You may invoke the method of the current class by using the this keyword. If you don't use the this keyword, compiler automatically adds this keyword while invoking the method
    }


    public static void main(String args[]) {
        ThisTest2 TT = new ThisTest2();
        TT.n();
    }
}


package Constructor;

public class All_Banks_2 {

    public static void main(String[] args) {

        BankInstanceClass_2 ICICI = new BankInstanceClass_2();
        ICICI.Bank="ICICI";
        ICICI.Account_num=123;
        ICICI.Balance=456;
        ICICI.IFSC=3400012;
        ICICI.printdetails();
        

        BankInstanceClass_2 HDFC = new BankInstanceClass_2();
        // HDFC.Bank="HDFC";   // In place of this SBI will be printed from default consrtuctor
        HDFC.Account_num=12345;
        HDFC.Balance=0;
        HDFC.IFSC=3400012;
        HDFC.printdetails();


        BankInstanceClass_2 BOB = new BankInstanceClass_2("BOB");
        BOB.Bank="BOB";   // In place of this SBI will be printed from default consrtuctor
        BOB.Account_num=145;
        BOB.Balance=23456;
        BOB.IFSC=3400012;
        BOB.printdetails();

    }
}

package Constructor;

public class BankInstanceClass_2 {

    String Bank;
    int Account_num ;
    int IFSC;
    double Balance;

    BankInstanceClass_2()
    {
        Bank="SBI";
        System.out.println("default Constructor");
    }

    BankInstanceClass_2(String str)
    {
        System.out.println(Bank);
        System.out.println("Parametrized Constructor");
    }
    void printdetails()
    {
        System.out.println(Bank);
        System.out.println(Account_num);
        System.out.println(IFSC);
        System.out.println(Balance);
        System.out.println("--------------");
    }
}

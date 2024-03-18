package OOPS.Abstraction;

class HondaMainClass_1 extends BikeAbstractClass_1 {


    void bikedetails() {
        System.out.println("Its Honda");
    }


    public static void main(String[] args) {
        BikeAbstractClass_1 obj = new HondaMainClass_1();
        obj.bikedetails();
    }
}



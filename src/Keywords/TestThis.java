package Keywords;

class TestThis {
    int rollno;
    String name;
    float fee;
    TestThis(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
      /*
        rollno = rollno;
        name = name;           // If we give this the o/p is 0 null 0.0
        fee = fee;                                           0 null 0.0 because parameters (formal arguments) and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.
      */
    }
    void display() {
        System.out.println(this.rollno + " " + this.name + " " + this.fee);
     // System.out.println(rollno + " " + name + " " + fee); // This also we can give
    }
    public static void main(String args[]) {
        TestThis s1 = new TestThis(111, "ankit", 5000f);
        TestThis s2 = new TestThis(112, "sumit", 7000f);
        s1.display();
        s2.display();
    }
}

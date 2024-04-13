package OOPS.Encapsulation;


// Java Program to demonstrate Java Encapsulation

// fields to calculate area
class Encapsulation_Area_1 {
    int length;
    int breadth;

    // constructor to initialize values
    Encapsulation_Area_1(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate area
    public void getArea()
    {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class main{
    public static void main(String[] args)
    {

        Encapsulation_Area_1 rectangle = new Encapsulation_Area_1(2, 16);
        rectangle.getArea();
    }
}

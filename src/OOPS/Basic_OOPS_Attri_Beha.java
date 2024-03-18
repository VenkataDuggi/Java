package OOPS;

public class Basic_OOPS_Attri_Beha {


   // These are Attributes
   String name;
   int Age;
   String place;


   // These are Behaviour's
   void eat()
   {
       System.out.println("Three times");

   }
   void gym()
   {
      System.out.println("before 8 AM");
   }
   void sleep()
   {
      System.out.println("before 8 PM");
   }
   Boolean isMArried()
   {
      System.out.println("Not Married");
      return true; // This need to be declared if return type is there
   }

}

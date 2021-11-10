package primary;
  /*
   Write a program that would access two float-variables from a class that
   exists in another package. Note, you will need to create two packages
   to demonstrate the solution.
   */
   import primary.Q11package.*;

   public class Q11 {

       public static void main(String[] args) {
           Variables numbers = new Variables();

           System.out.println("Float one: "+ numbers.floatOne);
           System.out.println("Float Two: "+ numbers.floatTwo);
       }

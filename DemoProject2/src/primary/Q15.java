package primary;
/*
Write a program that defines an interface having the following
methods: addition, subtraction, multiplication, and division.
Create a class that implements this interface and provides
appropriate functionality to carry out the required operations.
Hard code two operands in a test class having a main method
that calls the implementing class.
*/
public class Q15{
    public void Interfaces() {

        q15Interface q15 = new q15Implementation();

        Result(q15);
    }

    public void Result(q15Interface q15) {
        System.out.println(q15.addition(6, 59));
    }
}

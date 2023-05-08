
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
    }
        @Test
        void addWorkTest () {
            Calculator testAdd = new Calculator();
            Assertions.assertEquals(8, testAdd.add(5, 3));
        }
        @Test
        void subtractWorkTest () {
            Calculator testSubtract = new Calculator();
            Assertions.assertEquals(1, testSubtract.subtract(6, 5));
        }
    @Test
    void trialTest () {
        Calculator nuovaadd = new Calculator();
        Assertions.assertFalse(nuovaadd.add(-5, 16) != 11);
        Assertions.assertTrue(nuovaadd.add(6,0) == 6);
    }
    @Test
    void trial2Test () {
        Calculator testSubtract = new Calculator();
        Assertions.assertTrue(testSubtract.subtract(0,-8) == 8,"Qualsiasi numero sottrato a zero da lo stesso " +
                "numero");
    }




    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator calculator = new Calculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
        @Test
        void multiplyWorkTest () {
            Calculator testmultiply = new Calculator();
            Assertions.assertFalse(testmultiply.multiply(7, 0) != 0);
            Assertions.assertTrue(testmultiply.multiply(-4,-5)== 20);
        }
        @Test
        void divisionWorkTest () {
            Calculator testDivision = new Calculator();
            Assertions.assertEquals(0,testDivision.divide(0, 7));
            Assertions.assertTrue(testDivision.divide(-10, -2) == 5);
        }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();
        Assertions.assertTrue(calculator.power(5.25,3)== 144.703125);
        Assertions.assertFalse(calculator.power(-2,2)!= 4);
        Assertions.assertEquals(0,calculator.power(0,7));
        Assertions.assertTrue(calculator.power(4,2.5)== 32);
        Assertions.assertFalse(calculator.power(2,-2)!= 0.25);
        Assertions.assertEquals(1,calculator.power(7,0));

    }
}
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    /* Test method to find maximum
     * number from 3 Integers
     */
    @Test
    public void findIntMax() {
        Maximum maximum = new Maximum();

        Integer a = (int) (Math.random() * 1000);
        Integer b = (int) (Math.random() * 1000);
        Integer c = (int) (Math.random() * 1000);
        System.out.println("The maximum Integer is :" + maximum.findMax(a, b, c));
    }

    /* Test Case for the Integer where
     *  maximum value at first position
     */
    @Test
    public void integerAtFirstPosition() {
        Maximum maximum = new Maximum();
        int result = maximum.findMax(16, 15, 10);
        System.out.println("First Position is: " + result);
        int expected = 16;
        Assert.assertEquals(expected,result);
    }

    /* Test Case for the Integer where
     *  maximum value at second position
     */
    @Test
    public void integerAtSecondPosition() {
        Maximum maximum = new Maximum();
        int result = maximum.findMax(10, 20, 15);
        System.out.println("Second Position is: " + result);
        int expected = 20;
        Assert.assertEquals(expected,result);
    }

    /* Test Case for the Integer where
     *  maximum value at third position
     */
    @Test
    public void integerAtThirdPosition() {
        Maximum maximum = new Maximum();
        int result = maximum.findMax(10, 20, 30);
        System.out.println("Third Position is: " + result);
        int expected = 30;
        Assert.assertEquals(expected,result);
    }

    /* Test method to find maximum
     * number from 3 float numbers
     */
    @Test
    public void findFloatMaximum() {
        Maximum maximum = new Maximum();

        Float num1 = (float) (Math.random() * 1000);
        Float num2 = (float) (Math.random() * 1000);
        Float num3 = (float) (Math.random() * 1000);
        System.out.println("The maximum float number is :"+ maximum.findMax(num1,num2,num3));
    }

    /* Test Case for the float where
     *  maximum value at first position
     */
    @Test
    public void floatAtFirstPosition() {
        Maximum maximum = new Maximum();

        Float result = maximum.findMax(10.20f, 8.20f, 9.40f);
        System.out.println("First Position is: " + result);
        Float expected = 10.20f;
        Assert.assertEquals(expected,result);
    }

    /* Test Case for the float where
     *  maximum value at second position
     */
    @Test
    public void floatAtSecondPosition() {
        Maximum maximum = new Maximum();

        Float result = maximum.findMax(10.2f, 15.2f, 9.4f);
        System.out.println("Second Position is: " + result);
        Float expected = 15.2f;
        Assert.assertEquals(expected,result);
    }

    /* Test Case for the float where
     *  maximum value at third position
     */
    @Test
    public void floatAtThirdPosition() {
        Maximum maximum = new Maximum();

        Float result = maximum.findMax(10.2f, 15.2f, 20.4f);
        System.out.println("Third Position is: " + result);
        Float expected = 20.4f;
        Assert.assertEquals(expected,result);
    }

    /* Test method to find maximum
     * String from 3 strings
     */
    @Test
    public void findStringMaximum() {
        Maximum maximum = new Maximum();

        String fruit1 = "Apple";
        String fruit2 = "Peach";
        String fruit3 = "Banana";
        System.out.println("The maximum string is :"+ maximum.findMax(fruit1,fruit2,fruit3));
    }

    /* Test Case for the string where
     *  maximum value at first position
     */
    @Test
    public void stringAtFirstPosition() {
        Maximum maximum = new Maximum();

        String result = maximum.findMax("Peach", "Banana", "Apple");
        System.out.println("First Position is: " + result);
        String expected = "Peach";
        Assert.assertEquals(expected,result);
    }

    /* Test Case for the string where
     *  maximum value at second position
     */
    @Test
    public void stringAtSecondPosition() {
        Maximum maximum = new Maximum();

        String result = maximum.findMax("Apple", "Peach", "Banana");
        System.out.println("Second Position is: " + result);
        String expected = "Peach";
        Assert.assertEquals(expected,result);
    }

    /* Test Case for the string where
     *  maximum value at third position
     */
    @Test
    public void stringAtThirdPosition() {
        Maximum maximum = new Maximum();

        String result = maximum.findMax("Apple", "Banana", "Peach");
        System.out.println("Third Position is: " + result);
        String expected = "Peach";
        Assert.assertEquals(expected,result);
    }
}
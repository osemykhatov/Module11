package Module4_1_3;

import org.junit.*;

public class CelsiusTest {


    @Test(timeout = 1000)
    public void testGetCelsToFahr() throws Exception {

        final int celsValue = 7;

        Celsius celsius = new Celsius(7);
        final float result = celsius.getCelsToFahr();

        Assert.assertEquals(44.6f, result, 0.0f);

    }

    @Test(timeout = 1000)
    public void testGetFahrToCels() throws Exception {

        final float farValue = 210.2f;

        Celsius celsius = new Celsius(210.2f);
        final float result = celsius.getFahrToCels();

        Assert.assertEquals(99, result, 0.0f);

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("test call");

    }
}
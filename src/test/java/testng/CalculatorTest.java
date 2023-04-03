package testng;

import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();
    @Test (dataProvider = "numbers")
    public void addTwoNumbersTest(int a, int b, int result){
        Assert.assertEquals(Calculator.add(a,b), result);

    }
    @DataProvider
    public static Object[][] numbers() {
        return new Object[][]{
                {10, 20, 30},
                {0, 10, 10},
                {-10, 20, 10}
        };
    }
    @Test
    public void addTwoNumbersTest2(){
        Assert.assertEquals(Calculator.add(1,1), 2);
        Assert.assertEquals(Calculator.add(10,10), 2);
        System.out.println("################");
        Assert.assertEquals(Calculator.add(2,2), 4);
    }

    @Test
    public void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2, 2), 4);
        softAssert.assertEquals(Calculator.add(2, 2), 5);
        softAssert.assertEquals(Calculator.add(2, 2), 6);
        softAssert.assertEquals(Calculator.add(2, 2), 7);
        softAssert.assertEquals(Calculator.add(2, 2), 8);
        softAssert.assertAll();
    }
    @Test
    public void testAssertTrue(){
        Assert.assertTrue(SomeClass.isFunny(true));
        Assert.assertFalse(SomeClass.isFunny(false));

    }
    @Test (enabled = false)
    public void test2() {
        System.out.println("Пропуск теста");
    }
    @Test (dependsOnMethods = "addTwoNumbersTest")
    public void test3(){
        System.out.println("Зависимость теста");
    }
    @Test (timeOut = 1000)
    public void test4(){
        System.out.println("Зависимость теста");
    }
}

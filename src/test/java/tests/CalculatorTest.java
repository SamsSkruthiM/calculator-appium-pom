package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CalculatorPage;

public class CalculatorTest extends BaseTest {

    CalculatorPage calculator;

    @BeforeMethod
    public void startApp() throws Exception {
        setup();
        calculator = new CalculatorPage(getDriver());
    }

    @AfterMethod
    public void closeApp() {
        tearDown();
    }

    @Test
    public void testAddition() {

        calculator.clickDigit("7");
        calculator.clickPlus();
        calculator.clickDigit("3");
        calculator.clickEquals();

        Assert.assertEquals(
                calculator.getResult(),
                "10",
                "Addition Test Failed!"
        );
    }

    @Test
    public void testSubtraction() {

        calculator.clickDigit("1");
        calculator.clickDigit("0");
        calculator.clickMinus();
        calculator.clickDigit("4");
        calculator.clickEquals();

        Assert.assertEquals(
                calculator.getResult(),
                "6",
                "Subtraction Test Failed!"
        );
    }

    @Test
    public void testMultiplication() {

        calculator.clickDigit("5");
        calculator.clickMultiply();
        calculator.clickDigit("6");
        calculator.clickEquals();

        Assert.assertEquals(
                calculator.getResult(),
                "30",
                "Multiplication Test Failed!"
        );
    }

    @Test
    public void testDivision() {

        calculator.clickDigit("2");
        calculator.clickDigit("0");
        calculator.clickDivide();
        calculator.clickDigit("4");
        calculator.clickEquals();

        Assert.assertEquals(
                calculator.getResult(),
                "5",
                "Division Test Failed!"
        );
    }
}
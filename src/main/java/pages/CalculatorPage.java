package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorPage {

    AndroidDriver driver;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickDigit(String digit) {
        driver.findElement(AppiumBy.accessibilityId(digit)).click();
    }

    public void clickPlus() {
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
    }

    public void clickMinus() {
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
    }
    git commit -m "Added refund validation assessment"
    public void clickMultiply() {
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
    }

    public void clickDivide() {
        driver.findElement(AppiumBy.accessibilityId("divide")).click();
    }

    public void clickEquals() {
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
    }

    public String getResult() {
        return driver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final")).getText();
    }

    public void clear() {
        driver.findElement(AppiumBy.accessibilityId("clear")).click();
    }
}
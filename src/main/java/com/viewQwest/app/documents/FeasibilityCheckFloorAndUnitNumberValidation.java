package com.viewQwest.app.documents;

import com.viewQwest.app.contexts.DataPansContext;
import com.viewQwest.app.enums.TypeOfSubscriptions;
import com.viewQwest.app.scripts.ExtentTestNGITestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FeasibilityCheckFloorAndUnitNumberValidation extends ExtentTestNGITestListener {
    private final DataPansContext context;

    public FeasibilityCheckFloorAndUnitNumberValidation(DataPansContext context) {
        this.context = context;
    }

    public void FloorAndUnitNumberValidation() {
        try {
            String subscriberType;
            WebDriverWait wait = new WebDriverWait(webDriver, 20);
            if (context.getTypeOfSubscription().equals(TypeOfSubscriptions.NewSubscriber.getSubscriptionsType())) {
                subscriberType = "New Subscriber";
            } else {
                subscriberType = "Existing Subscriber Re-Contract";
            }
            logger.info("Select subscription type " + subscriberType);
            webDriver.findElement(By.className(context.getTypeOfSubscription())).click();

            logger.info("Select internet plan" + context.getDataPlan());
            webDriver.findElement(By.xpath("//div[contains(text(),'" + context.getDataPlan() + "')] /ancestor::div[2]/div[2]")).click();

            logger.info("Input [Postal codes]");
            webDriver.findElement(By.id("postal")).sendKeys(context.getPostalCode());
            logger.info("Check coverage without giving floor and unit number ");
            webDriver.findElement(By.id("check-coverage-button")).click();
            Assert.assertFalse(wait.until(ExpectedConditions.elementToBeClickable(By.className("results-next-button"))).isDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("Test case failed, Please check attached screenshot/s");

        }
    }
}

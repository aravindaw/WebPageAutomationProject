package com.viewQwest.app.documents;

import com.viewQwest.app.contexts.DataPansContext;
import com.viewQwest.app.enums.Gender;
import com.viewQwest.app.enums.TypeOfSubscriptions;
import com.viewQwest.app.scripts.ExtentTestNGITestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class NewSubscriberCreationFloorDocument extends ExtentTestNGITestListener {
    private final DataPansContext context;

    public NewSubscriberCreationFloorDocument(DataPansContext context) {
        this.context = context;
    }

    public void createNewSubscriber() {
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
            if (context.setLandedPremises(true)) {
                logger.info("Ticked for landed premises");
                webDriver.findElement(By.xpath("//input[@id='landed']/../ins")).click();
            } else {
                logger.info("Give Floor number and unit number");
                webDriver.findElement(By.id("floor")).sendKeys(context.getFloorLevel());
                webDriver.findElement(By.id("unit")).sendKeys(context.getUnitNumber());
            }
            logger.info("Check coverage");
            webDriver.findElement(By.id("check-coverage-button")).click();

//        Go to next page
            logger.info("Click next button");
            wait.until(ExpectedConditions.elementToBeClickable(By.className("results-next-button"))).click();

            logger.info("Put Subscriber details");
            Select initials = new Select(webDriver.findElement(By.id("name_salutationacc2")));
            initials.selectByVisibleText(context.getInitials());
            webDriver.findElement(By.id("firstName")).sendKeys(context.getFirstName());
            webDriver.findElement(By.id("lastName")).sendKeys(context.getLastName());
            webDriver.findElement(By.id("nric")).sendKeys(context.getNricOrPassport());

//        Select DOB
            String[] date = context.getDob().split("-");
            String y = date[0];
            String m = date[1];
            String d = date[2];
            wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.id("dob")))).click();
            Select year = new Select(webDriver.findElement(By.className("ui-datepicker-year")));
            year.selectByValue(y);
            Select month = new Select(webDriver.findElement(By.className("ui-datepicker-month")));
            month.selectByValue(m);
            WebElement day = webDriver.findElement(By.xpath("//a[contains(@class, 'ui-state-default') and contains(text(),'" + d + "') ] "));
            day.click();

            Select nationality = new Select(webDriver.findElement(By.id("nationality")));
            nationality.selectByVisibleText(context.getNationality());
            webDriver.findElement(By.id("phone")).sendKeys(context.getPhoneNumber());
            webDriver.findElement(By.id("mobile")).sendKeys(context.getMobileNumber());
            webDriver.findElement(By.id("email")).sendKeys(context.getEmailAddress());
            if (!context.getGender().equals(Gender.Male.toString())) {
                webDriver.findElement(By.xpath("//input[contains(@name, 'gender') and contains(@value,'Female')] /parent::div/ins")).click();
            }
//        Go to next page
            logger.info("Click next button");
            wait.until(ExpectedConditions.elementToBeClickable(By.id("next"))).click();

//        ViewQwest service plan page
            logger.info("Select Fibre-Guard type [" + context.getFiberGuard() + "]");
            Select fiberGard = new Select(webDriver.findElement(By.id("fiberGuard")));
            fiberGard.selectByValue(context.getFiberGuard());

            for (String x : context.getHardware()) {
                logger.info("Select hardware/s[" + x + "]");
                WebElement selectHardware = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//div[@class='routerName' and contains(text(),'" + x + "')] /../div[2]"))));
                selectHardware.click();
            }

            if (context.getOneVoiceAddOnSubscribe() != null) {
                logger.info("Select OneVoice Add-on");
                webDriver.findElement(By.xpath("//input[@id='" + context.getOneVoiceAddOnSubscribe() + "']/../ins")).click();
            }
            if (context.getOneVoiceAddOnNumber() != null) {
                logger.info("Select OneVoice Number Non-Display Add-on");
                webDriver.findElement(By.xpath("//input[@id='" + context.getOneVoiceAddOnNumber() + "']/../ins")).click();
            }
            logger.info("Select onsite installation plan");
            webDriver.findElement(By.xpath("//input[@id='" + context.getOnsiteInstallation() + "']/../ins")).click();
            logger.info("Select ViewQwest TV Media Player");
            webDriver.findElement(By.xpath("//input[@id='" + context.getTvPlayer() + "']/../ins")).click();
            if (context.setEnableNetflix(true)) {
                logger.info("Select Netflix");
                webDriver.findElement(By.xpath("//input[contains(@name, 'netflix')and contains(@value,'Yes')]")).click();
                logger.info("Select " + context.getNetflixCountry());
                webDriver.findElement(By.xpath("//input[@id='" + context.getNetflixCountry() + "']/../ins")).click();
            } else {
                logger.info("Discard Netflix option");
                webDriver.findElement(By.xpath("//input[contains(@name, 'netflix')and contains(@value,'No')]")).click();
            }
            logger.info("Adding a Remark note");
            webDriver.findElement(By.id("remarksField")).sendKeys(context.getRemark());

            logger.info("Select the promoter name [" + context.getPromoterName() + "]");
            Select promoter = new Select(webDriver.findElement(By.id("salesStaffName")));
            promoter.selectByValue(context.getPromoterName());
            Select reference = new Select(webDriver.findElement(By.id("referenceName")));
            logger.info("Select the reference name [" + context.getReferenceName() + "]");
            reference.selectByValue(context.getReferenceName());
            wait.until(ExpectedConditions.elementToBeClickable(By.id("next"))).click();

            logger.info("Uploading Front and back NRIC images");
            WebElement uploadFront = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.id("file"))));
            uploadFront.sendKeys(context.getFrontPage());
            WebElement waitUntilConfirmMessage = wait.until(ExpectedConditions.elementToBeClickable(By.className("confirm")));
            Assert.assertTrue(waitUntilConfirmMessage.isDisplayed());
            waitUntilConfirmMessage.click();
            Thread.sleep(1000);
            WebElement uploadBack = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.id("file2"))));
            uploadBack.sendKeys(context.getFrontPage());
            WebElement waitUntilConfirmMessage2 = wait.until(ExpectedConditions.elementToBeClickable(By.className("confirm")));
            Assert.assertTrue(waitUntilConfirmMessage2.isDisplayed());
            waitUntilConfirmMessage2.click();
            Thread.sleep(1000);
            logger.info("Click next button");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='next' and @type='button']"))).click();

            logger.info("Agree on terms and condition page and tick the check box");
            Thread.sleep(10000);
            webDriver.findElement(By.xpath("//input[@name='terms_and_conditions']/../ins")).click();
            logger.info("Click Proceed to Payment button");
            wait.until(ExpectedConditions.elementToBeClickable(By.id("next"))).click();
            WebElement redirectWindow = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath("//button/span[contains(text(),'Ok')]"))));
            Assert.assertTrue(redirectWindow.isDisplayed());
            redirectWindow.click();
            String paymentPage = webDriver.getCurrentUrl();
            logger.info("verify user redirected to the payment page");
            Assert.assertEquals(paymentPage, "https://signup.viewqwest.com/payment.php#b");
        } catch (InterruptedException e) {
            e.printStackTrace();
            logger.info("Test case failed, Please check attached screenshot/s");
        }


    }
}

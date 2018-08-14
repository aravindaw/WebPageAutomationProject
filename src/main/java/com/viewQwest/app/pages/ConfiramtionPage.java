package com.viewQwest.app.pages;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfiramtionPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "cancelButton")
    @CacheLookup
    private WebElement cancel;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email;

    @FindBy(id = "first_name")
    @CacheLookup
    private WebElement firstName;

    @FindBy(id = "last_name")
    @CacheLookup
    private WebElement lastName;

    @FindBy(id = "description")
    @CacheLookup
    private WebElement messageOptional1;

    @FindBy(id = "00N9000000E4U94")
    @CacheLookup
    private WebElement messageOptional2;

    @FindBy(id = "00N9000000EVwmu")
    @CacheLookup
    private WebElement messageOptional3;

    @FindBy(id = "00N9000000E4U8L")
    @CacheLookup
    private WebElement messageOptional4;

    @FindBy(id = "00N9000000E4U8z")
    @CacheLookup
    private WebElement messageOptional5;

    @FindBy(id = "rating")
    @CacheLookup
    private WebElement messageOptional6;

    @FindBy(id = "recordType")
    @CacheLookup
    private WebElement messageOptional7;

    @FindBy(id = "00N90000007BNeq")
    @CacheLookup
    private WebElement messageOptional8;

    @FindBy(id = "next")
    @CacheLookup
    private WebElement next;

    private final String pageLoadedText = "The above mentioned fees will be automatically deducted from your credit card within the next 7 days of submitting this application";

    private final String pageUrl = "/preview.php";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneOptional;

    @FindBy(id = "feedbackFormSubmitButton")
    @CacheLookup
    private WebElement submit;

    @FindBy(id = "file2")
    @CacheLookup
    private WebElement uploadYourNricBack;

    @FindBy(id = "file")
    @CacheLookup
    private WebElement uploadYourNricFront;

    public ConfiramtionPage() {
    }

    public ConfiramtionPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ConfiramtionPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ConfiramtionPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage clickCancelButton() {
        cancel.click();
        return this;
    }

    /**
     * Click on Next Button.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage clickNextButton() {
        next.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage fill() {
        setFirstNameTextField();
        setLastNameTextField();
        setEmailEmailField();
        setPhoneOptionalTextField();
        setMessageOptional1DropDownListField();
        setMessageOptional2DropDownListField();
        setMessageOptional3DropDownListField();
        setMessageOptional4DropDownListField();
        setMessageOptional5DropDownListField();
        setMessageOptional6DropDownListField();
        setMessageOptional7DropDownListField();
        setMessageOptional8TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setEmailEmailField() {
        return setEmailEmailField(data.get("EMAIL"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setEmailEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setFirstNameTextField() {
        return setFirstNameTextField(data.get("FIRST_NAME"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setFirstNameTextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setLastNameTextField() {
        return setLastNameTextField(data.get("LAST_NAME"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setLastNameTextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional1DropDownListField() {
        return setMessageOptional1DropDownListField(data.get("MESSAGE_OPTIONAL_1"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional1DropDownListField(String messageOptional1Value) {
        messageOptional1.sendKeys(messageOptional1Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional2DropDownListField() {
        return setMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).selectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional3DropDownListField() {
        return setMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).selectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional4DropDownListField() {
        return setMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).selectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional5DropDownListField() {
        return setMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).selectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional6DropDownListField() {
        return setMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).selectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional7DropDownListField() {
        return setMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).selectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional8TextField() {
        return setMessageOptional8TextField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setMessageOptional8TextField(String messageOptional8Value) {
        messageOptional8.sendKeys(messageOptional8Value);
        return this;
    }

    /**
     * Set default value to Phone Optional Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setPhoneOptionalTextField() {
        return setPhoneOptionalTextField(data.get("PHONE_OPTIONAL"));
    }

    /**
     * Set value to Phone Optional Text field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setPhoneOptionalTextField(String phoneOptionalValue) {
        phoneOptional.sendKeys(phoneOptionalValue);
        return this;
    }

    /**
     * Set Upload Your Nric Back File field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setUploadYourNricBackFileField() {
        return this;
    }

    /**
     * Set Upload Your Nric Front File field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage setUploadYourNricFrontFileField() {
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage submit() {
        clickSubmitButton();
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional2DropDownListField() {
        return unsetMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).deselectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional3DropDownListField() {
        return unsetMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).deselectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional4DropDownListField() {
        return unsetMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).deselectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional5DropDownListField() {
        return unsetMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).deselectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional6DropDownListField() {
        return unsetMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).deselectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional7DropDownListField() {
        return unsetMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage unsetMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).deselectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the ConfiramtionPage class instance.
     */
    public ConfiramtionPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

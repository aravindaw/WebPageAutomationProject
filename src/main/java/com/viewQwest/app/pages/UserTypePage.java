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

public class UserTypePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement emailEmailAddressTaggedToYour1;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement emailEmailAddressTaggedToYour2;

    @FindBy(css = "a.indexButtonOption.open-popup-link")
    @CacheLookup
    private WebElement existingsubscriberrecontract;

    @FindBy(id = "last_name")
    @CacheLookup
    private WebElement firstName1;

    @FindBy(id = "last_name")
    @CacheLookup
    private WebElement firstName2;

    @FindBy(id = "first_name")
    @CacheLookup
    private WebElement firstName3;

    @FindBy(id = "last_name")
    @CacheLookup
    private WebElement firstName4;

    @FindBy(id = "description")
    @CacheLookup
    private WebElement messageOptional1;

    @FindBy(id = "00N9000000E4U94")
    @CacheLookup
    private WebElement messageOptional10;

    @FindBy(id = "00N9000000EVwmu")
    @CacheLookup
    private WebElement messageOptional11;

    @FindBy(id = "00N9000000E4U8L")
    @CacheLookup
    private WebElement messageOptional12;

    @FindBy(id = "00N9000000E4U8z")
    @CacheLookup
    private WebElement messageOptional13;

    @FindBy(id = "rating")
    @CacheLookup
    private WebElement messageOptional14;

    @FindBy(id = "recordType")
    @CacheLookup
    private WebElement messageOptional15;

    @FindBy(id = "00N90000007BNeq")
    @CacheLookup
    private WebElement messageOptional16;

    @FindBy(id = "00N9000000E4U94")
    @CacheLookup
    private WebElement messageOptional2;

    @FindBy(id = "00N9000000E4U8L")
    @CacheLookup
    private WebElement messageOptional3;

    @FindBy(id = "00N9000000E4U8z")
    @CacheLookup
    private WebElement messageOptional4;

    @FindBy(id = "recordType")
    @CacheLookup
    private WebElement messageOptional5;

    @FindBy(id = "00N9000000EVwmu")
    @CacheLookup
    private WebElement messageOptional6;

    @FindBy(id = "salesStaffName")
    @CacheLookup
    private WebElement messageOptional7;

    @FindBy(id = "salesLocation")
    @CacheLookup
    private WebElement messageOptional8;

    @FindBy(id = "description")
    @CacheLookup
    private WebElement messageOptional9;

    @FindBy(css = "div:nth-of-type(2) div.indexWrapper div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    public WebElement newsubscriber;

    private final String pageLoadedText = "Do You Have Some Feedback About This Signup Portal";

    private final String pageUrl = "/";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneOptional;

    @FindBy(id = "promoterName")
    @CacheLookup
    private WebElement promoterName;

    @FindBy(css = "#myform fieldset div.formFieldWrapper div:nth-of-type(5) button.contactFormSubmitButton")
    @CacheLookup
    private WebElement submit1;

    @FindBy(id = "feedbackFormSubmitButton")
    @CacheLookup
    private WebElement submit2;

    public UserTypePage() {
    }

    public UserTypePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public UserTypePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public UserTypePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Existingsubscriberrecontract Link.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage clickExistingsubscriberrecontractLink() {
        existingsubscriberrecontract.click();
        return this;
    }

    /**
     * Click on Newsubscriber Link.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage clickNewsubscriberLink() {
        newsubscriber.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage clickSubmit1Button() {
        submit1.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage clickSubmit2Button() {
        submit2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage fill() {
        setFirstName1TextField();
        setFirstName2TextField();
        setEmailEmailAddressTaggedToYour1EmailField();
        setMessageOptional1DropDownListField();
        setMessageOptional2DropDownListField();
        setMessageOptional3DropDownListField();
        setMessageOptional4DropDownListField();
        setMessageOptional5DropDownListField();
        setMessageOptional6DropDownListField();
        setMessageOptional7DropDownListField();
        setMessageOptional8DropDownListField();
        setPromoterNameTextField();
        setFirstName3TextField();
        setFirstName4TextField();
        setEmailEmailAddressTaggedToYour2EmailField();
        setPhoneOptionalTextField();
        setMessageOptional9TextareaField();
        setMessageOptional10DropDownListField();
        setMessageOptional11DropDownListField();
        setMessageOptional12DropDownListField();
        setMessageOptional13DropDownListField();
        setMessageOptional14DropDownListField();
        setMessageOptional15DropDownListField();
        setMessageOptional16TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the UserTypePage class instance.
     */
//    public UserTypePage fillAndSubmit() {
//        fill();
//        return submit();
//    }

    /**
     * Set default value to Email Email Address Tagged To Your Viewqwest Account Email field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setEmailEmailAddressTaggedToYour1EmailField() {
        return setEmailEmailAddressTaggedToYour1EmailField(data.get("EMAIL_EMAIL_ADDRESS_TAGGED_TO_YOUR_1"));
    }

    /**
     * Set value to Email Email Address Tagged To Your Viewqwest Account Email field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setEmailEmailAddressTaggedToYour1EmailField(String emailEmailAddressTaggedToYour1Value) {
        emailEmailAddressTaggedToYour1.sendKeys(emailEmailAddressTaggedToYour1Value);
        return this;
    }

    /**
     * Set default value to Email Email Address Tagged To Your Viewqwest Account Email field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setEmailEmailAddressTaggedToYour2EmailField() {
        return setEmailEmailAddressTaggedToYour2EmailField(data.get("EMAIL_EMAIL_ADDRESS_TAGGED_TO_YOUR_2"));
    }

    /**
     * Set value to Email Email Address Tagged To Your Viewqwest Account Email field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setEmailEmailAddressTaggedToYour2EmailField(String emailEmailAddressTaggedToYour2Value) {
        emailEmailAddressTaggedToYour2.sendKeys(emailEmailAddressTaggedToYour2Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName1TextField() {
        return setFirstName1TextField(data.get("FIRST_NAME_1"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName1TextField(String firstName1Value) {
        firstName1.sendKeys(firstName1Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName2TextField() {
        return setFirstName2TextField(data.get("FIRST_NAME_2"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName2TextField(String firstName2Value) {
        firstName2.sendKeys(firstName2Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName3TextField() {
        return setFirstName3TextField(data.get("FIRST_NAME_3"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName3TextField(String firstName3Value) {
        firstName3.sendKeys(firstName3Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName4TextField() {
        return setFirstName4TextField(data.get("FIRST_NAME_4"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setFirstName4TextField(String firstName4Value) {
        firstName4.sendKeys(firstName4Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional10DropDownListField() {
        return setMessageOptional10DropDownListField(data.get("MESSAGE_OPTIONAL_10"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional10DropDownListField(String messageOptional10Value) {
        new Select(messageOptional10).selectByVisibleText(messageOptional10Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional11DropDownListField() {
        return setMessageOptional11DropDownListField(data.get("MESSAGE_OPTIONAL_11"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional11DropDownListField(String messageOptional11Value) {
        new Select(messageOptional11).selectByVisibleText(messageOptional11Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional12DropDownListField() {
        return setMessageOptional12DropDownListField(data.get("MESSAGE_OPTIONAL_12"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional12DropDownListField(String messageOptional12Value) {
        new Select(messageOptional12).selectByVisibleText(messageOptional12Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional13DropDownListField() {
        return setMessageOptional13DropDownListField(data.get("MESSAGE_OPTIONAL_13"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional13DropDownListField(String messageOptional13Value) {
        new Select(messageOptional13).selectByVisibleText(messageOptional13Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional14DropDownListField() {
        return setMessageOptional14DropDownListField(data.get("MESSAGE_OPTIONAL_14"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional14DropDownListField(String messageOptional14Value) {
        new Select(messageOptional14).selectByVisibleText(messageOptional14Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional15DropDownListField() {
        return setMessageOptional15DropDownListField(data.get("MESSAGE_OPTIONAL_15"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional15DropDownListField(String messageOptional15Value) {
        new Select(messageOptional15).selectByVisibleText(messageOptional15Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional16TextField() {
        return setMessageOptional16TextField(data.get("MESSAGE_OPTIONAL_16"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional16TextField(String messageOptional16Value) {
        messageOptional16.sendKeys(messageOptional16Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional1DropDownListField() {
        return setMessageOptional1DropDownListField(data.get("MESSAGE_OPTIONAL_1"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional1DropDownListField(String messageOptional1Value) {
        messageOptional1.sendKeys(messageOptional1Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional2DropDownListField() {
        return setMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).selectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional3DropDownListField() {
        return setMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).selectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional4DropDownListField() {
        return setMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).selectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional5DropDownListField() {
        return setMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).selectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional6DropDownListField() {
        return setMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).selectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional7DropDownListField() {
        return setMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).selectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional8DropDownListField() {
        return setMessageOptional8DropDownListField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional8DropDownListField(String messageOptional8Value) {
        new Select(messageOptional8).selectByVisibleText(messageOptional8Value);
        return this;
    }

    /**
     * Set default value to Message Optional Textarea field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional9TextareaField() {
        return setMessageOptional9TextareaField(data.get("MESSAGE_OPTIONAL_9"));
    }

    /**
     * Set value to Message Optional Textarea field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setMessageOptional9TextareaField(String messageOptional9Value) {
        messageOptional9.sendKeys(messageOptional9Value);
        return this;
    }

    /**
     * Set default value to Phone Optional Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setPhoneOptionalTextField() {
        return setPhoneOptionalTextField(data.get("PHONE_OPTIONAL"));
    }

    /**
     * Set value to Phone Optional Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setPhoneOptionalTextField(String phoneOptionalValue) {
        phoneOptional.sendKeys(phoneOptionalValue);
        return this;
    }

    /**
     * Set default value to Promoter Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setPromoterNameTextField() {
        return setPromoterNameTextField(data.get("PROMOTER_NAME"));
    }

    /**
     * Set value to Promoter Name Text field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage setPromoterNameTextField(String promoterNameValue) {
        promoterName.sendKeys(promoterNameValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the UserTypePage class instance.
     */
//    public UserTypePage submit() {
//        clickSubmitButton();
//        return this;
//    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional10DropDownListField() {
        return unsetMessageOptional10DropDownListField(data.get("MESSAGE_OPTIONAL_10"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional10DropDownListField(String messageOptional10Value) {
        new Select(messageOptional10).deselectByVisibleText(messageOptional10Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional11DropDownListField() {
        return unsetMessageOptional11DropDownListField(data.get("MESSAGE_OPTIONAL_11"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional11DropDownListField(String messageOptional11Value) {
        new Select(messageOptional11).deselectByVisibleText(messageOptional11Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional12DropDownListField() {
        return unsetMessageOptional12DropDownListField(data.get("MESSAGE_OPTIONAL_12"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional12DropDownListField(String messageOptional12Value) {
        new Select(messageOptional12).deselectByVisibleText(messageOptional12Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional13DropDownListField() {
        return unsetMessageOptional13DropDownListField(data.get("MESSAGE_OPTIONAL_13"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional13DropDownListField(String messageOptional13Value) {
        new Select(messageOptional13).deselectByVisibleText(messageOptional13Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional14DropDownListField() {
        return unsetMessageOptional14DropDownListField(data.get("MESSAGE_OPTIONAL_14"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional14DropDownListField(String messageOptional14Value) {
        new Select(messageOptional14).deselectByVisibleText(messageOptional14Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional15DropDownListField() {
        return unsetMessageOptional15DropDownListField(data.get("MESSAGE_OPTIONAL_15"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional15DropDownListField(String messageOptional15Value) {
        new Select(messageOptional15).deselectByVisibleText(messageOptional15Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional2DropDownListField() {
        return unsetMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).deselectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional3DropDownListField() {
        return unsetMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).deselectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional4DropDownListField() {
        return unsetMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).deselectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional5DropDownListField() {
        return unsetMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).deselectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional6DropDownListField() {
        return unsetMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).deselectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional7DropDownListField() {
        return unsetMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).deselectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional8DropDownListField() {
        return unsetMessageOptional8DropDownListField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage unsetMessageOptional8DropDownListField(String messageOptional8Value) {
        new Select(messageOptional8).deselectByVisibleText(messageOptional8Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the UserTypePage class instance.
     */
    public UserTypePage verifyPageLoaded() {
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
     * @return the UserTypePage class instance.
     */
    public UserTypePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

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

public class SusbcriberDetailsPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email1;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email2;

    @FindBy(id = "firstName")
    @CacheLookup
    private WebElement firstName1;

    @FindBy(id = "first_name")
    @CacheLookup
    private WebElement firstName2;

    @FindBy(id = "lastName")
    @CacheLookup
    private WebElement lastName1;

    @FindBy(id = "last_name")
    @CacheLookup
    private WebElement lastName2;

    @FindBy(id = "customerUID")
    @CacheLookup
    private WebElement messageOptional1;

    @FindBy(id = "postal")
    @CacheLookup
    private WebElement messageOptional10;

    @FindBy(id = "mobile")
    @CacheLookup
    private WebElement messageOptional11;

    @FindBy(id = "description")
    @CacheLookup
    private WebElement messageOptional12;

    @FindBy(id = "00N9000000E4U94")
    @CacheLookup
    private WebElement messageOptional13;

    @FindBy(id = "00N9000000EVwmu")
    @CacheLookup
    private WebElement messageOptional14;

    @FindBy(id = "00N9000000E4U8L")
    @CacheLookup
    private WebElement messageOptional15;

    @FindBy(id = "00N9000000E4U8z")
    @CacheLookup
    private WebElement messageOptional16;

    @FindBy(id = "rating")
    @CacheLookup
    private WebElement messageOptional17;

    @FindBy(id = "recordType")
    @CacheLookup
    private WebElement messageOptional18;

    @FindBy(id = "00N90000007BNeq")
    @CacheLookup
    private WebElement messageOptional19;

    @FindBy(id = "name_salutationacc2")
    @CacheLookup
    private WebElement messageOptional2;

    @FindBy(id = "nric")
    @CacheLookup
    private WebElement messageOptional3;

    @FindBy(id = "dob")
    @CacheLookup
    private WebElement messageOptional4;

    @FindBy(id = "nationality")
    @CacheLookup
    private WebElement messageOptional5;

    @FindBy(name = "gender")
    @CacheLookup
    private List<WebElement> messageOptional6;

    @FindBy(name = "gender")
    @CacheLookup
    private List<WebElement> messageOptional7;

    @FindBy(id = "reType")
    @CacheLookup
    private WebElement messageOptional8;

    @FindBy(id = "address")
    @CacheLookup
    private WebElement messageOptional9;

//    private final String messageOptionalValue = "Male";
//
//    private final String messageOptionalValue = "Female";

    @FindBy(id = "next")
    @CacheLookup
    private WebElement next;

    private final String pageLoadedText = "Do You Have Some Feedback About This Signup Portal";

    private final String pageUrl = "/registration.php";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneOptional1;

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneOptional2;

    @FindBy(id = "prev")
    @CacheLookup
    private WebElement previous;

    @FindBy(id = "feedbackFormSubmitButton")
    @CacheLookup
    private WebElement submit;

    public SusbcriberDetailsPage() {
    }

    public SusbcriberDetailsPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SusbcriberDetailsPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SusbcriberDetailsPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Next Button.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage clickNextButton() {
        next.click();
        return this;
    }

    /**
     * Click on Previous Button.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage clickPreviousButton() {
        previous.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage fill() {
        setMessageOptional1DropDownListField();
        setMessageOptional2DropDownListField();
        setFirstName1TextField();
        setLastName1TextField();
        setMessageOptional3TextField();
        setMessageOptional4TextField();
        setMessageOptional5DropDownListField();
//        setMessageOptional6RadioButtonField();
//        setMessageOptional7RadioButtonField();
        setMessageOptional8DropDownListField();
        setMessageOptional9TextField();
        setMessageOptional10TextField();
        setPhoneOptional1TextField();
        setMessageOptional11TextField();
        setEmail1EmailField();
        setFirstName2TextField();
        setLastName2TextField();
        setEmail2EmailField();
        setPhoneOptional2TextField();
        setMessageOptional12TextareaField();
        setMessageOptional13DropDownListField();
        setMessageOptional14DropDownListField();
        setMessageOptional15DropDownListField();
        setMessageOptional16DropDownListField();
        setMessageOptional17DropDownListField();
        setMessageOptional18DropDownListField();
        setMessageOptional19TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setEmail1EmailField() {
        return setEmail1EmailField(data.get("EMAIL_1"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setEmail1EmailField(String email1Value) {
        email1.sendKeys(email1Value);
        return this;
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setEmail2EmailField() {
        return setEmail2EmailField(data.get("EMAIL_2"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setEmail2EmailField(String email2Value) {
        email2.sendKeys(email2Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setFirstName1TextField() {
        return setFirstName1TextField(data.get("FIRST_NAME_1"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setFirstName1TextField(String firstName1Value) {
        firstName1.sendKeys(firstName1Value);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setFirstName2TextField() {
        return setFirstName2TextField(data.get("FIRST_NAME_2"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setFirstName2TextField(String firstName2Value) {
        firstName2.sendKeys(firstName2Value);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setLastName1TextField() {
        return setLastName1TextField(data.get("LAST_NAME_1"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setLastName1TextField(String lastName1Value) {
        lastName1.sendKeys(lastName1Value);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setLastName2TextField() {
        return setLastName2TextField(data.get("LAST_NAME_2"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setLastName2TextField(String lastName2Value) {
        lastName2.sendKeys(lastName2Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional10TextField() {
        return setMessageOptional10TextField(data.get("MESSAGE_OPTIONAL_10"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional10TextField(String messageOptional10Value) {
        messageOptional10.sendKeys(messageOptional10Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional11TextField() {
        return setMessageOptional11TextField(data.get("MESSAGE_OPTIONAL_11"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional11TextField(String messageOptional11Value) {
        messageOptional11.sendKeys(messageOptional11Value);
        return this;
    }

    /**
     * Set default value to Message Optional Textarea field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional12TextareaField() {
        return setMessageOptional12TextareaField(data.get("MESSAGE_OPTIONAL_12"));
    }

    /**
     * Set value to Message Optional Textarea field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional12TextareaField(String messageOptional12Value) {
        messageOptional12.sendKeys(messageOptional12Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional13DropDownListField() {
        return setMessageOptional13DropDownListField(data.get("MESSAGE_OPTIONAL_13"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional13DropDownListField(String messageOptional13Value) {
        new Select(messageOptional13).selectByVisibleText(messageOptional13Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional14DropDownListField() {
        return setMessageOptional14DropDownListField(data.get("MESSAGE_OPTIONAL_14"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional14DropDownListField(String messageOptional14Value) {
        new Select(messageOptional14).selectByVisibleText(messageOptional14Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional15DropDownListField() {
        return setMessageOptional15DropDownListField(data.get("MESSAGE_OPTIONAL_15"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional15DropDownListField(String messageOptional15Value) {
        new Select(messageOptional15).selectByVisibleText(messageOptional15Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional16DropDownListField() {
        return setMessageOptional16DropDownListField(data.get("MESSAGE_OPTIONAL_16"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional16DropDownListField(String messageOptional16Value) {
        new Select(messageOptional16).selectByVisibleText(messageOptional16Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional17DropDownListField() {
        return setMessageOptional17DropDownListField(data.get("MESSAGE_OPTIONAL_17"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional17DropDownListField(String messageOptional17Value) {
        new Select(messageOptional17).selectByVisibleText(messageOptional17Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional18DropDownListField() {
        return setMessageOptional18DropDownListField(data.get("MESSAGE_OPTIONAL_18"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional18DropDownListField(String messageOptional18Value) {
        new Select(messageOptional18).selectByVisibleText(messageOptional18Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional19TextField() {
        return setMessageOptional19TextField(data.get("MESSAGE_OPTIONAL_19"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional19TextField(String messageOptional19Value) {
        messageOptional19.sendKeys(messageOptional19Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional1DropDownListField() {
        return setMessageOptional1DropDownListField(data.get("MESSAGE_OPTIONAL_1"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional1DropDownListField(String messageOptional1Value) {
        messageOptional1.sendKeys(messageOptional1Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional2DropDownListField() {
        return setMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).selectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional3TextField() {
        return setMessageOptional3TextField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional3TextField(String messageOptional3Value) {
        messageOptional3.sendKeys(messageOptional3Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional4TextField() {
        return setMessageOptional4TextField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional4TextField(String messageOptional4Value) {
        messageOptional4.sendKeys(messageOptional4Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional5DropDownListField() {
        return setMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).selectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Set default value to Message Optional Radio Button field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
//    public SusbcriberDetailsPage setMessageOptional6RadioButtonField() {
//        for (WebElement el : messageOptional6) {
//            if (el.getAttribute("value").equals(messageOptional6Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }
//
//    /**
//     * Set default value to Message Optional Radio Button field.
//     *
//     * @return the SusbcriberDetailsPage class instance.
//     */
//    public SusbcriberDetailsPage setMessageOptional7RadioButtonField() {
//        for (WebElement el : messageOptional7) {
//            if (el.getAttribute("value").equals(messageOptional7Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional8DropDownListField() {
        return setMessageOptional8DropDownListField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional8DropDownListField(String messageOptional8Value) {
        new Select(messageOptional8).selectByVisibleText(messageOptional8Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional9TextField() {
        return setMessageOptional9TextField(data.get("MESSAGE_OPTIONAL_9"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setMessageOptional9TextField(String messageOptional9Value) {
        messageOptional9.sendKeys(messageOptional9Value);
        return this;
    }

    /**
     * Set default value to Phone Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setPhoneOptional1TextField() {
        return setPhoneOptional1TextField(data.get("PHONE_OPTIONAL_1"));
    }

    /**
     * Set value to Phone Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setPhoneOptional1TextField(String phoneOptional1Value) {
        phoneOptional1.sendKeys(phoneOptional1Value);
        return this;
    }

    /**
     * Set default value to Phone Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setPhoneOptional2TextField() {
        return setPhoneOptional2TextField(data.get("PHONE_OPTIONAL_2"));
    }

    /**
     * Set value to Phone Optional Text field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage setPhoneOptional2TextField(String phoneOptional2Value) {
        phoneOptional2.sendKeys(phoneOptional2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage submit() {
        clickSubmitButton();
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional13DropDownListField() {
        return unsetMessageOptional13DropDownListField(data.get("MESSAGE_OPTIONAL_13"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional13DropDownListField(String messageOptional13Value) {
        new Select(messageOptional13).deselectByVisibleText(messageOptional13Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional14DropDownListField() {
        return unsetMessageOptional14DropDownListField(data.get("MESSAGE_OPTIONAL_14"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional14DropDownListField(String messageOptional14Value) {
        new Select(messageOptional14).deselectByVisibleText(messageOptional14Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional15DropDownListField() {
        return unsetMessageOptional15DropDownListField(data.get("MESSAGE_OPTIONAL_15"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional15DropDownListField(String messageOptional15Value) {
        new Select(messageOptional15).deselectByVisibleText(messageOptional15Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional16DropDownListField() {
        return unsetMessageOptional16DropDownListField(data.get("MESSAGE_OPTIONAL_16"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional16DropDownListField(String messageOptional16Value) {
        new Select(messageOptional16).deselectByVisibleText(messageOptional16Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional17DropDownListField() {
        return unsetMessageOptional17DropDownListField(data.get("MESSAGE_OPTIONAL_17"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional17DropDownListField(String messageOptional17Value) {
        new Select(messageOptional17).deselectByVisibleText(messageOptional17Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional18DropDownListField() {
        return unsetMessageOptional18DropDownListField(data.get("MESSAGE_OPTIONAL_18"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional18DropDownListField(String messageOptional18Value) {
        new Select(messageOptional18).deselectByVisibleText(messageOptional18Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional2DropDownListField() {
        return unsetMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).deselectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional5DropDownListField() {
        return unsetMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).deselectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional8DropDownListField() {
        return unsetMessageOptional8DropDownListField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage unsetMessageOptional8DropDownListField(String messageOptional8Value) {
        new Select(messageOptional8).deselectByVisibleText(messageOptional8Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage verifyPageLoaded() {
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
     * @return the SusbcriberDetailsPage class instance.
     */
    public SusbcriberDetailsPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

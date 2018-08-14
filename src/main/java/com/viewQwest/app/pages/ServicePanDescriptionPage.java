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

public class ServicePanDescriptionPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "numNonDisplay")
    @CacheLookup
    private WebElement annualNumberNondisplay641;

    @FindBy(id = "numNonDisplay1")
    @CacheLookup
    private WebElement annualNumberNondisplay642;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email;

    @FindBy(id = "first_name")
    @CacheLookup
    private WebElement firstName;

    @FindBy(id = "referenceName")
    @CacheLookup
    private WebElement howDidYouComeToKnow1;

    @FindBy(id = "other_reference")
    @CacheLookup
    private WebElement howDidYouComeToKnow2;

    @FindBy(id = "last_name")
    @CacheLookup
    private WebElement lastName;

    @FindBy(id = "subscription")
    @CacheLookup
    private WebElement messageOptional1;

    @FindBy(id = "description")
    @CacheLookup
    private WebElement messageOptional10;

    @FindBy(id = "00N9000000E4U94")
    @CacheLookup
    private WebElement messageOptional11;

    @FindBy(id = "00N9000000EVwmu")
    @CacheLookup
    private WebElement messageOptional12;

    @FindBy(id = "00N9000000E4U8L")
    @CacheLookup
    private WebElement messageOptional13;

    @FindBy(id = "00N9000000E4U8z")
    @CacheLookup
    private WebElement messageOptional14;

    @FindBy(id = "rating")
    @CacheLookup
    private WebElement messageOptional15;

    @FindBy(id = "recordType")
    @CacheLookup
    private WebElement messageOptional16;

    @FindBy(id = "00N90000007BNeq")
    @CacheLookup
    private WebElement messageOptional17;

    @FindBy(id = "fiberGuard")
    @CacheLookup
    private WebElement messageOptional2;

    @FindBy(name = "netflix")
    @CacheLookup
    private List<WebElement> messageOptional3;

    @FindBy(id = "netflixUSA")
    @CacheLookup
    private WebElement messageOptional4;

    @FindBy(id = "netflixSG")
    @CacheLookup
    private WebElement messageOptional5;

    @FindBy(name = "netflix")
    @CacheLookup
    private List<WebElement> messageOptional6;

    @FindBy(id = "remarksField")
    @CacheLookup
    private WebElement messageOptional7;

    @FindBy(id = "salesStaffName")
    @CacheLookup
    private WebElement messageOptional8;

    @FindBy(id = "promoter_name")
    @CacheLookup
    private WebElement messageOptional9;

//    private final String messageOptionalValue = "No";

    private final String messageOptionalValue = "Yes";

    @FindBy(id = "installationCharge_2_1Gbps")
    @CacheLookup
    private WebElement mondayFriday6pmTo8pm;

    @FindBy(id = "installationCharge_2Gbps1")
    @CacheLookup
    private WebElement mondayFriday6pmTo8pmsaturday;

    @FindBy(id = "installationCharge_1_1Gbps")
    @CacheLookup
    private WebElement mondayFriday9amTo6pm1;

    @FindBy(id = "free_installation")
    @CacheLookup
    private WebElement mondayFriday9amTo6pm2;

    @FindBy(id = "self_installation")
    @CacheLookup
    private WebElement mondayFriday9amTo6pm3;

    @FindBy(id = "oneVoice_Monthly")
    @CacheLookup
    private WebElement monthlyNumberNondisplay51;

    @FindBy(id = "oneVoice_Annual")
    @CacheLookup
    private WebElement monthlyNumberNondisplay52;

    @FindBy(id = "next")
    @CacheLookup
    private WebElement next;

    private final String pageLoadedText = "As per Singapore Government regulations - if you wish to opt for Fibre-Guard, the first 6 months of the service will be free";

    private final String pageUrl = "/plandetails.php";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneOptional;

    @FindBy(id = "feedbackFormSubmitButton")
    @CacheLookup
    private WebElement submit;

    @FindBy(id = "mediaPlayer")
    @CacheLookup
    private WebElement viewqwestTvMediaPlayerWithDaiyo1;

    @FindBy(id = "mediaPlayer2")
    @CacheLookup
    private WebElement viewqwestTvMediaPlayerWithDaiyo2;

    public ServicePanDescriptionPage() {
    }

    public ServicePanDescriptionPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ServicePanDescriptionPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ServicePanDescriptionPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Next Button.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage clickNextButton() {
        next.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage fill() {
        setMessageOptional1DropDownListField();
        setMessageOptional2DropDownListField();
        setMonthlyNumberNondisplay51CheckboxField();
        setMonthlyNumberNondisplay52CheckboxField();
        setAnnualNumberNondisplay641CheckboxField();
        setAnnualNumberNondisplay642CheckboxField();
        setMondayFriday9amTo6pm1CheckboxField();
        setMondayFriday6pmTo8pmCheckboxField();
        setMondayFriday9amTo6pm2CheckboxField();
        setMondayFriday9amTo6pm3CheckboxField();
        setMondayFriday6pmTo8pmsaturdayCheckboxField();
        setViewqwestTvMediaPlayerWithDaiyo1CheckboxField();
        setViewqwestTvMediaPlayerWithDaiyo2CheckboxField();
//        setMessageOptional3RadioButtonField();
        setMessageOptional4CheckboxField();
        setMessageOptional5CheckboxField();
//        setMessageOptional6RadioButtonField();
        setMessageOptional7TextareaField();
        setMessageOptional8DropDownListField();
        setMessageOptional9TextField();
        setHowDidYouComeToKnow1TextField();
        setHowDidYouComeToKnow2TextField();
        setFirstNameTextField();
        setLastNameTextField();
        setEmailEmailField();
        setPhoneOptionalTextField();
        setMessageOptional10TextareaField();
        setMessageOptional11DropDownListField();
        setMessageOptional12DropDownListField();
        setMessageOptional13DropDownListField();
        setMessageOptional14DropDownListField();
        setMessageOptional15DropDownListField();
        setMessageOptional16DropDownListField();
        setMessageOptional17TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set Annual Number Nondisplay 64 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setAnnualNumberNondisplay641CheckboxField() {
        if (!annualNumberNondisplay641.isSelected()) {
            annualNumberNondisplay641.click();
        }
        return this;
    }

    /**
     * Set Annual Number Nondisplay 64 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setAnnualNumberNondisplay642CheckboxField() {
        if (!annualNumberNondisplay642.isSelected()) {
            annualNumberNondisplay642.click();
        }
        return this;
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setEmailEmailField() {
        return setEmailEmailField(data.get("EMAIL"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setEmailEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setFirstNameTextField() {
        return setFirstNameTextField(data.get("FIRST_NAME"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setFirstNameTextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set default value to How Did You Come To Know About Viewqwest Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setHowDidYouComeToKnow1TextField() {
        return setHowDidYouComeToKnow1TextField(data.get("HOW_DID_YOU_COME_TO_KNOW_1"));
    }

    /**
     * Set value to How Did You Come To Know About Viewqwest Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setHowDidYouComeToKnow1TextField(String howDidYouComeToKnow1Value) {
        new Select(howDidYouComeToKnow1).selectByVisibleText(howDidYouComeToKnow1Value);
        return this;
    }

    /**
     * Set default value to How Did You Come To Know About Viewqwest Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setHowDidYouComeToKnow2TextField() {
        return setHowDidYouComeToKnow2TextField(data.get("HOW_DID_YOU_COME_TO_KNOW_2"));
    }

    /**
     * Set value to How Did You Come To Know About Viewqwest Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setHowDidYouComeToKnow2TextField(String howDidYouComeToKnow2Value) {
        howDidYouComeToKnow2.sendKeys(howDidYouComeToKnow2Value);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setLastNameTextField() {
        return setLastNameTextField(data.get("LAST_NAME"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setLastNameTextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set default value to Message Optional Textarea field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional10TextareaField() {
        return setMessageOptional10TextareaField(data.get("MESSAGE_OPTIONAL_10"));
    }

    /**
     * Set value to Message Optional Textarea field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional10TextareaField(String messageOptional10Value) {
        messageOptional10.sendKeys(messageOptional10Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional11DropDownListField() {
        return setMessageOptional11DropDownListField(data.get("MESSAGE_OPTIONAL_11"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional11DropDownListField(String messageOptional11Value) {
        new Select(messageOptional11).selectByVisibleText(messageOptional11Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional12DropDownListField() {
        return setMessageOptional12DropDownListField(data.get("MESSAGE_OPTIONAL_12"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional12DropDownListField(String messageOptional12Value) {
        new Select(messageOptional12).selectByVisibleText(messageOptional12Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional13DropDownListField() {
        return setMessageOptional13DropDownListField(data.get("MESSAGE_OPTIONAL_13"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional13DropDownListField(String messageOptional13Value) {
        new Select(messageOptional13).selectByVisibleText(messageOptional13Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional14DropDownListField() {
        return setMessageOptional14DropDownListField(data.get("MESSAGE_OPTIONAL_14"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional14DropDownListField(String messageOptional14Value) {
        new Select(messageOptional14).selectByVisibleText(messageOptional14Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional15DropDownListField() {
        return setMessageOptional15DropDownListField(data.get("MESSAGE_OPTIONAL_15"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional15DropDownListField(String messageOptional15Value) {
        new Select(messageOptional15).selectByVisibleText(messageOptional15Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional16DropDownListField() {
        return setMessageOptional16DropDownListField(data.get("MESSAGE_OPTIONAL_16"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional16DropDownListField(String messageOptional16Value) {
        new Select(messageOptional16).selectByVisibleText(messageOptional16Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional17TextField() {
        return setMessageOptional17TextField(data.get("MESSAGE_OPTIONAL_17"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional17TextField(String messageOptional17Value) {
        messageOptional17.sendKeys(messageOptional17Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional1DropDownListField() {
        return setMessageOptional1DropDownListField(data.get("MESSAGE_OPTIONAL_1"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional1DropDownListField(String messageOptional1Value) {
        new Select(messageOptional1).selectByVisibleText(messageOptional1Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional2DropDownListField() {
        return setMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).selectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Set default value to Message Optional Radio Button field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
//    public ServicePanDescriptionPage setMessageOptional3RadioButtonField() {
//        for (WebElement el : messageOptional3) {
//            if (el.getAttribute("value").equals(messageOptional3Value)) {
//                if (!el.isSelected()) {
//                    el.click();
//                }
//                break;
//            }
//        }
//        return this;
//    }

    /**
     * Set Message Optional Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional4CheckboxField() {
        if (!messageOptional4.isSelected()) {
            messageOptional4.click();
        }
        return this;
    }

    /**
     * Set Message Optional Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional5CheckboxField() {
        if (!messageOptional5.isSelected()) {
            messageOptional5.click();
        }
        return this;
    }

    /**
     * Set default value to Message Optional Radio Button field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
//    public ServicePanDescriptionPage setMessageOptional6RadioButtonField() {
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

    /**
     * Set default value to Message Optional Textarea field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional7TextareaField() {
        return setMessageOptional7TextareaField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Set value to Message Optional Textarea field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional7TextareaField(String messageOptional7Value) {
        messageOptional7.sendKeys(messageOptional7Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional8DropDownListField() {
        return setMessageOptional8DropDownListField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional8DropDownListField(String messageOptional8Value) {
        new Select(messageOptional8).selectByVisibleText(messageOptional8Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional9TextField() {
        return setMessageOptional9TextField(data.get("MESSAGE_OPTIONAL_9"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMessageOptional9TextField(String messageOptional9Value) {
        messageOptional9.sendKeys(messageOptional9Value);
        return this;
    }

    /**
     * Set Monday Friday 6pm To 8pm Saturday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMondayFriday6pmTo8pmCheckboxField() {
        if (!mondayFriday6pmTo8pm.isSelected()) {
            mondayFriday6pmTo8pm.click();
        }
        return this;
    }

    /**
     * Set Monday Friday 6pm To 8pmsaturday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMondayFriday6pmTo8pmsaturdayCheckboxField() {
        if (!mondayFriday6pmTo8pmsaturday.isSelected()) {
            mondayFriday6pmTo8pmsaturday.click();
        }
        return this;
    }

    /**
     * Set Monday Friday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMondayFriday9amTo6pm1CheckboxField() {
        if (!mondayFriday9amTo6pm1.isSelected()) {
            mondayFriday9amTo6pm1.click();
        }
        return this;
    }

    /**
     * Set Monday Friday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMondayFriday9amTo6pm2CheckboxField() {
        if (!mondayFriday9amTo6pm2.isSelected()) {
            mondayFriday9amTo6pm2.click();
        }
        return this;
    }

    /**
     * Set Monday Friday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMondayFriday9amTo6pm3CheckboxField() {
        if (!mondayFriday9amTo6pm3.isSelected()) {
            mondayFriday9amTo6pm3.click();
        }
        return this;
    }

    /**
     * Set Monthly Number Nondisplay 5 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMonthlyNumberNondisplay51CheckboxField() {
        if (!monthlyNumberNondisplay51.isSelected()) {
            monthlyNumberNondisplay51.click();
        }
        return this;
    }

    /**
     * Set Monthly Number Nondisplay 5 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setMonthlyNumberNondisplay52CheckboxField() {
        if (!monthlyNumberNondisplay52.isSelected()) {
            monthlyNumberNondisplay52.click();
        }
        return this;
    }

    /**
     * Set default value to Phone Optional Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setPhoneOptionalTextField() {
        return setPhoneOptionalTextField(data.get("PHONE_OPTIONAL"));
    }

    /**
     * Set value to Phone Optional Text field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setPhoneOptionalTextField(String phoneOptionalValue) {
        phoneOptional.sendKeys(phoneOptionalValue);
        return this;
    }

    /**
     * Set Viewqwest Tv Media Player With Daiyo Antenna Bundle 147 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setViewqwestTvMediaPlayerWithDaiyo1CheckboxField() {
        if (!viewqwestTvMediaPlayerWithDaiyo1.isSelected()) {
            viewqwestTvMediaPlayerWithDaiyo1.click();
        }
        return this;
    }

    /**
     * Set Viewqwest Tv Media Player With Daiyo Antenna Bundle 147 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage setViewqwestTvMediaPlayerWithDaiyo2CheckboxField() {
        if (!viewqwestTvMediaPlayerWithDaiyo2.isSelected()) {
            viewqwestTvMediaPlayerWithDaiyo2.click();
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage submit() {
        clickSubmitButton();
        return this;
    }

    /**
     * Unset Annual Number Nondisplay 64 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetAnnualNumberNondisplay641CheckboxField() {
        if (annualNumberNondisplay641.isSelected()) {
            annualNumberNondisplay641.click();
        }
        return this;
    }

    /**
     * Unset Annual Number Nondisplay 64 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetAnnualNumberNondisplay642CheckboxField() {
        if (annualNumberNondisplay642.isSelected()) {
            annualNumberNondisplay642.click();
        }
        return this;
    }

    /**
     * Unset default value from How Did You Come To Know About Viewqwest Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
//    public ServicePanDescriptionPage unsetHowDidYouComeToKnowDropDownListField() {
//        return unsetHowDidYouComeToKnowDropDownListField(data.get("HOW_DID_YOU_COME_TO_KNOW"));
//    }

    /**
     * Unset value from How Did You Come To Know About Viewqwest Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
//    public ServicePanDescriptionPage unsetHowDidYouComeToKnowDropDownListField(String howDidYouComeToKnowValue) {
//        new Select(howDidYouComeToKnow).deselectByVisibleText(howDidYouComeToKnowValue);
//        return this;
//    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional11DropDownListField() {
        return unsetMessageOptional11DropDownListField(data.get("MESSAGE_OPTIONAL_11"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional11DropDownListField(String messageOptional11Value) {
        new Select(messageOptional11).deselectByVisibleText(messageOptional11Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional12DropDownListField() {
        return unsetMessageOptional12DropDownListField(data.get("MESSAGE_OPTIONAL_12"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional12DropDownListField(String messageOptional12Value) {
        new Select(messageOptional12).deselectByVisibleText(messageOptional12Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional13DropDownListField() {
        return unsetMessageOptional13DropDownListField(data.get("MESSAGE_OPTIONAL_13"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional13DropDownListField(String messageOptional13Value) {
        new Select(messageOptional13).deselectByVisibleText(messageOptional13Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional14DropDownListField() {
        return unsetMessageOptional14DropDownListField(data.get("MESSAGE_OPTIONAL_14"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional14DropDownListField(String messageOptional14Value) {
        new Select(messageOptional14).deselectByVisibleText(messageOptional14Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional15DropDownListField() {
        return unsetMessageOptional15DropDownListField(data.get("MESSAGE_OPTIONAL_15"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional15DropDownListField(String messageOptional15Value) {
        new Select(messageOptional15).deselectByVisibleText(messageOptional15Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional16DropDownListField() {
        return unsetMessageOptional16DropDownListField(data.get("MESSAGE_OPTIONAL_16"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional16DropDownListField(String messageOptional16Value) {
        new Select(messageOptional16).deselectByVisibleText(messageOptional16Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional1DropDownListField() {
        return unsetMessageOptional1DropDownListField(data.get("MESSAGE_OPTIONAL_1"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional1DropDownListField(String messageOptional1Value) {
        new Select(messageOptional1).deselectByVisibleText(messageOptional1Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional2DropDownListField() {
        return unsetMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).deselectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Unset Message Optional Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional4CheckboxField() {
        if (messageOptional4.isSelected()) {
            messageOptional4.click();
        }
        return this;
    }

    /**
     * Unset Message Optional Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional5CheckboxField() {
        if (messageOptional5.isSelected()) {
            messageOptional5.click();
        }
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional8DropDownListField() {
        return unsetMessageOptional8DropDownListField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMessageOptional8DropDownListField(String messageOptional8Value) {
        new Select(messageOptional8).deselectByVisibleText(messageOptional8Value);
        return this;
    }

    /**
     * Unset Monday Friday 6pm To 8pm Saturday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMondayFriday6pmTo8pmCheckboxField() {
        if (mondayFriday6pmTo8pm.isSelected()) {
            mondayFriday6pmTo8pm.click();
        }
        return this;
    }

    /**
     * Unset Monday Friday 6pm To 8pmsaturday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMondayFriday6pmTo8pmsaturdayCheckboxField() {
        if (mondayFriday6pmTo8pmsaturday.isSelected()) {
            mondayFriday6pmTo8pmsaturday.click();
        }
        return this;
    }

    /**
     * Unset Monday Friday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMondayFriday9amTo6pm1CheckboxField() {
        if (mondayFriday9amTo6pm1.isSelected()) {
            mondayFriday9amTo6pm1.click();
        }
        return this;
    }

    /**
     * Unset Monday Friday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMondayFriday9amTo6pm2CheckboxField() {
        if (mondayFriday9amTo6pm2.isSelected()) {
            mondayFriday9amTo6pm2.click();
        }
        return this;
    }

    /**
     * Unset Monday Friday 9am To 6pm Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMondayFriday9amTo6pm3CheckboxField() {
        if (mondayFriday9amTo6pm3.isSelected()) {
            mondayFriday9amTo6pm3.click();
        }
        return this;
    }

    /**
     * Unset Monthly Number Nondisplay 5 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMonthlyNumberNondisplay51CheckboxField() {
        if (monthlyNumberNondisplay51.isSelected()) {
            monthlyNumberNondisplay51.click();
        }
        return this;
    }

    /**
     * Unset Monthly Number Nondisplay 5 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetMonthlyNumberNondisplay52CheckboxField() {
        if (monthlyNumberNondisplay52.isSelected()) {
            monthlyNumberNondisplay52.click();
        }
        return this;
    }

    /**
     * Unset Viewqwest Tv Media Player With Daiyo Antenna Bundle 147 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetViewqwestTvMediaPlayerWithDaiyo1CheckboxField() {
        if (viewqwestTvMediaPlayerWithDaiyo1.isSelected()) {
            viewqwestTvMediaPlayerWithDaiyo1.click();
        }
        return this;
    }

    /**
     * Unset Viewqwest Tv Media Player With Daiyo Antenna Bundle 147 Checkbox field.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage unsetViewqwestTvMediaPlayerWithDaiyo2CheckboxField() {
        if (viewqwestTvMediaPlayerWithDaiyo2.isSelected()) {
            viewqwestTvMediaPlayerWithDaiyo2.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage verifyPageLoaded() {
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
     * @return the ServicePanDescriptionPage class instance.
     */
    public ServicePanDescriptionPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

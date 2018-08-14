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

public class FeasibilityCheckPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "check-coverage-button")
    @CacheLookup
    private WebElement checkForCoverage;

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

    private final String pageLoadedText = "Use the form below to check if your place is Fiber-Ready";

    private final String pageUrl = "/feasibilitycheck.php";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneOptional;

    @FindBy(id = "ftpOption")
    @CacheLookup
    private WebElement pleaseSelectPreferredInstallationChoice;

    @FindBy(id = "feedbackFormSubmitButton")
    @CacheLookup
    private WebElement submit;

    @FindBy(id = "postal")
    @CacheLookup
    private WebElement tickHereForLandedPremises1;

    @FindBy(id = "floor")
    @CacheLookup
    private WebElement tickHereForLandedPremises2;

    @FindBy(id = "unit")
    @CacheLookup
    private WebElement tickHereForLandedPremises3;

    @FindBy(id = "landed")
    @CacheLookup
    private WebElement tickHereForLandedPremises4;

    public FeasibilityCheckPage() {
    }

    public FeasibilityCheckPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public FeasibilityCheckPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public FeasibilityCheckPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Check For Coverage Button.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage clickCheckForCoverageButton() {
        checkForCoverage.click();
        return this;
    }

    /**
     * Click on Next Button.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage clickNextButton() {
        next.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage fill() {
        setTickHereForLandedPremises1TextField();
        setTickHereForLandedPremises2TextField();
        setTickHereForLandedPremises3TextField();
        setTickHereForLandedPremises4CheckboxField();
        setPleaseSelectPreferredInstallationChoiceDropDownListField();
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
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setEmailEmailField() {
        return setEmailEmailField(data.get("EMAIL"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setEmailEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setFirstNameTextField() {
        return setFirstNameTextField(data.get("FIRST_NAME"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setFirstNameTextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setLastNameTextField() {
        return setLastNameTextField(data.get("LAST_NAME"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setLastNameTextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional1DropDownListField() {
        return setMessageOptional1DropDownListField(data.get("MESSAGE_OPTIONAL_1"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional1DropDownListField(String messageOptional1Value) {
        messageOptional1.sendKeys(messageOptional1Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional2DropDownListField() {
        return setMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).selectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional3DropDownListField() {
        return setMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).selectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional4DropDownListField() {
        return setMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).selectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional5DropDownListField() {
        return setMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).selectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional6DropDownListField() {
        return setMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).selectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional7DropDownListField() {
        return setMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).selectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional8TextField() {
        return setMessageOptional8TextField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setMessageOptional8TextField(String messageOptional8Value) {
        messageOptional8.sendKeys(messageOptional8Value);
        return this;
    }

    /**
     * Set default value to Phone Optional Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setPhoneOptionalTextField() {
        return setPhoneOptionalTextField(data.get("PHONE_OPTIONAL"));
    }

    /**
     * Set value to Phone Optional Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setPhoneOptionalTextField(String phoneOptionalValue) {
        phoneOptional.sendKeys(phoneOptionalValue);
        return this;
    }

    /**
     * Set default value to Please Select Preferred Installation Choice Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setPleaseSelectPreferredInstallationChoiceDropDownListField() {
        return setPleaseSelectPreferredInstallationChoiceDropDownListField(data.get("PLEASE_SELECT_PREFERRED_INSTALLATION_CHOICE"));
    }

    /**
     * Set value to Please Select Preferred Installation Choice Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setPleaseSelectPreferredInstallationChoiceDropDownListField(String pleaseSelectPreferredInstallationChoiceValue) {
        new Select(pleaseSelectPreferredInstallationChoice).selectByVisibleText(pleaseSelectPreferredInstallationChoiceValue);
        return this;
    }

    /**
     * Set default value to Tick Here For Landed Premises Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setTickHereForLandedPremises1TextField() {
        return setTickHereForLandedPremises1TextField(data.get("TICK_HERE_FOR_LANDED_PREMISES_1"));
    }

    /**
     * Set value to Tick Here For Landed Premises Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setTickHereForLandedPremises1TextField(String tickHereForLandedPremises1Value) {
        tickHereForLandedPremises1.sendKeys(tickHereForLandedPremises1Value);
        return this;
    }

    /**
     * Set default value to Tick Here For Landed Premises Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setTickHereForLandedPremises2TextField() {
        return setTickHereForLandedPremises2TextField(data.get("TICK_HERE_FOR_LANDED_PREMISES_2"));
    }

    /**
     * Set value to Tick Here For Landed Premises Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setTickHereForLandedPremises2TextField(String tickHereForLandedPremises2Value) {
        tickHereForLandedPremises2.sendKeys(tickHereForLandedPremises2Value);
        return this;
    }

    /**
     * Set default value to Tick Here For Landed Premises Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setTickHereForLandedPremises3TextField() {
        return setTickHereForLandedPremises3TextField(data.get("TICK_HERE_FOR_LANDED_PREMISES_3"));
    }

    /**
     * Set value to Tick Here For Landed Premises Text field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setTickHereForLandedPremises3TextField(String tickHereForLandedPremises3Value) {
        tickHereForLandedPremises3.sendKeys(tickHereForLandedPremises3Value);
        return this;
    }

    /**
     * Set Tick Here For Landed Premises Checkbox field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage setTickHereForLandedPremises4CheckboxField() {
        if (!tickHereForLandedPremises4.isSelected()) {
            tickHereForLandedPremises4.click();
        }
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage submit() {
        clickSubmitButton();
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional2DropDownListField() {
        return unsetMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).deselectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional3DropDownListField() {
        return unsetMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).deselectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional4DropDownListField() {
        return unsetMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).deselectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional5DropDownListField() {
        return unsetMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).deselectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional6DropDownListField() {
        return unsetMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).deselectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional7DropDownListField() {
        return unsetMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).deselectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Unset default value from Please Select Preferred Installation Choice Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetPleaseSelectPreferredInstallationChoiceDropDownListField() {
        return unsetPleaseSelectPreferredInstallationChoiceDropDownListField(data.get("PLEASE_SELECT_PREFERRED_INSTALLATION_CHOICE"));
    }

    /**
     * Unset value from Please Select Preferred Installation Choice Drop Down List field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetPleaseSelectPreferredInstallationChoiceDropDownListField(String pleaseSelectPreferredInstallationChoiceValue) {
        new Select(pleaseSelectPreferredInstallationChoice).deselectByVisibleText(pleaseSelectPreferredInstallationChoiceValue);
        return this;
    }

    /**
     * Unset Tick Here For Landed Premises Checkbox field.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage unsetTickHereForLandedPremises4CheckboxField() {
        if (tickHereForLandedPremises4.isSelected()) {
            tickHereForLandedPremises4.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage verifyPageLoaded() {
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
     * @return the FeasibilityCheckPage class instance.
     */
    public FeasibilityCheckPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

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

public class TermsAndConditionPage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#terms div.terms-wrapper div.terms-contents table tbody tr:nth-of-type(21) td table tbody tr:nth-of-type(7) td:nth-of-type(3) a")
    @CacheLookup
    private WebElement csviewqwestCom1;

    @FindBy(css = "#terms div.terms-wrapper div.terms-contents table tbody tr:nth-of-type(38) td table tbody tr:nth-of-type(2) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement csviewqwestCom2;

    @FindBy(css = "#terms div.terms-wrapper div.terms-contents table tbody tr:nth-of-type(44) td table tbody tr:nth-of-type(5) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement csviewqwestCom3;

    @FindBy(css = "#terms div.terms-wrapper div.terms-contents table tbody tr:nth-of-type(47) td table tbody tr:nth-of-type(3) td:nth-of-type(2) a")
    @CacheLookup
    private WebElement csviewqwestCom4;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email;

    @FindBy(id = "first_name")
    @CacheLookup
    private WebElement firstName;

    @FindBy(css = "a[href='http://www.viewqwest.com/faq.html']")
    @CacheLookup
    private WebElement httpwwwViewqwestComfaqHtml;

    @FindBy(css = "a[href='http://www.viewqwest.com/subscribercare/Viewqwest_TermsAndConditions.pdf']")
    @CacheLookup
    private WebElement httpwwwViewqwestComsubscribercareviewqwesttermsandconditionsPdf;

    @FindBy(name = "terms_and_conditions")
    @CacheLookup
    private WebElement iHaveReadAndAcceptThese;

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

    private final String pageLoadedText = "The termination will be done within 3 to 5 working days upon return of all hardware or equipment provided (ONU, Patch Cable and Power Adaptor) in good working order and condition to ViewQwest’s showroom at 200 Bukit Timah Road, Singapore 229862, failing which ViewQwest may in its option deem the service (and any plans thereof) to be continuing at the full stipulated charges";

    private final String pageUrl = "/terms-and-conditions.php";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneOptional;

    @FindBy(id = "next")
    @CacheLookup
    private WebElement proceedToPayment;

    @FindBy(css = "a[href='mailto:sales@viewqwest.com']")
    @CacheLookup
    private WebElement salesviewqwestCom;

    @FindBy(id = "feedbackFormSubmitButton")
    @CacheLookup
    private WebElement submit;

    public TermsAndConditionPage() {
    }

    public TermsAndConditionPage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public TermsAndConditionPage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public TermsAndConditionPage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Csviewqwest.com Link.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickCsviewqwestCom1Link() {
        csviewqwestCom1.click();
        return this;
    }

    /**
     * Click on Csviewqwest.com Link.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickCsviewqwestCom2Link() {
        csviewqwestCom2.click();
        return this;
    }

    /**
     * Click on Csviewqwest.com Link.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickCsviewqwestCom3Link() {
        csviewqwestCom3.click();
        return this;
    }

    /**
     * Click on Csviewqwest.com Link.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickCsviewqwestCom4Link() {
        csviewqwestCom4.click();
        return this;
    }

    /**
     * Click on Httpwww.viewqwest.comfaq.html Link.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickHttpwwwViewqwestComfaqHtmlLink() {
        httpwwwViewqwestComfaqHtml.click();
        return this;
    }

    /**
     * Click on Httpwww.viewqwest.comsubscribercareviewqwesttermsandconditions.pdf Link.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickHttpwwwViewqwestComsubscribercareviewqwesttermsandconditionsPdfLink() {
        httpwwwViewqwestComsubscribercareviewqwesttermsandconditionsPdf.click();
        return this;
    }

    /**
     * Click on Proceed To Payment Button.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickProceedToPaymentButton() {
        proceedToPayment.click();
        return this;
    }

    /**
     * Click on Salesviewqwest.com Link.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickSalesviewqwestComLink() {
        salesviewqwestCom.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage fill() {
        setIHaveReadAndAcceptTheseCheckboxField();
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
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setEmailEmailField() {
        return setEmailEmailField(data.get("EMAIL"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setEmailEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to First Name Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setFirstNameTextField() {
        return setFirstNameTextField(data.get("FIRST_NAME"));
    }

    /**
     * Set value to First Name Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setFirstNameTextField(String firstNameValue) {
        firstName.sendKeys(firstNameValue);
        return this;
    }

    /**
     * Set I Have Read And Accept These Terms And Conditions And Hereby Do Consent To Be Charged By Viewqwest Pte Ltd For Services Requested Checkbox field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setIHaveReadAndAcceptTheseCheckboxField() {
        if (!iHaveReadAndAcceptThese.isSelected()) {
            iHaveReadAndAcceptThese.click();
        }
        return this;
    }

    /**
     * Set default value to Last Name Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setLastNameTextField() {
        return setLastNameTextField(data.get("LAST_NAME"));
    }

    /**
     * Set value to Last Name Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setLastNameTextField(String lastNameValue) {
        lastName.sendKeys(lastNameValue);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional1DropDownListField() {
        return setMessageOptional1DropDownListField(data.get("MESSAGE_OPTIONAL_1"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional1DropDownListField(String messageOptional1Value) {
        messageOptional1.sendKeys(messageOptional1Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional2DropDownListField() {
        return setMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).selectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional3DropDownListField() {
        return setMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).selectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional4DropDownListField() {
        return setMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).selectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional5DropDownListField() {
        return setMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).selectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional6DropDownListField() {
        return setMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).selectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Set default value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional7DropDownListField() {
        return setMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Set value to Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).selectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Set default value to Message Optional Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional8TextField() {
        return setMessageOptional8TextField(data.get("MESSAGE_OPTIONAL_8"));
    }

    /**
     * Set value to Message Optional Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setMessageOptional8TextField(String messageOptional8Value) {
        messageOptional8.sendKeys(messageOptional8Value);
        return this;
    }

    /**
     * Set default value to Phone Optional Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setPhoneOptionalTextField() {
        return setPhoneOptionalTextField(data.get("PHONE_OPTIONAL"));
    }

    /**
     * Set value to Phone Optional Text field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage setPhoneOptionalTextField(String phoneOptionalValue) {
        phoneOptional.sendKeys(phoneOptionalValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage submit() {
        clickSubmitButton();
        return this;
    }

    /**
     * Unset I Have Read And Accept These Terms And Conditions And Hereby Do Consent To Be Charged By Viewqwest Pte Ltd For Services Requested Checkbox field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetIHaveReadAndAcceptTheseCheckboxField() {
        if (iHaveReadAndAcceptThese.isSelected()) {
            iHaveReadAndAcceptThese.click();
        }
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional2DropDownListField() {
        return unsetMessageOptional2DropDownListField(data.get("MESSAGE_OPTIONAL_2"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional2DropDownListField(String messageOptional2Value) {
        new Select(messageOptional2).deselectByVisibleText(messageOptional2Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional3DropDownListField() {
        return unsetMessageOptional3DropDownListField(data.get("MESSAGE_OPTIONAL_3"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional3DropDownListField(String messageOptional3Value) {
        new Select(messageOptional3).deselectByVisibleText(messageOptional3Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional4DropDownListField() {
        return unsetMessageOptional4DropDownListField(data.get("MESSAGE_OPTIONAL_4"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional4DropDownListField(String messageOptional4Value) {
        new Select(messageOptional4).deselectByVisibleText(messageOptional4Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional5DropDownListField() {
        return unsetMessageOptional5DropDownListField(data.get("MESSAGE_OPTIONAL_5"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional5DropDownListField(String messageOptional5Value) {
        new Select(messageOptional5).deselectByVisibleText(messageOptional5Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional6DropDownListField() {
        return unsetMessageOptional6DropDownListField(data.get("MESSAGE_OPTIONAL_6"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional6DropDownListField(String messageOptional6Value) {
        new Select(messageOptional6).deselectByVisibleText(messageOptional6Value);
        return this;
    }

    /**
     * Unset default value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional7DropDownListField() {
        return unsetMessageOptional7DropDownListField(data.get("MESSAGE_OPTIONAL_7"));
    }

    /**
     * Unset value from Message Optional Drop Down List field.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage unsetMessageOptional7DropDownListField(String messageOptional7Value) {
        new Select(messageOptional7).deselectByVisibleText(messageOptional7Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage verifyPageLoaded() {
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
     * @return the TermsAndConditionPage class instance.
     */
    public TermsAndConditionPage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}

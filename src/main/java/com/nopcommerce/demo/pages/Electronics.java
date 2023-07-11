package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {

    By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");

    By verifyTextCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By clickOnListViewTab = By.xpath("//a[contains(text(),'List')]");

    By clickONNokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By verifyTextNokiaLumia1020 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By verifyThePrice = By.id("price-value-20");
    By changedTheQty = By.id("product_enteredQuantity_20");
    By addToCartBtn = By.id("add-to-cart-button-20");
    By verifyTheMessageTheProductHasBeenAddedToYourCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By clickOnCross = By.xpath("//span[@title='Close']");
    By mouseHoverOnShoppingCart = By.xpath("//span[@class='cart-label']");
    By enterGoToCart = By.xpath("//button[normalize-space()='Go to cart']");
    By verifyMessageShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By verifyQty2 = By.xpath("//td[@class='quantity']");
    By verifyTheTotal = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By clickTheCheckBoxOfTermsAndCondition = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout = By.id("checkout");
    By verifyTheTextWelcomePleaseSignIN = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By selectRegister = By.xpath("//button[contains(text(),'Register')]");
    By verifyTheTextRegister = By.xpath("//h1[contains(text(),'Register')]");
    By clickOnGender = By.xpath("//input[@id='gender-male']");
    By enterFirstName = By.id("FirstName");
    By enterLastName = By.id("LastName");
    By enterEmailAddress = By.id("Email");
    By enterPassword = By.id("Password");
    By enterConfirmPassword = By.id("ConfirmPassword");
    By clickOnRegister = By.id("register-button");
    By verifyTextRegistrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");

    By clickOnContinue = By.xpath("//a[@class='button-1 register-continue-button']");
    By verifyTheTextShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By clickOnTermsAndCondition = By.id("termsofservice");
    By pressCheckout = By.id("checkout");
    By firstName = By.id("BillingNewAddress_FirstName");
    By secondName = By.id("BillingNewAddress_LastName");
    By emailAddress = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By postCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By selectContinue = By.xpath("//button[@onclick='Billing.save()']");
    By select2ndDayAir = By.xpath("//input[@id='shippingoption_2']");
    By selectCon = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By clickCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By clickCon = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By selectCreditCard = By.id("CreditCardType");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expirationMonth = By.id("ExpireMonth");
    By expirationYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By cardContinueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By verifyCreditCard = By.xpath("//span[normalize-space()='Credit Card']");
    By verify2ndDayAirText = By.xpath("//span[normalize-space()='2nd Day Air']");
    By verifyProductSubTotal = By.xpath("//span[@class='product-subtotal']");
    By clickingConfirm = By.xpath("//button[normalize-space()='Confirm']");
    By verifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By veryTextOrderSuccessfully = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueClick = By.xpath("//button[normalize-space()='Continue']");
    By enterEmailId = By.id("Email");
    By enterPass = By.id("Password");
    By logIn = By.xpath("//button[normalize-space()='Log in']");
    By clickLogIn = By.xpath("//a[contains(text(),'Log in')]");
    public void setElectronics() {
        mouseHoverToElement(electronics);
    }
    public void setCellPhone() {
        mouseHoverToElementAndClick(cellPhone);
    }
    public String setVerifyTextCellPhone() {
        return getTextFromElement(verifyTextCellPhone);
    }
    public void setClickOnListViewTab() {
        clickOnElement(clickOnListViewTab);
    }
    public void setClickONNokiaLumia1020() {
        clickOnElement(clickONNokiaLumia1020);
    }
    public String setVerifyTextNokiaLumia1020() {
        return getTextFromElement(verifyTextNokiaLumia1020);
    }
    public String setVerifyThePrice() {
        return getTextFromElement(verifyThePrice);
    }
    public void setChangedTheQty() {
        clickOnElement(changedTheQty);
        driver.findElement(changedTheQty).clear();
        sendTextToElement(changedTheQty, "2");
    }
    public void setAddToCartBtn() {
        clickOnElement(addToCartBtn);
    }
    public String setVerifyTheMessageTheProductHasBeenAddedToYourCart() {
        return getTextFromElement(verifyTheMessageTheProductHasBeenAddedToYourCart);
    }
    public void setClickOnCross() {
        clickOnElement(clickOnCross);
    }
    public void setMouseHoverOnShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void setEnterGoToCart() {
        clickOnElement(enterGoToCart);
    }
    public String setVerifyMessageShoppingCart(){
        return getTextFromElement(verifyMessageShoppingCart);
    }
    public String setVerifyQty2(){
        return getTextFromElement(verifyQty2);
    }
    public String setVerifyTheTotal(){
        return getTextFromElement(verifyTheTotal);
    }
    public void setClickTheCheckBoxOfTermsAndCondition(){
        clickOnElement(clickTheCheckBoxOfTermsAndCondition);
    }
    public void setClickOnCheckout(){
        clickOnElement(clickOnCheckout);
    }
    public String setVerifyTheTextWelcomePleaseSignIN(){
        return getTextFromElement(verifyTheTextWelcomePleaseSignIN);
    }
    public void setSelectRegister(){
        clickOnElement(selectRegister);
    }
    public String setVerifyTheTextRegister(){
        return getTextFromElement(verifyTheTextRegister);
    }
    public  void setClickOnGender(){
        clickOnElement(clickOnGender);
    }
    public void setEnterFirstName(){
        sendTextToElement(enterFirstName,"khilen");
    }
    public void setEnterLastName(){
        sendTextToElement(enterLastName,"Modi");
    }
    public void setEnterEmailAddress(){
        sendTextToElement(enterEmailAddress,"khilenModi1410@yahoo.com");
    }
    public void setEnterPassword(){
        sendTextToElement(enterPassword, "Khilen4563");
    }
    public void setEnterConfirmPassword(){
        sendTextToElement(enterConfirmPassword, "Khilen4563");
    }
    public void setClickOnRegister(){
        clickOnElement(clickOnRegister);
    }
    public String setVerifyTextRegistrationCompleted(){
        return getTextFromElement(verifyTextRegistrationCompleted);
    }
    public void setClickOnContinue(){
        clickOnElement(clickOnContinue);
    }
    public String setVerifyTheTextShoppingCart(){
        return getTextFromElement(verifyTheTextShoppingCart);
    }
    public void setClickOnTermsAndCondition(){
        clickOnElement(clickOnTermsAndCondition);
    }
    public void setPressCheckout(){
        clickOnElement(pressCheckout);
    }
    public void setFirstName(){
        driver.findElement(firstName).sendKeys("khilen");
    }
    public void setSecondName(){
        driver.findElement(secondName).sendKeys("Modi");
    }
    public void setEmailAddress(){
        driver.findElement(emailAddress).clear();
        driver.findElement(emailAddress).sendKeys("khilenModi144@yahoo.com");
    }
    public void setCountry(){
        selectByValueFromDropDown(country,"233");
    }
    public  void setCity(){
        driver.findElement(city).sendKeys("Hertfordshire");
    }
    public void setAddress1(){
        driver.findElement(address1).sendKeys("20, Tudor avenue");
    }
    public void setPostCode(){
        driver.findElement(postCode).sendKeys("WD6 5BA");
    }
    public void setPhoneNumber(){
        sendTextToElement(phoneNumber,"07315672406");
    }
    public void setSelectContinue(){
        clickOnElement(selectContinue);
    }
    public void setSelect2ndDayAir(){
        clickOnElement(select2ndDayAir);
    }
    public void enterClickCon(){
        clickOnElement(selectCon);
    }
    public void setClickCreditCard(){
        clickOnElement(clickCreditCard);
    }
    public void setClickCon(){
        clickOnElement(clickCon);
    }
    public void setSelectCreditCard(){
        selectByVisibleTextFromDropDown(selectCreditCard,"Master card");
    }
    public void setCardHolderName(){
        sendTextToElement(cardHolderName,"khilen");
    }
    public void setCardNumber(){
        sendTextToElement(cardNumber,"5354568052254288");
    }
    public void setExpirationMonth(){
        selectByValueFromDropDown(expirationMonth,"5");
    }
    public void setExpirationYear(){
        selectByValueFromDropDown(expirationYear,"2026");
    }
    public void setCardCode(){
        sendTextToElement(cardCode,"543");
    }
    public void setCardContinueButton(){
        clickOnElement(cardContinueButton);
    }
    public String setVerifyCreditCard(){
        return getTextFromElement(verifyCreditCard);
    }
    public String setVerify2ndDayAirText(){
        return getTextFromElement(verify2ndDayAirText);
    }
    public String setVerifyingProductSubTotal(){
        return getTextFromElement(verifyProductSubTotal);
    }
    public void setClickingConfirm(){
        clickOnElement(clickingConfirm);
    }
    public String setVerifyTextThankYou(){
        return getTextFromElement(verifyTextThankYou);
    }
    public String setVeryTextOrderSuccessfully(){
        return  getTextFromElement(veryTextOrderSuccessfully);
    }
    public void setContinueClick(){
        clickOnElement(continueClick);
    }
    public void setEnterEmailId(){
        sendTextToElement(enterEmailId,"khilenModi144@yahoo.com");
    }
    public void setEnterPass(){
        sendTextToElement(enterPass,"Khilen4563");
    }
    public void setLogIn(){
        clickOnElement(logIn);
    }
    public void setClickLogIn(){
        clickOnElement(clickLogIn);
    }



}
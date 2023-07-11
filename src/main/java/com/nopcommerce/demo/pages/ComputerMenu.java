package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerMenu extends Utility {
    By computerMenu1 = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    By sortByNameZToA = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By sortByNameAtoZ = By.xpath("//select[@id='products-orderby']");
    By addTOCartButton = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");
    By buildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectGHzIntelPentiumDualCoreE2200 = By.id("product_attribute_1");
    By select8GBRAM = By.id("product_attribute_2");
    By selectHDD400GB = By.xpath("//input[@id='product_attribute_3_7']");
    By selectVistaPremium = By.id("product_attribute_4_9");
    By checkBoxOfMicroSoftOffice = By.id("product_attribute_5_10");
    By checkBoxOfTotalCommander = By.id("product_attribute_5_12");
    By clickOnAddToCartButton = By.id("add-to-cart-button-1");
    By selectPriceValue1475 = By.xpath("//span[@id='price-value-1']");
    By verifyTheMessageTheProductHasBeenAddedToYourCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By clickOnCross = By.xpath("//span[@title='Close']");
    By  mouseHoverOnShoppingCart = By.xpath("//span[@class='cart-label']");
    By enterGoToCart = By.xpath("//button[normalize-space()='Go to cart']");
    By verifyMessageShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");
    By changeQty =  By.xpath("//input[@class='qty-input']");
    By updateCart = By.xpath("//button[@id='updatecart']");
    By verifyTotal$2950 = By.xpath("//span[@class='product-subtotal']");
    By clickOnTermsAndCondition = By.id("termsofservice");
    By pressCheckout = By.id("checkout");
     By verifyTheWelcomePleaseSignInText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
     By checkOutAsGuest  = By.xpath("//button[contains(text(),'Checkout as Guest')]");
     By firstName = By.id("BillingNewAddress_FirstName");
     By secondName = By.id("BillingNewAddress_LastName");
     By emailAddress = By.id("BillingNewAddress_Email");
     By country = By.id("BillingNewAddress_CountryId");
     By city = By.id("BillingNewAddress_City");
     By address1 = By.id("BillingNewAddress_Address1");
     By postCode = By.id("BillingNewAddress_ZipPostalCode");
     By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
     By selectContinue = By.xpath("//button[@onclick='Billing.save()']");
     By NextDayAir = By.id("shippingoption_1");
     By clickContinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
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
     By verifyNextDayAir = By.xpath("//span[normalize-space()='Next Day Air']");
     By verifyTotal = By.xpath("//span[@class='product-subtotal']");
     By clickConfirm = By.xpath("//button[normalize-space()='Confirm']");
     By verifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
     By veryTextOrderSuccessfully = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
     By continueClick = By.xpath("//button[normalize-space()='Continue']");
     By verifyWelcome = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public void clickOnComputerMenu1() {
        clickOnElement(computerMenu1);
    }
    public void clickOnDesktopMenu() {
        clickOnElement(desktop);
    }
    public void setSortByNameZToA() {
        clickOnElement(sortByNameZToA);
    }
    public String getMessage() {
        return getTextFromElement(sortByNameZToA);
    }
    public void setSortByNameAtoZ() {
        selectByValueFromDropDown(sortByNameAtoZ, "5");
    }
    public void setAddTOCartButton() {
        clickOnElement(addTOCartButton);
    }
    public String getBuildYourOwnComputerText() {
        return getTextFromElement(buildYourOwnComputerText);
    }
    public void setSelectGHzIntelPentiumDualCoreE2200() {
        selectByValueFromDropDown(selectGHzIntelPentiumDualCoreE2200, "1");
    }
    public void setSelect8GBRAM() {
        selectByValueFromDropDown(select8GBRAM, "5");
    }
    public void setSelectHDD400GB() {
        clickOnElement(selectHDD400GB);
    }
    public void setSelectVistaPremium() {
        clickOnElement(selectVistaPremium);
    }
    public void setCheckBoxOfMicroSoftOffice() {
        clickOnElement(checkBoxOfMicroSoftOffice);
    }
    public void setCheckBoxOfTotalCommander() {
        clickOnElement(checkBoxOfTotalCommander);
    }
    public void setClickOnAddToCartButton() {
        clickOnElement(clickOnAddToCartButton);
    }
    public String setSelectPriceValue1475() {
        return getTextFromElement(selectPriceValue1475);
    }
    public String setVerifyTheMessageTheProductHasBeenAddedToYourCart() {
    return getTextFromElement(verifyTheMessageTheProductHasBeenAddedToYourCart);
    }
    public void setClickOnCross(){
        clickOnElement(clickOnCross);
    }
    public void setMouseHoverOnShoppingCart(){
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void setEnterGoToCart(){
        clickOnElement(enterGoToCart);
    }
    public String setVerifyMessageShoppingCart (){
        return getTextFromElement(verifyMessageShoppingCart);
    }
    public void setChangeQty(){
        clickOnElement(changeQty);
        driver.findElement(changeQty).clear();
        sendTextToElement(changeQty,"2");
    }
    public void setUpdateCart(){
        clickOnElement(updateCart);
    }
    public String setVerifyTotal$2950(){
        return getTextFromElement(verifyTotal$2950);
    }
    public void setClickOnTermsAndCondition(){
        clickOnElement(clickOnTermsAndCondition);
    }
    public void setPressCheckout(){
        clickOnElement(pressCheckout);
    }
    public String setVerifyTheWelcomePleaseSignInText(){
        return getTextFromElement(verifyTheWelcomePleaseSignInText);
    }
    public void setCheckOutAsGuest(){
        clickOnElement(checkOutAsGuest);
    }
    public void setFirstName(){
        driver.findElement(firstName).sendKeys("khilen");
    }
    public void setSecondName(){
        driver.findElement(secondName).sendKeys("Modi");
    }
    public void setEmailAddress(){
        driver.findElement(emailAddress).sendKeys("khilenmodi178@yahoo.com");
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
    public void setNextDayAir(){
         clickOnElement(NextDayAir);
    }
    public void setClickContinue(){
         clickOnElement(clickContinue);
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
    public String setVerifyNextDayAir(){
        return getTextFromElement(verifyNextDayAir);
    }
    public String setVerifyTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void setClickConfirm(){
        clickOnElement(clickConfirm);
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
    public String setVerifyWelcome(){
        return getTextFromElement(verifyWelcome);
    }
}
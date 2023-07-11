package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {

    Electronics electronics = new Electronics();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){

        electronics.setElectronics();
        electronics.setCellPhone();
        String actualMessage = electronics.setVerifyTextCellPhone();
        String expectedMessage = "Electronics";
        Assert.assertEquals(actualMessage,expectedMessage,"Electronic message not displayed");
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{
        electronics.setElectronics();
        electronics.setCellPhone();
        String actualMessage = electronics.setVerifyTextCellPhone();
        String expectedMessage = "Cell phones";
        Assert.assertEquals(actualMessage,expectedMessage,"Cell phones message not displayed");
        electronics.setClickOnListViewTab();
        Thread.sleep(3000);
        electronics.setClickONNokiaLumia1020();
        String actualText = electronics.setVerifyTextNokiaLumia1020();
        String expectedText = "Nokia Lumia 1020";
        Assert.assertEquals(actualText,expectedText,"Nokia Lumia 1020 is not Displayed");
        String actualText1 = electronics.setVerifyThePrice();
        String expectedText1 = "$349.00";
        Assert.assertEquals(actualText1,expectedText1,"$349.00 is not Displayed");
        electronics.setChangedTheQty();
        electronics.setAddToCartBtn();
        String actualMessage2 = electronics.setVerifyTheMessageTheProductHasBeenAddedToYourCart();
        String expectedMessage2 = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage2,expectedMessage2,"The product has been added to your shopping cart");
        electronics.setClickOnCross();
        electronics.setMouseHoverOnShoppingCart();
        electronics.setEnterGoToCart();
        String actualTextMessage = electronics.setVerifyMessageShoppingCart();
        String expectedTextMessage = "Shopping cart";
        Assert.assertEquals(actualTextMessage,expectedTextMessage,"Shopping cart message not matched");
        String actualTextMessage1 = electronics.setVerifyQty2();
        String expectedTextMessage1 = "";
        Assert.assertEquals(actualTextMessage1,expectedTextMessage1,"Shopping cart message not matched");
        String actualTextMessage2 = electronics.setVerifyTheTotal();
        String expectedTextMessage2 = "$698.00";
        Assert.assertEquals(actualTextMessage2,expectedTextMessage2,"Shopping cart message not matched");
        electronics.setClickTheCheckBoxOfTermsAndCondition();
        electronics.setClickOnCheckout();
        String actualTextMessage3 = electronics.setVerifyTheTextWelcomePleaseSignIN();
        String expectedTextMessage3 = "Welcome, Please Sign In!";
        Assert.assertEquals(actualTextMessage3,expectedTextMessage3,"Welcome, please sign in! message not matched");
        electronics.setSelectRegister();
        String actualTextMessage4 = electronics.setVerifyTheTextRegister();
        String expectedTextMessage4 = "Register";
        Assert.assertEquals(actualTextMessage4,expectedTextMessage4,"Register message not matched");
        electronics.setClickOnGender();
        electronics.setEnterFirstName();
        electronics.setEnterLastName();
        electronics.setEnterEmailAddress();
        electronics.setEnterPassword();
        electronics.setEnterConfirmPassword();
        electronics.setClickOnRegister();
        String actualTextMessage5 = electronics.setVerifyTextRegistrationCompleted();
        String expectedTextMessage5 = "Your registration completed";
        Assert.assertEquals(actualTextMessage5,expectedTextMessage5,"Your registration completed message not matched");
        electronics.setClickOnContinue();
        String actualTextMessage6 = electronics.setVerifyTheTextShoppingCart();
        String expectedTextMessage6 = "Shopping cart";
        Assert.assertEquals(actualTextMessage6,expectedTextMessage6,"Shopping cart message not Displayed");
        electronics.setClickLogIn();
        electronics.setEnterEmailId();
        electronics.setEnterPass();
        electronics.setLogIn();
        electronics.setClickOnTermsAndCondition();
        electronics.setPressCheckout();
        electronics.setFirstName();
        electronics.setSecondName();
        electronics.setEmailAddress();
        electronics.setCountry();
        electronics.setCity();
        electronics.setAddress1();
        electronics.setPostCode();
        electronics.setPhoneNumber();
        electronics.setSelectContinue();
        Thread.sleep(3000);
        electronics.setSelect2ndDayAir();
        electronics.enterClickCon();
        electronics.setClickCreditCard();
        electronics.setClickCon();
        electronics.setSelectCreditCard();
        electronics.setCardHolderName();
        electronics.setCardNumber();
        electronics.setExpirationMonth();
        electronics.setExpirationYear();
        electronics.setCardCode();
        electronics.setCardContinueButton();
        String actualMessage3 = electronics.setVerifyCreditCard();
        String expectedMessage3 = "Credit Card";
        Assert.assertEquals(actualMessage3,expectedMessage3, "credit card message not displayed");
        String actualText2 = electronics.setVerify2ndDayAirText();
        String ExpectedText2 = "“2nd Day Air”";
        Assert.assertEquals(actualText2,ExpectedText2,"2nd day air message not displayed");
        String actualText3 = electronics.setVerifyingProductSubTotal();
        String expectedText3 = "$698.00";
        Assert.assertEquals(actualText3,expectedText3,"$698.00");
        electronics.setClickingConfirm();
        String actualMess = electronics.setVerifyTextThankYou();
        String expectedMess = "Thank you";
        Assert.assertEquals(actualMess,expectedMess,"Thank you message not displayed");
        String actText = electronics.setVeryTextOrderSuccessfully();
        String expText = "Your order has been successfully processed!";
        Assert.assertEquals(actText,expText,"Your order has not been successfully processed!");
        electronics.setContinueClick();
    }

}

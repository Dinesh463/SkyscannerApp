package com.skyscanner.pageobject;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.skyscanner.constants.Constant;
import com.skyscanner.util.HookBase;

public class LoginPage extends HookBase {

	@FindBy(xpath="//*[@text='Register or Log In']")
	WebElement loginRegisterText;

	@FindBy(xpath="//*[@text='Already have an account? Log in']")
	WebElement accountLoginText;
	
	@FindBy(id="com.google.android.gms:id/credentials_hint_picker_title")
	WebElement pickerText;
	
	@FindBy(id="com.google.android.gms:id/cancel")
	WebElement cancelButton;

	@FindBy(xpath="//*[@text='Log in']")
	WebElement loginText;
	
	@FindBy(id="net.skyscanner.android.main:id/userEditText")
	WebElement userName;

	@FindBy(id="net.skyscanner.android.main:id/passwordEditText")
	WebElement userPassword;
	
	@FindBy(id="net.skyscanner.android.main:id/nativeLoginButton")
	WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isLoginTexttDisplayed() {
		return loginRegisterText.isDisplayed();
	}

	public String login(String username, String password) {
		userName.sendKeys(StringUtils.trimToEmpty(username));
		userPassword.sendKeys(StringUtils.trimToEmpty(password));
		loginButton.click();
		return Constant.SUCCESS;
	}
	
	public boolean isClickLoginShown() {
		accountLoginText.click();
		clickCancelAutoSignIn();
		return loginText.isDisplayed();
	}
	
	private void clickCancelAutoSignIn() {
		if (pickerText.isDisplayed()) {
			cancelButton.click();
		}
	}
}



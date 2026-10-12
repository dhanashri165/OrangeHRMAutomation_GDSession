package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.Base;
import Pages.DashboardPage;
import Pages.LoginPage;
import utils.RetryAnalyzer;

public class TestOrangeHrmlogin extends Base {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyOrangeHRMLogin() {

		LoginPage loginPage = new LoginPage(driver);

		DashboardPage dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

		Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard is not displayed after login");
	}
	public void clickLoginButton() {
		By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
		driver.findElement(loginButton).click();
	}

}
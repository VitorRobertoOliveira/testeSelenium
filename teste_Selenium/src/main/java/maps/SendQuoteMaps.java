package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class SendQuoteMaps extends BasePage {
	public SendQuoteMaps(WebDriver driver) {
		super(driver);
	}

	public WebElement inputEmail() {
		WebElement element = driver.findElement(By.id("email"));
		return element;
	}

	public WebElement inputPhone() {
		WebElement element = driver.findElement(By.id("phone"));
		return element;
	}

	public WebElement inputUsername() {
		WebElement element = driver.findElement(By.id("username"));
		return element;
	}

	public WebElement inputPassword() {
		WebElement element = driver.findElement(By.id("password"));
		return element;
	}

	public WebElement inputConfirmPassword() {
		WebElement element = driver.findElement(By.id("confirmpassword"));
		return element;
	}

	public WebElement inputComments() {
		WebElement element = driver.findElement(By.id("Comments"));
		return element;
	}

	public WebElement ButtonSendEmail() {
		WebElement element = driver.findElement(By.id("sendemail"));
		return element;
	}

	public WebElement counterFormSendQuote() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"sendquote\"]/span"));
		return element;
	}

	public WebElement validateSendingEmailSuccess() {
		WebElement element = driver.findElement(By.xpath("//div['sweet-alert showSweetAlert visible']//h2"));
		return element;
	}

	public WebElement cofirmSendingEmailSuccess() {
		WebElement element = driver
				.findElement(By.xpath("//div['sweet-alert showSweetAlert visible']//button[@class='confirm']"));
		return element;
	}
}

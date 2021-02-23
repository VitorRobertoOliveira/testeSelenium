package maps;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class InsurantDataMaps extends BasePage {
	public InsurantDataMaps(WebDriver driver) {
		super(driver);
	}

	public WebElement setFirstName() {
		WebElement element = driver.findElement(By.id("firstname"));
		return element;
	}

	public WebElement setLastName() {
		WebElement element = driver.findElement(By.id("lastname"));
		return element;
	}

	public WebElement setOpenDateCalendar() {
		WebElement element = driver.findElement(By.id("opendateofbirthcalender"));
		return element;
	}

	public WebElement setChooseDate() {
		WebElement element = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		return element;
	}

	public WebElement setPrevDate() {
		WebElement element = driver.findElement(By.xpath("//a[@data-handler='prev']"));
		return element;
	}

	public WebElement setDateDefault() {
		WebElement element = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		return element;
	}

	public WebElement setGenderMale() {
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
		return element;
	}

	public WebElement setGenderFemale() {
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
		return element;
	}

	public WebElement setStreetAddress() {
		WebElement element = driver.findElement(By.id("streetaddress"));
		return element;
	}

	public WebElement setCountry() {
		WebElement element = driver.findElement(By.id("country"));
		return element;
	}

	public WebElement setZipCode() {
		WebElement element = driver.findElement(By.id("zipcode"));
		return element;
	}

	public WebElement setCity() {
		WebElement element = driver.findElement(By.id("city"));
		return element;
	}

	public WebElement setOccupation() {
		WebElement element = driver.findElement(By.id("occupation"));
		return element;
	}

	public WebElement setHobbie(String value) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Speeding", 1);
		map.put("Bungee Jumping", 2);
		map.put("Cliff Diving", 3);
		map.put("Skydiving", 4);
		map.put("Other", 5);
		WebElement element = driver.findElement(By.xpath("(//span[@class='ideal-check'])[" + map.get(value) + "]"));
		return element;
	}

	public WebElement setWebsite() {
		WebElement element = driver.findElement(By.id("website"));
		return element;
	}

	public WebElement setImage() {
		WebElement element = driver.findElement(By.id("picture"));
		return element;
	}

	public WebElement setImageUpload() {
		WebElement element = driver.findElement(By.id("open"));
		return element;
	}

	public WebElement nextButton2() {
		WebElement element = driver.findElement(By.id("nextenterproductdata"));
		return element;
	}

	public WebElement counterFormInsurantData() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"enterinsurantdata\"]/span"));
		return element;
	}

}

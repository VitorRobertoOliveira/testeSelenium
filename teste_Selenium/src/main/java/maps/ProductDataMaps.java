package maps;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class ProductDataMaps extends BasePage {
	public ProductDataMaps(WebDriver driver) {
		super(driver);
	}

	public WebElement setButtonOpenDateCalendar() {
		WebElement element = driver.findElement(By.id("openstartdatecalender"));
		return element;
	}

	public WebElement setChooseDate() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]"));
		return element;
	}

	public WebElement setChooseNextDate() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		return element;
	}

	public WebElement setDateDefault() {
		WebElement element = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		return element;
	}

	public WebElement setInsuranceSum() {
		WebElement element = driver.findElement(By.id("insurancesum"));
		return element;
	}

	public WebElement setMeritRating() {
		WebElement element = driver.findElement(By.id("meritrating"));
		return element;
	}

	public WebElement setDamageInsurance() {
		WebElement element = driver.findElement(By.id("damageinsurance"));
		return element;
	}

	public WebElement setOptionalProducts(String value) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Euro Protection", 1);
		map.put("Legal Defense Insurance", 2);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[" + map.get(value) + "]/span"));
		return element;
	}

	public WebElement setCourtesyCar() {
		WebElement element = driver.findElement(By.id("courtesycar"));
		return element;
	}

	public WebElement setButtonNext() {
		WebElement element = driver.findElement(By.id("nextselectpriceoption"));
		return element;
	}

	public WebElement counterFormProductData() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"enterproductdata\"]/span"));
		return element;
	}
}

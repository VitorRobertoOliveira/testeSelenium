package maps;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class PriceOptionMaps extends BasePage {
	public PriceOptionMaps(WebDriver driver) {
		super(driver);
	}

	public WebElement radioButtonPriceOption(String value) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Silver", 1);
		map.put("Gold", 2);
		map.put("Platinum", 3);
		map.put("Ultimate", 4);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[" + map.get(value) + "]/span"));
		return element;
	}

	public WebElement counterFormPriceOption() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"selectpriceoption\"]/span"));
		return element;
	}

	public WebElement nextButtonPriceOption() {
		WebElement element = driver.findElement(By.id("nextsendquote"));
		return element;
	}
}

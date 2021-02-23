package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class VehicleDataMaps extends BasePage {
	public VehicleDataMaps(WebDriver driver) {
		super(driver);
	}

	public WebElement selectComboBoxMake() {
		WebElement element = driver.findElement(By.id("make"));
		return element;
	}

	public WebElement setModel() {
		WebElement element = driver.findElement(By.id("model"));
		return element;
	}

	public WebElement setCylinderCapacity() {
		WebElement element = driver.findElement(By.id("cylindercapacity"));
		return element;
	}

	public WebElement setEnginePerformance() {
		WebElement element = driver.findElement(By.id("engineperformance"));
		return element;
	}

	public WebElement setDateOfManufacture() {
		WebElement element = driver.findElement(By.id("dateofmanufacture"));
		return element;
	}

	public WebElement setNumberOfSeats() {
		WebElement element = driver.findElement(By.id("numberofseats"));
		return element;
	}

	public WebElement setRightHandDriveYes() {
		WebElement element = driver.findElement(By.className("ideal-radio"));
		return element;
	}

	public WebElement setRightHandDriveNo() {
		WebElement element = driver
				.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span"));
		return element;
	}

	public WebElement setNumberOfSeats1() {
		WebElement element = driver.findElement(By.id("numberofseatsmotorcycle"));
		return element;
	}

	public WebElement setFuelType() {
		WebElement element = driver.findElement(By.id("fuel"));
		return element;
	}

	public WebElement setPayLoad() {
		WebElement element = driver.findElement(By.id("payload"));
		return element;
	}

	public WebElement setTotalWeight() {
		WebElement element = driver.findElement(By.id("totalweight"));
		return element;
	}

	public WebElement setListPrice() {
		WebElement element = driver.findElement(By.id("listprice"));
		return element;
	}

	public WebElement setLicensePlateNumber() {
		WebElement element = driver.findElement(By.id("licenseplatenumber"));
		return element;
	}

	public WebElement setAnnualMileage() {
		WebElement element = driver.findElement(By.id("annualmileage"));
		return element;
	}

	public WebElement nextButton1() {
		WebElement element = driver.findElement(By.id("nextenterinsurantdata"));
		return element;
	}

	public WebElement counterFormVehicleData() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"entervehicledata\"]/span"));
		return element;
	}
}

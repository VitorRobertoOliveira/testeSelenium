package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import maps.VehicleDataMaps;

public class VehicleDataPage extends BasePage {
	private VehicleDataMaps vehicleDataMaps;

	public VehicleDataPage(WebDriver driver) {
		super(driver);
		vehicleDataMaps = new VehicleDataMaps(driver);
	}

	public void enterVehicleData(String value) throws Exception {
		selectComboBox(vehicleDataMaps.selectComboBoxMake(), value);
	}

	public void enterModel(String value) throws Exception {
		selectComboBox(vehicleDataMaps.setModel(), value);
	}

	public void enterCylinderCapacity(String value) throws Exception {
		fillsField(vehicleDataMaps.setCylinderCapacity(), value);
	}

	public void enterEnginePerformance(String value) throws Exception {
		fillsField(vehicleDataMaps.setEnginePerformance(), value);
	}

	public void enterDateOfManufacture(String data) throws Exception {
		fillsField(vehicleDataMaps.setDateOfManufacture(), data);
	}

	public void enterNumberOfSeats(String value) throws Exception {
		selectComboBox(vehicleDataMaps.setNumberOfSeats(), value);
	}

	public void selectRadioButton(String value) throws Exception {
		if (value == "yes") {
			vehicleDataMaps.setRightHandDriveYes().click();
		} else {
			vehicleDataMaps.setRightHandDriveNo().click();
		}
		printFillRadioButton(value);
	}

	public void enterNumberOfSeats1(String value) throws Exception {
		selectComboBox(vehicleDataMaps.setNumberOfSeats1(), value);
	}

	public void enterFuelType(String value) throws Exception {
		selectComboBox(vehicleDataMaps.setFuelType(), value);
	}

	public void enterPayLoad(String value) throws Exception {
		fillsField(vehicleDataMaps.setPayLoad(), value);
	}

	public void enterTotalWeight(String value) throws Exception {
		fillsField(vehicleDataMaps.setTotalWeight(), value);
	}

	public void enterListPrice(String value) throws Exception {
		fillsField(vehicleDataMaps.setListPrice(), value);
	}

	public void enterLicensePlateNumber(String value) throws Exception {
		fillsField(vehicleDataMaps.setLicensePlateNumber(), value);
	}

	public void enterAnnualMileage(String value) throws Exception {
		fillsField(vehicleDataMaps.setAnnualMileage(), value);
	}

	public void clickNextButtonVehicleData() throws Exception {
		click(vehicleDataMaps.nextButton1());
	}

	public void assertValidationFormVehicleData() throws Exception {
		System.out.println("Validando o preenchimento completo do formulário Vehicle Data");
		boolean formComplete = false;
		if (vehicleDataMaps.counterFormVehicleData().getAttribute("class").equals("counter zero")) {
			formComplete = true;
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
			clickNextButtonVehicleData();
		} else {
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
		}
		Assert.assertTrue(formComplete);

	}

}

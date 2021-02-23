package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import maps.ProductDataMaps;

public class ProductDataPage extends BasePage {
	private ProductDataMaps productDataMaps;

	public ProductDataPage(WebDriver driver) {
		super(driver);
		productDataMaps = new ProductDataMaps(driver);
	}

	public void selectStartDate() throws Exception {
		click(productDataMaps.setButtonOpenDateCalendar());
		while (!productDataMaps.setChooseDate().getText().equals("2022")) {
			click(productDataMaps.setChooseNextDate());
		}
		click(productDataMaps.setDateDefault());
		printFill(productDataMaps.setDateDefault().getText());
	}
	
	public void enterInsuranceSum(String value) throws Exception {
		printFillComboBox(value);
		selectComboBox(productDataMaps.setInsuranceSum(), value);
	}
	
	public void enterMeritRating(String value) throws Exception {
		printFillComboBox(value);
		selectComboBox(productDataMaps.setMeritRating(), value);
	}
	
	public void enterDamageInsurance(String value) throws Exception {
		printFillComboBox(value);
		selectComboBox(productDataMaps.setDamageInsurance(), value);
	}
	
	public void selectOptionalProducts(String value) throws Exception {
		printFillCheckBox(value);
		click(productDataMaps.setOptionalProducts(value));
		printClick2(productDataMaps.setOptionalProducts(value));
	}
	
	public void enterCourtesyCar(String value) throws Exception {
		printFillComboBox(value);
		selectComboBox(productDataMaps.setCourtesyCar(), value);
	}
	
	public void clickNextButtonProductData() throws Exception {
		printClick(productDataMaps.setButtonNext().getText());
		click(productDataMaps.setButtonNext());
	}
	
	public void assertValidationFormProductData() throws Exception {
		System.out.println("Validando o preenchimento completo do formulário Vehicle Data");
		boolean formComplete = false;
		if (productDataMaps.counterFormProductData().getAttribute("class").equals("counter zero")) {
			formComplete = true;
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
			clickNextButtonProductData();
		} else {
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
		}
		Assert.assertTrue(formComplete);

	}
	
}

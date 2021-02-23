package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import maps.PriceOptionMaps;

public class PriceOptionPage extends BasePage {
	private PriceOptionMaps priceOptionMaps;

	public PriceOptionPage(WebDriver driver) {
		super(driver);
		priceOptionMaps = new PriceOptionMaps(driver);
	}

	public void selectPriceOptions(String value) throws Exception {
		click(priceOptionMaps.radioButtonPriceOption(value));
		printClick(value);
	}
	
	public void clickNextButtonPriceOptions() throws Exception {
		click(priceOptionMaps.nextButtonPriceOption());
	}
	
	public void assertValidationFormPriceOptions() throws Exception {
		System.out.println("Validando o preenchimento completo do formulário Insurant Data");
		boolean formComplete = false;
		if (priceOptionMaps.counterFormPriceOption().getAttribute("class").equals("counter zero")) {
			formComplete = true;
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
			clickNextButtonPriceOptions();
		} else {
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
		}
		Assert.assertTrue(formComplete);
	}
}

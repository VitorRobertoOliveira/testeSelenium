package steps;

import io.cucumber.java.pt.Quando;
import pages.PriceOptionPage;

public class PriceOptionForm {
	private PriceOptionPage priceOptionPage;	

	public PriceOptionForm() {
		priceOptionPage = new PriceOptionPage(BaseTest.driver);
	}

	@Quando("preencho o formulario Price Option")
	public void fillFormPriceOptionPage() throws Exception {	
		System.out.println("Selecionando o valor do produto!");
		priceOptionPage.selectPriceOptions("Ultimate");
		priceOptionPage.assertValidationFormPriceOptions();
	}
}


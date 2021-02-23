package steps;

import io.cucumber.java.pt.Quando;
import pages.ProductDataPage;

public class ProductDataForm {
	private ProductDataPage productDataPage;	

	public ProductDataForm() {
		productDataPage = new ProductDataPage(BaseTest.driver);
	}

	@Quando("preencho o formulario Product Data")
	public void fillFormProductDataPage() throws Exception {	
		System.out.println("Preenchendo Formulário com os dados do Produto!");
		productDataPage.selectStartDate();
		productDataPage.enterInsuranceSum("3.000.000,00");
		productDataPage.enterMeritRating("Bonus 1");
		productDataPage.enterDamageInsurance("No Coverage");
		productDataPage.selectOptionalProducts("Legal Defense Insurance");
		productDataPage.enterCourtesyCar("Yes");
		productDataPage.assertValidationFormProductData();
	}
}


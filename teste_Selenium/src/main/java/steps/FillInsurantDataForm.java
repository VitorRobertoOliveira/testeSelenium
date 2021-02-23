package steps;

import io.cucumber.java.pt.Quando;
import pages.InsurantDataPage;

public class FillInsurantDataForm {
	private InsurantDataPage insurantDataPage;	

	public FillInsurantDataForm() {
		insurantDataPage = new InsurantDataPage(BaseTest.driver);
	}

	@Quando("preencho o formulario Insurant Data")
	public void fillFormInsurantDataPage() throws Exception {	
		System.out.println("Preenchendo Formulário com os dados do Seguro!");
		insurantDataPage.enterFirstName("Teste");
		insurantDataPage.enterLastName("Testando");
		insurantDataPage.enterDateOfBirth();
		insurantDataPage.selectGender("male");
		insurantDataPage.enterStreetAddress("Avenida do Teste, 800");
		insurantDataPage.enterCountry("Brazil");
		insurantDataPage.enterZipCode("38320000");
		insurantDataPage.enterCity("São Paulo");
		insurantDataPage.enterOccupation("Employee");
		insurantDataPage.enterHobbie("Skydiving");
		insurantDataPage.enterWebsite("www.google.com.br");
		insurantDataPage.enterPicture();
		insurantDataPage.assertValidationFormInsurantData();
	}
}


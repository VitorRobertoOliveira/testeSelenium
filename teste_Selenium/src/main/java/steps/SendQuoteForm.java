package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.SendQuotePage;

public class SendQuoteForm {
	private SendQuotePage sendQuotePage;	

	public SendQuoteForm() {
		sendQuotePage = new SendQuotePage(BaseTest.driver);
	}

	@Quando("preencho o formulario Send Quote")
	public void fillFormSendQuotePage() throws Exception {	
		System.out.println("Preenchendo Formulário com os dados de criação do usuário!");
		sendQuotePage.enterEmail("testetestandotestado@gmail.com");
		sendQuotePage.enterPhone("34998765558");
		sendQuotePage.enterUsernamer("teste_testando");
		sendQuotePage.enterPassword("Teste2908");
		sendQuotePage.enterConfirmPassword("Teste2908");
		sendQuotePage.enterComments("Teste" + "\n" + "Testando" + "\n" + "Testado");	
	}
	
	@Quando("submeto o formulario")
	public void submitFinalForm() throws Exception {
		sendQuotePage.assertValidationFormSendQuote();
		System.out.println("Teste Completo!" + "\n" + "Fehando o site!");
	}
	
	@Entao("deve-se ver a mensagem de sucesso {string}")
	public void finalValidation(String value) throws Exception {
		sendQuotePage.finalValidationForm(value);
		System.out.println("Teste Completo!" + "\n" + "Fehando o site!");
	}
}


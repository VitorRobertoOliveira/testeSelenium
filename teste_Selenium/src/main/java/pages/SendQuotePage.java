package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import maps.SendQuoteMaps;

public class SendQuotePage extends BasePage {
	private SendQuoteMaps sendQuoteMaps;

	public SendQuotePage(WebDriver driver) {
		super(driver);
		sendQuoteMaps = new SendQuoteMaps(driver);
	}

	public void enterEmail(String value) throws Exception {
		fillsField(sendQuoteMaps.inputEmail(), value);
	}

	public void enterPhone(String value) throws Exception {
		fillsField(sendQuoteMaps.inputPhone(), value);
	}

	public void enterUsernamer(String value) throws Exception {
		fillsField(sendQuoteMaps.inputUsername(), value);
	}

	public void enterPassword(String value) throws Exception {
		fillsField(sendQuoteMaps.inputPassword(), value);
	}

	public void enterConfirmPassword(String value) throws Exception {
		fillsField(sendQuoteMaps.inputConfirmPassword(), value);
	}

	public void enterComments(String value) throws Exception {
		fillsField(sendQuoteMaps.inputComments(), value);
	}

	public void clickNextButtonSendQuote() throws Exception {
		click(sendQuoteMaps.ButtonSendEmail());
	}
	
	public void clickConfirmInviteForm() throws Exception {
		click(sendQuoteMaps.cofirmSendingEmailSuccess());
	}

	public void assertValidationFormSendQuote() throws Exception {
		System.out.println("Validando o preenchimento completo do formulário Insurant Data");
		boolean formComplete = false;
		if (sendQuoteMaps.counterFormSendQuote().getAttribute("class").equals("counter zero")) {
			formComplete = true;
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
			clickNextButtonSendQuote();
		} else {
			System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
		}
		Assert.assertTrue(formComplete);
	}

	public void finalValidationForm() throws Exception {
		System.out.println("Validando o envio do formulário!");
		boolean formComplete = false;
		if (sendQuoteMaps.validateSendingEmailSuccess().getText().equals("Sending e-mail success!")) {
			formComplete = true;
			System.out.println("Formulário enviado com sucesso? =====> " + formComplete);
			clickConfirmInviteForm();
		} else {
			System.out.println("Formulário enviado com sucesso? =====> " + formComplete);
		}
		Assert.assertTrue(formComplete);
	}
}

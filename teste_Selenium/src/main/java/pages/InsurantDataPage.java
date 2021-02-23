package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import maps.InsurantDataMaps;

public class InsurantDataPage extends BasePage {
	private InsurantDataMaps insurantDataMaps;

	public InsurantDataPage(WebDriver driver) {
		super(driver);
		insurantDataMaps = new InsurantDataMaps(driver);
	}

	public void enterFirstName(String value) throws Exception {
		fillsField(insurantDataMaps.setFirstName(), value);
	}

	public void enterLastName(String value) throws Exception {
		fillsField(insurantDataMaps.setLastName(), value);
	}

	public void enterDateOfBirth() throws Exception {
		click(insurantDataMaps.setOpenDateCalendar());
		while (!insurantDataMaps.setChooseDate().getText().equals("1999")) {
			click(insurantDataMaps.setPrevDate());
		}
		click(insurantDataMaps.setDateDefault());
	}

	public void selectGender(String value) throws Exception {
		if (value == "male") {
			insurantDataMaps.setGenderMale().click();
		} else {
			insurantDataMaps.setGenderFemale().click();
		}
		printFillRadioButton(value);
	}

	public void enterStreetAddress(String value) throws Exception {
		fillsField(insurantDataMaps.setStreetAddress(), value);
	}

	public void enterCountry(String value) throws Exception {
		selectComboBox(insurantDataMaps.setCountry(), value);
	}

	public void enterZipCode(String value) throws Exception {
		fillsField(insurantDataMaps.setZipCode(), value);
	}

	public void enterCity(String value) throws Exception {
		fillsField(insurantDataMaps.setCity(), value);
	}

	public void enterOccupation(String value) throws Exception {
		selectComboBox(insurantDataMaps.setOccupation(), value);
	}

	public void enterHobbie(String value) throws Exception {
		click(insurantDataMaps.setHobbie(value));
	}

	public void enterWebsite(String value) throws Exception {
		fillsField(insurantDataMaps.setWebsite(), value);
	}

	public void enterPicture() throws Exception {
		String filePath = "file:///" + System.getProperty("user.dir") + "/src/main/java/images/audiImage.jpg";
		System.out.println("Faço upload da imagem: " + filePath);

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection(filePath);
		clipboard.setContents(str, null);

		click(insurantDataMaps.setImageUpload());
		implicitWait(2000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		implicitWait(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		implicitWait(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		implicitWait(5000);

	}

	public void validateUploadImage() throws Exception {
		System.out.println("Validando upload da imagem...!");
		boolean uploadImageComplete = false;
		try {
			if (insurantDataMaps.setImage().getAttribute("title").equals("audiImage.jpg")) {
				uploadImageComplete = true;
				System.out.println("Imagem anexada ao formulário com sucesso? ===> " + uploadImageComplete);
			} else {
				System.out.println("Imagem não foi anexada!");
			}
			Assert.assertTrue(uploadImageComplete);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickNextButtonInsurantData() throws Exception {
		validateUploadImage();
		click(insurantDataMaps.nextButton2());
	}

	public void assertValidationFormInsurantData() throws Exception {
		System.out.println("Validando o preenchimento completo do formulário Insurant Data");
		boolean formComplete = false;
		try {
			if (insurantDataMaps.counterFormInsurantData().getAttribute("class").equals("counter zero")) {
				formComplete = true;
				System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
				clickNextButtonInsurantData();
			} else {
				System.out.println("Formulário preenchido com sucesso? =====> " + formComplete);
			}
			Assert.assertTrue(formComplete);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

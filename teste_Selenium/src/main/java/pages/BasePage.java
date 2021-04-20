package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriverWait wait;
	public WebDriver driver;
	public Actions action;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, 60);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	}

	/**
	 * Metodo de acesso a url
	 * 
	 * @param url
	 */
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	/**
	 * Metodo de preenchimento dos inputs
	 * 
	 * @param campo
	 * @param value
	 */
	public void fillsField(WebElement campo, String value) {
		wait.until(ExpectedConditions.visibilityOf(campo));
		System.out.println("Hello World!");
		campo.clear();
		campo.sendKeys(value);
		printFill(value);
	}

	/**
	 * Metodo de click no WebElement
	 * 
	 * @param element
	 */
	public void click(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}

	/**
	 * Metodo de seleção do combo box
	 * 
	 * @param campo
	 * @param value
	 * @throws Exception
	 */
	public void selectComboBox(WebElement campo, String value) throws Exception {
		Select combo = new Select(campo);
		combo.selectByVisibleText(value);
		printFillComboBox(value);
	}

	/**
	 * Metodo de espera Implicita
	 * 
	 * @param tempoEmMilissegundos
	 * @throws InterruptedException
	 */
	public static void implicitWait(int tempoEmMilissegundos) throws InterruptedException {
		System.out.println("Espera Implicita de " + tempoEmMilissegundos + " Milisegundos");
		Thread.sleep(tempoEmMilissegundos);
	}

	/**
	 * Metodo de criação de log para input
	 * 
	 * @param value
	 */
	public static void printFill(String value) {
		System.out.println("Preencho o campo com valor [ " + value + " ]");
	}

	/**
	 * Metodo de criação de log para combo box
	 * 
	 * @param value
	 */
	public static void printFillComboBox(String value) {
		System.out.println("Seleciono no comboBox o valor [ " + value + " ]");
	}

	/**
	 * Metodo de criação de log para checkbox
	 * 
	 * @param value
	 */
	public static void printFillCheckBox(String value) {
		System.out.println("Seleciono a opção do CheckBox  [ " + value + " ] ");
	}

	/**
	 * Metodo de criação de log para ação de click
	 * 
	 * @param click
	 */
	public static void printClick(String click) {
		System.out.println("Clico em [ " + click + " ]");
	}

	/**
	 * Metodo de criação de log para ação de click printando WebElement
	 * 
	 * @param element
	 */
	public static void printClick2(WebElement element) {
		System.out.println("Clico em [ " + element + " ]");
	}

	/**
	 * Metodo de criação de log para radioButton
	 * 
	 * @param value
	 */
	public static void printFillRadioButton(String value) {
		System.out.println("Seleciono a opção [ " + value + " ]");
	}

}

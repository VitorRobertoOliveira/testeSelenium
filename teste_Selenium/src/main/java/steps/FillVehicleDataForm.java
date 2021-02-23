package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.VehicleDataPage;

public class FillVehicleDataForm {
	public VehicleDataPage vehicleDataPage;
	
	public FillVehicleDataForm() {
		vehicleDataPage = new VehicleDataPage(BaseTest.driver);
	}

	@Dado("que eu acesse a url {string}")
	public void accessUrl(String url) throws Exception {
		System.out.println("Acessando url: " + url);
		vehicleDataPage.navigateTo(url);
	}
	
	@Quando("preencho o formulario Vehicle Data")
	public void fillFormVehicleDataPage() throws Exception {		
		System.out.println("Preenchendo Formulário com os dados do Veículo!");
		vehicleDataPage.enterVehicleData("Audi");		
		vehicleDataPage.enterModel("Moped");
		vehicleDataPage.enterCylinderCapacity("1");
		vehicleDataPage.enterEnginePerformance("2");
		vehicleDataPage.enterDateOfManufacture("10/10/2020");
		vehicleDataPage.enterNumberOfSeats("9");
		vehicleDataPage.selectRadioButton("yes");
		vehicleDataPage.enterNumberOfSeats1("1");
		vehicleDataPage.enterFuelType("Diesel");
		vehicleDataPage.enterPayLoad("1000");
		vehicleDataPage.enterTotalWeight("800");
		vehicleDataPage.enterListPrice("5000");
		vehicleDataPage.enterLicensePlateNumber("KDQ4509");
		vehicleDataPage.enterAnnualMileage("5000");	
		vehicleDataPage.assertValidationFormVehicleData();;
	}
}


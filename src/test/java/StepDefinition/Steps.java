package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		System.out.println("En este paso abre el navegador google chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MacRemoto\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/Login/");
		// throw new cucumber.api.PendingException();
	}
	
	@When("Ingresa Nombre de Usuario {string} y Contraseña {string}")
	public void ingresa_Username_y_Password(String string, String string2) {
		
		System.out.println("En este paso ingresa las credenciales de usuario");
		System.out.println("Este paso ingresa el nombre de usuario y contraseña en la pagina de login");
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		
		// throw new cucumber.api.PendingException();
	}
	
	@Then("inicia session")
	public void inicia_session() {
		
		System.out.println("En este paso inicia session con los datos ingresados desde nuestro arcivo MyTest.feauture");
		driver.findElement(By.id("loginbtn")).click();
		// throw new cucumber.api.PendingException();
	}

}

// Generated by Selenium IDE
package org.ual.cnsa.jcg449;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CNSAJCG449Test {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
	    // Browser selector
	    int browser= 1; // 0: firefox, 1: chrome,...
	    Boolean headless = true;

	    switch (browser) {
	    case 0:  // firefox
	    	
	    	//System.setProperty("webdriver.gecko.driver",  "drivers/geckodriver.exe");
	    	FirefoxOptions firefoxOptions = new FirefoxOptions();
	    	if (headless) firefoxOptions.setHeadless(headless);
	    	driver = new FirefoxDriver(firefoxOptions);

	    	break;
	    case 1: // chrome
	   
	    	//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	    	ChromeOptions chromeOptions = new ChromeOptions();
	    	if (headless) chromeOptions.setHeadless(headless);
	    	chromeOptions.addArguments("window-size=1920,1080", "allowed-ips=0.0.0.0");
	    	driver = new ChromeDriver(chromeOptions);

	    	break;

	    default:
	    	fail("Please select a browser");
	    	break;
	    }
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }

	@After
	public void tearDown() {
		if (driver != null) {
		    driver.quit();
		}
	}

	@Test
	public void registro() {
		// Test name: Registro
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/ |
		driver.get("http://webapps.jcg449.tech.:8085");
		// 2 | setWindowSize | 1920x1044 |
		driver.manage().window().setSize(new Dimension(1920, 1044));
		// 3 | click | linkText=Sign up |
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | executeScript | return "ual-" +
		// Math.floor(Math.random()*1500000)+"@ual.es" | emailrandom
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
		// 5 | echo | ${emailrandom} |
		System.out.println(vars.get("emailrandom").toString());
		// 6 | click | id=full-name |
		driver.findElement(By.id("full-name")).click();
		// 7 | type | id=full-name | user random
		driver.findElement(By.id("full-name")).sendKeys("user random");
		// 8 | type | id=email-address | ${emailrandom}
		driver.findElement(By.id("email-address")).sendKeys(vars.get("emailrandom").toString());
		// 9 | type | id=password | jesus
		driver.findElement(By.id("password")).sendKeys("jesus");
		// 10 | type | id=confirm-password | jesus
		driver.findElement(By.id("confirm-password")).sendKeys("jesus");
		// 11 | click | id=terms-agreement |
		driver.findElement(By.id("terms-agreement")).click();
		// 12 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
		
		// 14 | click | id=header-account-menu-link |
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement accountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Account')]")));
		accountLink.click();
		// 15 | click | linkText=Sign out |
		driver.findElement(By.linkText("Sign out")).click();
		// 16 | click | css=.navbar-brand |
		driver.findElement(By.cssSelector(".navbar-brand")).click();
	}

	@Test
	public void cambiarpasscorrecto() {
		// Test name: Cambiar pass correcto
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/ |
		driver.get("http://webapps.jcg449.tech.:8085");
		// 2 | setWindowSize | 1440x774 |
		driver.manage().window().setSize(new Dimension(1440, 774));
		// 3 | click | linkText=Log in |
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control |
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control |
		// jcg449@inlumine.ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
				.sendKeys("jcg449@inlumine.ual.es");
		// 6 | type | css=.form-group:nth-child(2) > .form-control | Aa123!
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("Aa123!");
		// 7 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement accountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Account')]")));
		accountLink.click();
		// 11 | click | linkText=Settings |
		driver.findElement(By.linkText("Settings")).click();
		// 12 | click | linkText=Change password |
		driver.findElement(By.linkText("Change password")).click();
		// 13 | type | id=password | Aa123!
		driver.findElement(By.id("password")).sendKeys("Aa123!");
		// 14 | type | id=confirm-password | Aa123!
		driver.findElement(By.id("confirm-password")).sendKeys("Aa123!");
		// 15 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
		// 16 | assertText | css=h1 | My account
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("My account"));
	}

	@Test
	public void cambiarpassincorrecto() {
		// Test name: Cambiar pass incorrecto
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/ |
		driver.get("http://webapps.jcg449.tech.:8085");
		// 2 | setWindowSize | 1440x774 |
		driver.manage().window().setSize(new Dimension(1440, 774));
		// 3 | click | linkText=Log in |
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control |
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control |
		// jcg449@inlumine.ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
				.sendKeys("jcg449@inlumine.ual.es");
		// 6 | type | css=.form-group:nth-child(2) > .form-control | Aa123!
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("Aa123!");
		// 7 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		// 8 | click | id=header-account-menu-link |
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement accountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Account')]")));
		accountLink.click();
		// 11 | click | linkText=Settings |
		driver.findElement(By.linkText("Settings")).click();
		// 12 | click | linkText=Change password |
		driver.findElement(By.linkText("Change password")).click();
		// 13 | type | id=password | Aa123!
		driver.findElement(By.id("password")).sendKeys("Aa123!");
		// 14 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
		// 15 | assertText | css=.invalid-feedback | Your new password and confirmation
		// do not match.
		assertThat(driver.findElement(By.cssSelector(".invalid-feedback")).getText(),
				is("Your new password and confirmation do not match."));
	}

	@Test
	public void editarperfil() {
		// Test name: Editar perfil
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/ |
		driver.get("http://webapps.jcg449.tech.:8085");
		// 2 | setWindowSize | 1440x774 |
		driver.manage().window().setSize(new Dimension(1440, 774));
		// 3 | click | linkText=Log in |
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control |
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control |
		// jcg449@inlumine.ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
				.sendKeys("jcg449@inlumine.ual.es");
		// 6 | type | css=.form-group:nth-child(2) > .form-control | Aa123!
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("Aa123!");
		// 7 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		// 8 | click | id=header-account-menu-link |
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement accountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Account')]")));
		accountLink.click();
		// 11 | click | linkText=Settings |
		driver.findElement(By.linkText("Settings")).click();
		// 12 | click | linkText=Edit profile |
		driver.findElement(By.linkText("Edit profile")).click();
		// 13 | type | id=full-name | editado
		driver.findElement(By.id("full-name")).sendKeys("editado");
		// 14 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
	}

	@Test
	public void editarperfilincorrecto() {
		// Test name: Editar perfil incorrecto
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/ |
		driver.get("http://webapps.jcg449.tech.:8085");
		// 2 | setWindowSize | 1440x774 |
		driver.manage().window().setSize(new Dimension(1440, 774));
		// 3 | click | linkText=Log in |
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control |
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control |
		// jcg449@inlumine.ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
				.sendKeys("jcg449@inlumine.ual.es");
		// 6 | type | css=.form-group:nth-child(2) > .form-control | Aa123!
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("Aa123!");
		// 7 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		// 8 | click | id=header-account-menu-link |
		WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement accountLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Account')]")));
		accountLink.click();
		// 11 | click | linkText=Settings |
		driver.findElement(By.linkText("Settings")).click();
		// 12 | click | linkText=Edit profile |
		driver.findElement(By.linkText("Edit profile")).click();
		// 13 | sendKeys | id=full-name |
		// ${KEY_SHIFT}${KEY_HOME}${KEY_SHIFT}${KEY_DELETE}
		driver.findElement(By.id("full-name")).sendKeys(Keys.SHIFT, Keys.HOME, Keys.SHIFT, Keys.DELETE);
		// 14 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
	}

	@Test
	public void registroincorrectoinputemailvacio() {
		// Test name: Registro incorrecto (input email vacio)
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/ |
		driver.get("http://webapps.jcg449.tech.:8085");
		// 2 | setWindowSize | 1920x1044 |
		driver.manage().window().setSize(new Dimension(1920, 1044));
		// 3 | click | linkText=Sign up |
		driver.findElement(By.linkText("Sign up")).click();
		// 4 | click | id=full-name |
		driver.findElement(By.id("full-name")).click();
		// 5 | type | id=full-name | user random
		driver.findElement(By.id("full-name")).sendKeys("user random");
		// 6 | type | id=password | jesus
		driver.findElement(By.id("password")).sendKeys("jesus");
		// 7 | type | id=confirm-password | jesus
		driver.findElement(By.id("confirm-password")).sendKeys("jesus");
		// 8 | click | id=terms-agreement |
		driver.findElement(By.id("terms-agreement")).click();
		// 9 | click | css=.button-text |
		driver.findElement(By.cssSelector(".button-text")).click();
		// 10 | executeScript | return document.querySelector("#signup > div > div >
		// form > div:nth-child(2) > div").textContent | message
		vars.put("message", js.executeScript(
				"return document.querySelector(\"#signup > div > div > form > div:nth-child(2) > div\").textContent"));
		// 11 | echo | ${message} |
		System.out.println(vars.get("message").toString());
		// 12 | assert | message | Please enter a valid email address.
		assertEquals(vars.get("message").toString(), "Please enter a valid email address.");
	}

	@Test
	public void logincredencialesincorrectas() {
		// Test name: Login credenciales incorrectas
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/login |
		driver.get("http://webapps.jcg449.tech.:8085/login");
		// 2 | setWindowSize | 1440x774 |
		driver.manage().window().setSize(new Dimension(1440, 774));
		// 3 | click | linkText=Log in |
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control |
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control | prueba@gmail.com
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).sendKeys("prueba@gmail.com");
		// 6 | type | css=.form-group:nth-child(2) > .form-control | prueba
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("prueba");
		// 7 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
		// 8 | mouseOver | css=.ajax-button |
		{
			WebElement element = driver.findElement(By.cssSelector(".ajax-button"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		// 9 | mouseOut | css=.ajax-button |
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		// 10 | click | css=.ajax-form |
		driver.findElement(By.cssSelector(".ajax-form")).click();
		// 11 | assertText | css=.text-danger | The credentials you entered are not
		// associated with an account. Please check your email and/or password and try
		// again.
		assertThat(driver.findElement(By.cssSelector(".text-danger")).getText(), is(
				"The credentials you entered are not associated with an account. Please check your email and/or password and try again."));
	}

	@Test
	public void login() {
		// Test name: Login
		// Step # | name | target | value
		// 1 | open | http://localhost:1337/ |
		driver.get("http://webapps.jcg449.tech.:8085");
		// 2 | setWindowSize | 1440x774 |
		driver.manage().window().setSize(new Dimension(1440, 774));
		// 3 | click | linkText=Log in |
		driver.findElement(By.linkText("Log in")).click();
		// 4 | click | css=.form-group:nth-child(1) > .form-control |
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
		// 5 | type | css=.form-group:nth-child(1) > .form-control |
		// jcg449@inlumine.ual.es
		driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control"))
				.sendKeys("jcg449@inlumine.ual.es");
		// 6 | type | css=.form-group:nth-child(2) > .form-control | Aa123!
		driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("Aa123!");
		// 7 | click | css=.ajax-button |
		driver.findElement(By.cssSelector(".ajax-button")).click();
	}
}

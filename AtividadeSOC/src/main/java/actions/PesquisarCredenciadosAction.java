package actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import elements.PesquisarCredenciadosElement;
import utils.GlobalDriver;
import utils.Reports;

public class PesquisarCredenciadosAction {
	
	private final WebDriver webdriver = GlobalDriver.webdriver;
	PesquisarCredenciadosElement pesquisarCredenciadosElement;
	Reports reports;
	
	public void acessarFerramentas() throws Exception {
		reports = new Reports();
		pesquisarCredenciadosElement = new PesquisarCredenciadosElement(webdriver);
		reports.takeScreenShot("1.validandocredenciado");
	    pesquisarCredenciadosElement.clicarFerramentas.click();
	    reports.takeScreenShot("2.validandocredenciado");
	    pesquisarCredenciadosElement.clicarRedeSocnet.click();
	    reports.takeScreenShot("3.validandocredenciado");
	}

	public void buscarCredenciados() throws Exception {
		reports = new Reports();
		pesquisarCredenciadosElement = new PesquisarCredenciadosElement(webdriver);
	    pesquisarCredenciadosElement.clicarBuscarCredenciados.click();
	    reports.takeScreenShot("4.validandocredenciado");
	}
	
	public void validarCredenciado() throws Exception {
		reports = new Reports();
		pesquisarCredenciadosElement = new PesquisarCredenciadosElement(webdriver);
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		reports.takeScreenShot("5.validandocredenciado");
	    pesquisarCredenciadosElement.campoCEP.click();
	    pesquisarCredenciadosElement.campoCEP.sendKeys("09121-420");
	    pesquisarCredenciadosElement.campoCEP.sendKeys(Keys.ENTER);
	    Thread.sleep(10000);
	    reports.takeScreenShot("6.validandocredenciado");
	    pesquisarCredenciadosElement.clicarVisualizar.click();
	    webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    pesquisarCredenciadosElement.clicarSaibaMais.click();
	    reports.takeScreenShot("7.validandocredenciado");
	}	
}
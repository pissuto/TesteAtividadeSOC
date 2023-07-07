package actions;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import elements.PesquisarBlogElement;
import utils.GlobalDriver;
import utils.Reports;

public class PesquisarBlogAction {
	
	private final WebDriver webdriver = GlobalDriver.webdriver;
	PesquisarBlogElement pesquisarBlogElement;
	Reports reports;	
	
	
	public void acessarblog() throws Exception {
		reports = new Reports();
		pesquisarBlogElement = new PesquisarBlogElement(webdriver);
	    pesquisarBlogElement.acessarBlog.click();
	    reports.takeScreenShot("1.pesquisarblog");
	}

	public void preencherPesquisa(String _text) throws Exception {
		reports = new Reports();
		pesquisarBlogElement = new PesquisarBlogElement(webdriver);
	    pesquisarBlogElement.pesquisarBlog.sendKeys(_text);
	    reports.takeScreenShot("2.pesquisarblog");
	    pesquisarBlogElement.pesquisarBlog.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    reports.takeScreenShot("3.pesquisarblog");
	}
	
	public void validarMensagem(String mensagem) throws Exception {
		reports = new Reports();
		pesquisarBlogElement = new PesquisarBlogElement(webdriver);
	    String mensagemobtida = pesquisarBlogElement.mensagemBlog.getText();
	    Assert.assertTrue("Conteúdo da pesquisa não encontrado",
	    		mensagemobtida.contains(mensagem));
	    reports.takeScreenShot("4.pesquisarblog");
	}	
}
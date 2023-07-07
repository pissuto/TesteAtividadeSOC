package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import actions.PesquisarBlogAction;

public class PesquisarBlogElement extends PesquisarBlogAction {
	
	public PesquisarBlogElement(WebDriver webdriver) throws Exception{
        PageFactory.initElements(webdriver, this);
    }	
	
	@FindBy(xpath = "//input[@placeholder='Procurar']")
	public WebElement pesquisarBlog;
	
	@FindBy(xpath = "//i[@class='fas fa-search']")
	public WebElement acessarBlog;
	
	@FindBy(xpath = "//body")
	public WebElement mensagemBlog;
	
}

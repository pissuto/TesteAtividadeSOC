package steps;

import org.openqa.selenium.WebDriver;
import actions.PesquisarBlogAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import utils.GlobalDriver;

public class PesquisaBlog extends GlobalDriver {
	String url;
	PesquisarBlogAction pesquisarBlogAction;

	public PesquisaBlog(WebDriver webdriver) {
		GlobalDriver.webdriver = webdriver;
	}

	public PesquisaBlog() throws Exception {
		pesquisarBlogAction = new PesquisarBlogAction();
	}

	@Dado("que estou no site da soc")
	public void que_estou_no_site_da_soc() {
		url = "https://www.soc.com.br/";
		webdriver.navigate().to(url);
	}

	@Dado("que acesso a pagina de busca")
	public void que_acesso_a_pagina_de_busca() throws Exception {
		pesquisarBlogAction.acessarblog();
	}

	@Quando("pesquiso por {string}")
	public void pesquiso_por(String _text) throws Exception {
		pesquisarBlogAction.preencherPesquisa(_text);
	}

	@Entao("o sistema me retorna a mensagem {string}")
	public void o_sistema_me_retorna_a_mensagem(String mensagem) throws Exception {
		pesquisarBlogAction.validarMensagem(mensagem);
	}
}
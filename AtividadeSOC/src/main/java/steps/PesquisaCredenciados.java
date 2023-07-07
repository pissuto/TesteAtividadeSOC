package steps;

import org.openqa.selenium.WebDriver;

import actions.PesquisarCredenciadosAction;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import utils.GlobalDriver;
import utils.Reports;

public class PesquisaCredenciados extends GlobalDriver {
	String url;
	PesquisarCredenciadosAction pesquisarCredenciadosAction;
	
	public PesquisaCredenciados(WebDriver webdriver) {
		GlobalDriver.webdriver = webdriver;
	}

	public PesquisaCredenciados() throws Exception {
		pesquisarCredenciadosAction = new PesquisarCredenciadosAction();
	}

	@Dado("que acesso a Rede SOCNET dentro do menu funcionalidade")
	public void queAcessoARedeSOCNETDentroDoMenuFuncionalidade() throws Exception {
		pesquisarCredenciadosAction.acessarFerramentas();
	}

	@Quando("acesso a area de pesquisa dos credenciados")
	public void acessoAAreaDePesquisaDosCredenciados() throws Exception {
		pesquisarCredenciadosAction.buscarCredenciados();
	}

	@Entao("realizo a busca por um credenciado e exibo seu perfil")
	public void realizoABuscaPorUmCredenciadoEExiboSeuPerfil() throws Exception {
		pesquisarCredenciadosAction.validarCredenciado();
	}
}
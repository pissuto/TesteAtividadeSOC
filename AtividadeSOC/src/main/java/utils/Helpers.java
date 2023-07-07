package utils;

import java.io.*;
import java.time.Duration;
import java.util.Collection;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers {

    public static String caminho;

	public static Collection<Object> existentPropertiesValuesList() throws IOException {
        String filePath = "src/test/resources/application.properties";
        FileInputStream in = new FileInputStream(filePath);
        Properties props = new Properties();
        props.load(in);
        Collection<Object> valuesList = props.values();
        System.out.println(valuesList);
        return valuesList;
    }

   public static String carregueUmUrquivoDaPropriedades(String path) throws IOException {
	   String resposta = null;
	   try (InputStream input = new FileInputStream("src/test/resources/application.properties")) {
	         Properties prop = new Properties();
	
	        // load a properties file
	        prop.load(input);
	        resposta = prop.getProperty(path);
	        // get the property value and print it out
	
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }
		return resposta;
    }
   
   public static void DeletarArquivo(File file) {
	  if (file.exists()) {
		for (File subfile : file.listFiles()) {
			if (subfile.isDirectory()) {
				DeletarArquivo(subfile);
		    }
            subfile.delete();
        }
	  }
   }  
   
   public static void waitUntil(WebDriver driver, WebElement element, int time) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
       wait.until(ExpectedConditions.elementToBeClickable((By) element));
   }
}
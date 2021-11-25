package br.com.alura.java.teste.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TesteLeituraArquivoProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties props = new Properties();        
		props.load(new FileReader("conf.properties"));

		String login = props.getProperty("login");
		String senha = props.getProperty("senha");
		String endereco = props.getProperty("endereco");

		System.out.println(login + ", " + senha  + ", " +  endereco);
	}

}

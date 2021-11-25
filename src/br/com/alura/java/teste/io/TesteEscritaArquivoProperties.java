package br.com.alura.java.teste.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteEscritaArquivoProperties {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.setProperty("login", "alura"); // chave, valor
		props.setProperty("senha", "alurapass");
		props.setProperty("endereco", "www.alura.com.br");
		props.store(new FileWriter("conf.properties"), "algum comentário");
	}

}

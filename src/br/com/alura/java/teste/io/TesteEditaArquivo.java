package br.com.alura.java.teste.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEditaArquivo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("lorem.txt", true);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write("LKASJLDKJDKLJASDKLJSKLDJSAKLJDKLDJASKL");
		bf.close();
	}
}

package br.com.alura.java.teste.io;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("lorem3.txt");
		ps.println("teste");
		ps.println();
		ps.println("asdasdasdasdasdasd");
		
		ps.close();

	}
}

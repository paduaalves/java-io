package br.com.alura.java.teste.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("The standard Lorem Ipsum passage, used since the 1500s");
		bw.newLine();
		bw.write("Section 1.10.32 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC");
		bw.close();

	}
}

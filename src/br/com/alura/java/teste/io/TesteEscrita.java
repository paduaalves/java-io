package br.com.alura.java.teste.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream out = new FileOutputStream(new File("lorem2.txt"));
		Writer wr = new OutputStreamWriter(out);
		BufferedWriter br = new BufferedWriter(wr);
		
		br.write("The standard Lorem Ipsum passage, used since the 1500s");
		br.newLine();
		br.write("Section 1.10.32 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC");
		br.close();

	}
}

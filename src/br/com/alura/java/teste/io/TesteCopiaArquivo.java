package br.com.alura.java.teste.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		OutputStream out = new FileOutputStream(new File("lorem-copia.txt"));
		Writer wr = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(wr);
		Scanner s=new Scanner(fis).useDelimiter("(?<=\n)|(?!\n)(?<=\r)");
		while (s.hasNext()) {
			bw.write(s.next());
			bw.flush();
		}
		br.close();
		bw.close();
	}

}

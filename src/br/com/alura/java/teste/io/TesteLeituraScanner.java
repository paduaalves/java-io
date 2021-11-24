package br.com.alura.java.teste.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraScanner {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("contas.csv"));
		while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
}

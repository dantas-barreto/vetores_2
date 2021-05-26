package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int n = teclado.nextInt();
		Product[] vetor= new Product[n];
		
		for (int i = 0; i < vetor.length; i++) {
			String name = teclado.next();
			double price = teclado.nextDouble();
			vetor[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			sum += vetor[i].getPrice();
		}
		
		double avg = sum / vetor.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		
		teclado.close();
	}

}

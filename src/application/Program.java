package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Digite o tamanho e a largura do retangulo:");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.printf("AREA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETRO: %.2f%n", rectangle.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());

		sc.close();
	}

}

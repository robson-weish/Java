package principal;

import java.util.Locale;
import java.util.Scanner;
import util.Retangulo;

public class Ret {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in ) ;
		Retangulo rect = new Retangulo();
		
		System.out.println("Entre com os lados direito e esquerdo");
		rect.Width=sc.nextDouble();
		rect.Height=sc.nextDouble();
		
		System.out.printf("Area:  %.2f %n", rect.Area());
		System.out.printf("Perimetro:  %.2f %n", rect.Perimetro());
		System.out.printf("Diagonal:  %.2f %n" , rect.Diagonal());
		
		
		sc.close();

	}

}

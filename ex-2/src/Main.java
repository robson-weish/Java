import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// EXERCICIO 01
		
		Scanner sc = new Scanner(System.in);
		
		int a , b , c;
		
		System.out.print("Digite um numero: ");
		a = sc.nextInt();
		System.out.print("Digite um numero: ");
		b = sc.nextInt();
		
		c = a + b;
		
		System.out.println("SOMA = " + c);
		
		sc.close();
	}

}

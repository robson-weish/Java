import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x;
		
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		
		if ( x > 0 ) {
			System.out.println("Número Positivo");
		}
		else if (x == 0) {
			System.out.println("Número Neutro");
		}
		else {
			System.out.println("Número Negativo");
		}
		
		sc.close();
	}

}

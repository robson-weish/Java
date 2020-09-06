import java.util.Scanner;

public class ex_03_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		
		System.out.print("Digite um numero: ");
		x = sc.nextInt();
		
		x = x % 2;
		
		if (  x == 0 ) {
			System.out.println("Número par");
		}
		else {
			System.out.println("Número impar");
		}
		
		sc.close();
	}

}

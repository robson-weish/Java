import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite uma senha: ");
		senha= sc.nextInt();
		
		while( senha != 2002) {
			System.out.println("Senha Incorreta!");
			System.out.print("Digite uma senha: ");
			senha= sc.nextInt();
		}
		
		System.out.println("Senha correta!");
		sc.close();
	}

}

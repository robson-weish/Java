import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int fim = sc.nextInt();
		
		while(fim != 4 ) {
			
			if (fim == 1) {
				alcool = alcool + 1; 
			}
			else if (fim == 2) {
				gasolina = gasolina + 1; 
			}
			else if (fim == 3) {
				diesel = diesel + 1; 
			}
			
			fim = sc.nextInt();
			
		}
		
		System.out.println("Muito Obrigado!");
		System.out.println("Número de tentativas de abastecimento de cada veiculo");
		System.out.println("Alcool = " + alcool);
		System.out.println("Gasolina = " + gasolina);
		System.out.println("Diesel = " + diesel);
		
		
		
		sc.close();
	}

}

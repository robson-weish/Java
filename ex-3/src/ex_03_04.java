import java.util.Scanner;

public class ex_03_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod;
		int qtd;
		double prc;
		
		System.out.print("Digite o codigo: ");
		cod= sc.nextInt();
		
		System.out.print("Digite oa quantidade: ");
		qtd= sc.nextInt();
		
		if ( cod == 1) {
			prc = qtd * 4.00 ;
			System.out.printf("Preço final será ... R$ %.2f %n " , prc);
		}
		else if ( cod == 2) {
			prc = qtd * 4.50 ;
			System.out.printf("Preço final será ... R$ %.2f %n " , prc);
		}
		else if ( cod == 3) {
			prc = qtd * 5.00 ;
			System.out.printf("Preço final será ... R$ %.2f %n " , prc);
		}
		else if ( cod == 4) {
			prc = qtd * 2.00 ;
			System.out.printf("Preço final será ... R$ %.2f %n " , prc);
		}
		else if ( cod == 5){
			prc = qtd * 1.50 ;
			System.out.printf("Preço final será ... R$ %.2f %n " , prc);
		}
		else {
			System.out.println("PRODUTO INVALIDO");
		}
			
		sc.close();
	}

}

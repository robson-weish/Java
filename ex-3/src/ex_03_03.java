import java.util.Scanner;

public class ex_03_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			int HI;
			int HF;
			int Duracao;
			
			System.out.print("Digite a hora inicial: ");
			HI = sc.nextInt();
			
			System.out.print("Digite a hora final: ");
			HF = sc.nextInt();
			
			if( HI < HF) {
				Duracao = HF - HI;
			}
			else {
				Duracao = 24 - HI + HF;
			}
			
			System.out.println("Duração final e " + Duracao);
			
		
		sc.close();
	}

}

import java.util.Scanner;

public class Main_05 {

	public static void main(String[] args) {
		// EXERCICIO 05
		
		Scanner sc = new Scanner (System.in);
		
		int cd1 , pc1;
		int cd2 , pc2;
		double up1 , up2;
		double total;
		
		System.out.print("Digite o codigo: ");
		cd1 = sc.nextInt();
		System.out.print("Digite a quantidade de peça: ");
		pc1 = sc.nextInt();
		System.out.print("Digite o preço: ");
		up1 = sc.nextDouble();
		
		System.out.print("Digite o codigo: ");
		cd2 = sc.nextInt();
		System.out.print("Digite a quantidade de peça: ");
		pc2 = sc.nextInt();
		System.out.print("Digite o preço: ");
		up2 = sc.nextDouble();
		
		total = ( ((double)pc1 * up1) + ((double) pc2 * up2)  );
		
		System.out.printf("Valor a pagar : R$ %.2f %n" , total);

	}

}

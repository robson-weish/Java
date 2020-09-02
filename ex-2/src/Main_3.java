import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		
		// EXERCICIO  03

		Scanner sc = new Scanner(System.in);
		
		int A , B , C , D , Dif ;
		
		System.out.print("Digte um valor: ");
		A = sc.nextInt();
		System.out.print("Digte um valor: ");
		B = sc.nextInt();
		System.out.print("Digte um valor: ");
		C = sc.nextInt();
		System.out.print("Digte um valor: ");
		D = sc.nextInt();
		
		Dif = (A*B-C*D);
		
		System.out.print("Diferença:  " + Dif);
		
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		
		//EXERCICIO 02
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double  area , parame , raio ; 
		
		parame = 3.14159;
		
		System.out.print("Digite o valor de Raio: ");
		raio = sc.nextDouble();
		
		area = parame * (raio * raio);
		
		System.out.printf("Area e igual a ... %.4f %n" , area);
		
		sc.close();
	}

}

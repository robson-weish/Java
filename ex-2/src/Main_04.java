import java.util.Scanner;

public class Main_04 {

	public static void main(String[] args) {
		// EXERCICIO 04
		
		Scanner sc = new Scanner(System.in);
		
		int id;
		double hora , sal;
		
		System.out.print("Digite o ID: ");
		id = sc.nextInt();
		
		System.out.print("Digite as horas: ");
		hora = sc.nextDouble();
		
		System.out.print("Digite as salario/hora: ");
		sal = sc.nextDouble();
		
		sal = sal * hora;
		
		System.out.println("Number: " + id);
		System.out.printf("Salary : U$ %.2f %n" , sal);
		sc.close();
	}

}

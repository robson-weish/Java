package principal;

import java.util.Scanner;

import util.salary;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in ) ;
		salary sal = new salary();
		double porcentagem;
		
		System.out.print("Entre com nome: ");
		sal.Name = sc.next();
		
		System.out.print("Entre com o salario: ");
		sal.SalarioBruto = sc.nextDouble();
		
		System.out.print("Entre com a taxa: ");
		sal.Taxa =  sc.nextDouble();
		
		sal.SalarioLiquido();
		System.out.println(sal);
		
		System.out.print("Entre com a porcentagem: ");
		porcentagem = sc.nextDouble();
		
		sal.PorcentagemSalario(porcentagem);
		System.out.println(sal);
		
		sc.close();
	}

}

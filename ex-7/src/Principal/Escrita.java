package Principal;

import java.util.Locale;
import java.util.Scanner;

import Utilidades.Conta;

public class Escrita {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String nome;
		int conta;
		double deposito , saque;
		
		Conta ct = new Conta();
		
		System.out.print("Digite o número da conta: ");
		conta = sc.nextInt();
		ct.setConta(conta);
		
		System.out.print("Digite um nome: ");
		sc.nextLine();
		nome = sc.nextLine();
		ct.setNome(nome);
		
		System.out.print("Deseja realizar um deposito ? (S/N)");
		String lt = sc.next();
		
		if(lt.equals("S")) {
			System.out.print("Digite um valor: ");
			deposito = sc.nextDouble();
			ct.setDeposito(deposito);
		}
		
		System.out.println("Dados iniciais : " + ct);
		
		System.out.print("Entre com um deposito: ");
		deposito =  sc.nextDouble();
		ct.depositoBancario(deposito);
		
		System.out.println("Dados atualizados : " + ct);
		
		System.out.print("Entre com um Saque: ");
		saque =  sc.nextDouble();
		ct.saqueBancario(saque);
		
		System.out.println("Dados atualizados : " + ct);
		
		
		sc.close();
	}
 
}

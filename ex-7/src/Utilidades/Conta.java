package Utilidades;

public class Conta {
	
	private int conta;
	private String nome;
	private double deposito;
	
	// CONSTRUTORES
	
	public Conta () {
		
	}

	public Conta(int conta, String nome) {
		super();
		this.conta = conta;
		this.nome = nome;
	}

	public Conta(int conta, String nome, double deposito) {
		this.conta = conta;
		this.nome = nome;
		this.deposito = deposito;
	}

	// ENCAPSULAMENTO
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}
	
	// METODOS
	
	public void depositoBancario (double deposito) {
		
		 this.deposito += deposito;
		
	}
	
	public void saqueBancario (double saque) {
		
		this.deposito = ( this.deposito - 5 ) - saque;
		
	}
	
	// IMPRESSÃO
	
	public String toString() {
		
			return "A conta e " + conta + ", com o nome de " + nome + ", valor de " + String.format ("%.2f", deposito);
			
	}
	
	
	
}

package util;

public class salary {
	public String Name;
	public double SalarioBruto;
	public double Taxa;
	
	public double SalarioLiquido () {
		
		SalarioBruto = SalarioBruto - Taxa;
		
		return SalarioBruto;
	}
	
	public void  PorcentagemSalario (double porcentagem) {
		
		SalarioBruto += SalarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return "O nome e " + Name + ". Com o salario de " + SalarioBruto;
	}
}

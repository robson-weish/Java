import java.util.Locale;

public class fixacao {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		 
		
		System.out.println("Products:");
		System.out.printf(product1 + ", which price is $ %.2f %n", price1);
		System.out.printf(product2 + ", which price is $ %.2f %n", price2);
		
		System.out.print("Record:");
		System.out.printf(age + " years old, code " + code + " and gender: " + gender + " %n");
		
		System.out.printf("Measue with decimal places: %.10f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		
		
		// COMANDO QUE E NECESSARIO O IMPORT UTILIZADO ACIMA
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", measure);
	}

}

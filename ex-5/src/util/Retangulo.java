package util;

public class Retangulo {

	public double Width;
	public double Height;
	
	public double Area() {
		
		double area_retangulo; 
		
		area_retangulo = Width * Height;
		
		return area_retangulo;
		
	}
	
	public double Perimetro() {
		
		double peri_retangulo;
		
		peri_retangulo = 2 * (Width + Height);
		
		return peri_retangulo;
	}
	
	public double Diagonal() {
		
		double diagonal_retangulo;
		
		diagonal_retangulo = Math.sqrt(Width * Width + Height * Height);
		
		return diagonal_retangulo;
	}
}

package array;

public class Metodo {

	double total;
	
	public double Somar(double numero[]) { 
	for(int i = 0; i< numero.length; i++) {
		total += numero[i];

	}
	return total;
	
}
}
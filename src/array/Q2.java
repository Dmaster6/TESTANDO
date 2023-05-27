package array;

import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double numero[] = new double[10];
		Metodo s = new Metodo();
		
		
		for(int cont= 0; cont <numero.length;cont++) {
			numero[cont] = in.nextDouble();
		}
		
		System.out.print(s.Somar(numero));
}
}

package revisaoprova;

import java.util.ArrayList;
import java.util.Scanner;


public class vetorint {
public static void main(String[] args) {
	Scanner b = new Scanner(System.in);
	ArrayList <Integer> numeral = new ArrayList<Integer>();
	Somatorio s = new Somatorio();
	System.out.println("digite os numeros plsss:");
	
	for(int i = 0; i<10; i++) {
		Integer numero;
		numero= b.nextInt();
		numeral.add(numero);
		
	}
	int p = s.Somar(numeral);
	System.out.println(p);

	
}
}
  

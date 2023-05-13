package revisaoprova;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		ArrayList <Integer> x = new ArrayList<Integer>();
		ArrayList <Integer> y = new ArrayList<Integer>();
		ArrayList <Integer> z = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		System.out.println("digite os numeros do primeiro array");
		for(int i = 0; i<5; i++) {
		int numero;
		numero = input.nextInt();
		x.add(numero);
		}
		System.out.println("digite os numeros do segundo array");
		for(int i = 0; i<5; i++) {
		int numero;
		numero = input2.nextInt();
		y.add(numero);
		}

		System.out.println("interseção dos array é: ");
		for(int m=0; m<x.size(); m++ ) {
		for(int j=0; j<y.size(); j++) {
		if(x.get(m)==y.get(j)) {
		z.add(y.get(j));
		
	    	} 
    	}
 	}
		System.out.println(z);
	}
}
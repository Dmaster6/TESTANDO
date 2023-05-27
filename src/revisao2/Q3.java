package revisao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
public static void main(String[] args) {
	ArrayList <Integer> vetor = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	System.out.println("insira numeros de 2 a 7, se o numero digita for invalido o array será encerrado: ");
	for(int i = 0; i<5; i++) {
		int numero;
		numero = in.nextInt();
		if( numero >= 2 && numero <= 7 ) {
			vetor.add(numero);
		}else {
			System.out.println("numero invalido");
			break;
		}
	}
	System.out.println(vetor);
	
}

}

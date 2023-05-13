package revisao2;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	int numero;
	System.out.println("digite o karai do numero: ");
	Scanner in = new Scanner(System.in);
	numero = in.nextInt();
	int antecessor = numero -1; 
	int sucessor = numero + 1; 
	System.out.println("o sucessor do numero é: " + sucessor + " o antecessor é: " + antecessor);

}
}

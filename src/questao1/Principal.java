package questao1;

import java.util.Scanner;


public class Principal {
public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Metodos m = new Metodos();
		String teste = "" ;
		
		while(!teste.equals("esta correto")) {
			System.out.println("digete um numero");
			teste = m.verificar(in.nextInt());
			System.out.println(teste);
		}
		
		System.out.println(m.imprimirTentativas());
		
		
			
	
	
}
}

package revisao;

import java.util.Scanner;

public class codigo6 {
public static void main(String[] args) {
	double salarioHora = 12.25;
	int hora;
	Scanner input = new Scanner(System.in);
	System.out.println("digite o numero de horas trabalhadas: ");
	hora = input.nextInt();
	double salarioTotal = salarioHora*hora;
	System.out.println(salarioTotal );
	if(salarioTotal < 50) {
		System.out.println("va trabalhar ");
	} else {
		System.out.println("continue assim, ESCRAVO!!!!!");
	} 
	
}
}
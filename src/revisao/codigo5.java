package revisao;

import java.util.Scanner;

public class codigo5 {
public static void main(String[] args) {
	double salarioHora = 12.25;
	int hora;
	Scanner input = new Scanner(System.in);
	System.out.println("digite o numero de horas trabalhadas: ");
	hora = input.nextInt();
	System.out.println(salarioHora*hora );
	
}
}

package revisao2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2 {
public static void main(String[] args) {
	double salariominimo = 1320;
	double salariousuario;
	System.out.println("digite o valor do seu salario");
	Scanner in = new Scanner(System.in);
	salariousuario = in.nextDouble();
	double quantsalario = salariousuario/salariominimo;
	
	String ajeitada = "#.##";
	DecimalFormat decimal = new DecimalFormat(ajeitada);
	String ajeitou = decimal.format(quantsalario);
	
	System.out.println("vc possui: " + ajeitou + " salario(s) minimo(s)");
	
	
	
}
}

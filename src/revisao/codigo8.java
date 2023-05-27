package revisao;

import java.util.Scanner;

public class codigo8 {
public static void main(String[] args) {
	double preçoDeCusto;
	double preçoDeVenda;
	
	
	System.out.print("insira o preço de custo: ");
	Scanner input1 = new Scanner(System.in);
	preçoDeCusto = input1.nextDouble();
	System.out.print("insira o preço de venda: ");
	Scanner input2 = new Scanner(System.in);
	preçoDeVenda = input2.nextDouble();
	
	double valorFinal = preçoDeVenda - preçoDeCusto;
	double percentual = 50 * (preçoDeCusto/100);
	
	
	if(valorFinal < percentual) {
		System.out.println("não houve lucro");
	} else {
		System.out.println("houve lucro");
	}
	
	

}
}
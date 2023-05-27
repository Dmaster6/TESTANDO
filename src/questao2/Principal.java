package questao2;

import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	Metodos2 m2 = new Metodos2();
	Funcionarios f = new Funcionarios("cpf", "rg", "nome");

	
	

	m2.cadastrar();
	//m2.removeElement(1);
	m2.addElement(3, f);
	m2.listar();
	//System.out.println(m2.procurarNome("manoel"));
	
	
	
	//System.out.println(m2.procurarPosicao(0));
}
}





package qustao3;

public class principal {
public static void main(String[] args) {
	Metodos3 m = new Metodos3();
	Funcionarios f = new Funcionarios();
	f.setCpf("wdwedqwd");
	f.setRg("wdwedqwd");
	f.setNome("wdwedqwd");

	m.cadastrar();
	//System.out.println(m.procurarPosicao(1));
	System.out.println(m.procurarPosicao(1));
	
	//m.addperposition(2, f);
	//m.listar();
	//m.remover(0);
	//m.listar();
	
}
}

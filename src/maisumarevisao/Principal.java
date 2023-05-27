package maisumarevisao;

public class Principal {
public static void main(String[] args) {
	Conta c = new Conta("nome", 928108);
	Conta c1 = new Conta("name", 3475938);
	Conta c2 = new Conta("nombre", 0.796);
	Conta c3 = new Conta("lacoste", 165.98);
	CasatrarConta cc = new CasatrarConta();
	
	cc.adicionar(c);
	cc.adicionar(c1);
	//cc.remover(0);
	cc.adicionar(c3);
	cc.adicionarPosicao(2, c2);
	//System.out.println(cc.procurarPorNome("name"));
	//System.out.println(cc.procurar(0));
	cc.listar();
	
}
}

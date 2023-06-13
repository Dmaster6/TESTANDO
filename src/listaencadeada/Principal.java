package listaencadeada;

public class Principal {
	public static void main(String[] args) {
		Lista l = new Lista();
		l.adicionarFim("HOJE");
		l.adcionarNoComeco("A");
		l.adcionarNoComeco("B");
		l.adcionarNoComeco("C");
		l.adcionarNoComeco("D");
		l.adicionarPerPosition(0, "E");

		l.listar();

		l.removerFinal();

		l.listar();

		l.removerInicio();

		l.listar();

		l.removerPorPosicao(0);

		l.listar();

		l.adiciona("F");

		l.listar();
	}
}

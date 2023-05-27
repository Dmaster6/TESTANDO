package listaencadeada;

public class Principal {
public static void main(String[] args) {
	Lista l = new Lista();
	l.adicionarFim("HOJE");
	l.adcionarNoComeco("A");
	l.adcionarNoComeco("B");
	l.adcionarNoComeco("C");
	l.adcionarNoComeco("D");
	l.adicionarPerPosition(4, "E");

	l.printList();
}
}

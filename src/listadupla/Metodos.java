package listadupla;

public class Metodos {
	private Celula primeiro;
	private Celula ultimo;
	private int total;
	
	public void adicionaInicio(Object element) {
		Celula nova = new Celula(element);
		if(total == 0){
			this.ultimo = this.primeiro = nova;
		}
		nova.setProximo(this.primeiro);
		this.primeiro.setAnterior(nova);
		this.primeiro = nova;
		total++;
	}
	
	public void listar() {
		if(total == 0) {
			System.out.println("[]");
		}
		Celula aux = this.primeiro;
		for (int cont = 0; cont < this.total - 1; cont++) {
			System.out.print(aux.getElemento() + " - ");
			aux = aux.getProximo();
		}
		System.out.println(aux.getElemento());
	}
	public void adicionaFim(Object element) {
		Celula newone = new Celula(element);
		newone.setProximo(null);
		if(total == 0) {
			this.ultimo = this.primeiro = newone;
		}
		newone.setAnterior(this.ultimo);
		this.ultimo.setProximo(newone);
		this.ultimo = newone;
		total++;
	}
	
	public void adicionaPosicao(int posicao, Object element) {
	 if(posicao<0 || posicao>total ) {
		 throw new IllegalArgumentException("posição invalida!!");
	 }
	 	else if(posicao == 0){
			adicionaInicio(element);
		}
		else if(posicao == total) {
			adicionaFim(element);
		}else {
			Celula aux = this.primeiro;
			for(int i = 0; i<posicao -1; i++) {
				aux.setAnterior(aux);
				aux = aux.getProximo();
			}
			Celula novinha = new Celula(element);
			novinha.setAnterior(aux);
			novinha.setProximo(aux.getProximo());
			aux.setProximo(novinha);
			total++;
		}
			
	}
	
}




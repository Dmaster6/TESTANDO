package listaencadeada;


public class Lista {
	
	private Celula primeira;
	private Celula ultima;
	private int total;

	
	public void adcionarNoComeco(Object element) {
		
		Celula nova = new Celula(element);
		
		nova.setProxima(primeira);
		this.primeira = nova;
		
		if(total == 0) {
			 this.ultima = nova;
		}
		total++;
	}
	
	public void adiciona(Object elemento) {
		if (this.total == 0) {
			adcionarNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			this.ultima = nova;
			this.total++;

		}

	}

	public void removerInicio() {
		
		Celula remove = this.primeira;
		this.primeira = this.primeira.getProxima();
		remove.setProxima(null);
		this.total--;
	}
	
	public void removerFinal() {
		
		Celula anterior = this.primeira;
		
		for(int cont=0;cont<this.total-2;cont++) {
			anterior = anterior.getProxima();
		}
			
		anterior.setProxima(null);
		this.ultima = anterior;
		
		this.total--;
		
	}
	
	public void removerPorPosicao(int posicao) {
		
		if(posicao == 0) {
			removerInicio();
		} else {
		
		Celula anterior = this.primeira;
		
		for(int cont=0; cont<posicao-1;cont++) {
			anterior = anterior.getProxima();
		}

		anterior.setProxima(anterior.getProxima().getProxima());
		
		this.total--;
	}
}
	
	public void adicionarPerPosition(int index, Object elemento) {
		if(index < 0 || index > this.total) {
			throw new IllegalArgumentException("posição invalida!!!");
		}
		else if(index == 0){
			adcionarNoComeco(elemento);
		}else if (index == total) {
			adicionarFim(primeira);
		}else {
		Celula newcelula = new Celula();
		newcelula.setElemento(elemento);
		Celula celula1 = this.primeira;
			for(int i =0; i< index -1; i++) {
				celula1 = celula1.getProxima();
			}
			newcelula.setProxima(celula1.getProxima());
			celula1.setProxima(newcelula);
			total++;
		}
	}
	public void adicionarFim(Object novissimo)  {
	
	    Celula new_Celula = new Celula();
	  new_Celula.setElemento(novissimo);
	  new_Celula.setProxima(null); 
	  
	    if (total == 0)  {
	       this.primeira = this.ultima = new_Celula;
	    } else {
	    	this.ultima.setProxima(new_Celula);
	    	this.ultima = new_Celula;
	    }
	  total++;
	
	}
	public void listar() {
		if(total == 0) {
			System.out.println("[]");
		}
		Celula aux = this.primeira;
		for (int cont = 0; cont < this.total - 1; cont++) {
			System.out.print(aux.getElemento() + " ");
			aux = aux.getProxima();
		}
		System.out.println(aux.getElemento());

	}
}

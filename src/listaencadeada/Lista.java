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
	    public void printList()
	    {
	        Celula tnode = this.primeira;
	        while (tnode != null)
	        {
	            System.out.print(tnode.getElemento() +" ");
	            tnode = tnode.getProxima();
	        }
	        return;
	    }
	        
	    }


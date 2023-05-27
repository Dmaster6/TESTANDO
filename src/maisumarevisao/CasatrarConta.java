package maisumarevisao;

import java.util.Arrays;

public class CasatrarConta {
	Conta c[] = new Conta[3];
	int total =0;
	
	public void listar() {
		System.out.println(Arrays.toString(this.c));
	}
	public void adicionar(Conta c1) {
		this.c[this.total] = c1;
		this.total++;
	}
	public Conta procurar(int index) {
		return this.c[index];
	}
	public void remover(int index) {
		Conta c2[] = new Conta[this.c.length -1];
		int j= 0;
		for(int i= 0; i<this.c.length; i++) {
			if(i != index ) {
				c2[j] = this.c[i];
				j++;
			}
		
		}	
		this.c = c2;		
		
	}
	public Conta procurarPorNome(String nome) {
		for(int i = 0; i<this.c.length; i++) {
		if(this.c[i].getNome().equals(nome));{
			return this.c[1];
			}
	
		} 
		return null;
  }
	public void adicionarPosicao(int index, Conta c) {
		aumentar();
		Conta c1[] = new Conta[this.c.length];
		for(int i = 0; i < index; i++) {
			c1[i] = this.c[i];
		}
		
		c1[index] = c;
		
		for(int i = index +1; i < this.c.length; i++) {
			c1[i] = this.c[i -1];
		}
		this.c = c1;

	}
	public void aumentar() {
		if(this.c.length == this.total) {
			Conta c3[] = new Conta[this.c.length * 2];
			System.arraycopy(this.c, 0, c3, 0, this.c.length);
			this.c = c3;
		}
	}
}


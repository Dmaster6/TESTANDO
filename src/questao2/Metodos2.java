package questao2;

import java.util.Arrays;
import java.util.Scanner;

public class Metodos2 {
	
	Scanner in = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	Funcionarios[] f = new Funcionarios[10];
	int total = 0;
	
	
	public void addElement(int index, Funcionarios element) {
		aumentaVetor(); 
		Funcionarios[] newArray = new Funcionarios[this.f.length + 1];
	    
	    for (int i = 0; i < index; i++) {
	        newArray[i] = this.f[i];
	    }
	    
	    newArray[index] = element;
	    
	    for (int i = index + 1; i < newArray.length; i++) {
	        newArray[i] = this.f[i - 1];
	    }
	    
	    this.f = newArray;
	}
	public void removeElement( int removedIdx) {
		Funcionarios[] novoArray = new Funcionarios[this.f.length - 1];
		
		int j = 0;
		for (int i = 0; i < this.f.length; i++) {
		    if (i != removedIdx) {
		        novoArray[j] = this.f[i];
		        j++;
		    }
		}

		
		this.f = novoArray;
	}
	
	public void adicionar(Funcionarios c) {
		aumentaVetor();
		f[this.total] = c;
		this.total++;
	}
	public void listar() {

		System.out.println(Arrays.toString(this.f));

	}
	
	public void cadastrar() {
		System.out.println("Digite a quantidade de funcionários:");
		int quant = input.nextInt();
		for(int i =0; i<quant; i++ ) {
			Funcionarios f = new Funcionarios();
			System.out.println("digite o seu nome: ");
			f.setNome(in.nextLine());
			System.out.println("digite o seu cpf: ");
			f.setCpf(in.nextLine());
			System.out.println("digite o seu rg: ");
			f.setRg(in.nextLine());
			adicionar(f);
		}
	}
	
	public Funcionarios procurarPosicao(int p) {

		if (!verificaPosicao(p)) {

			throw new IllegalArgumentException("posição inválida!");
		}

		return this.f[p];
	}
	private boolean verificaPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}

private void aumentaVetor() {
		
		if(this.total == this.f.length){
			
			Funcionarios[] newObject = new Funcionarios[this.f.length*2];
			
			System.arraycopy(this.f, 0, newObject, 0, this.f.length);
			
			this.f = newObject;
		}
	
		
	}
    public Funcionarios procurarNome(String nome) {
	for(int i = 0; i<this.total; i++) {		
		if(this.f[i].getNome().equals(nome));
		return this.f[i];
	}
	return null;
}
    
}

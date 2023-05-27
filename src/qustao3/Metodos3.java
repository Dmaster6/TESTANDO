package qustao3;

import java.util.ArrayList;
import java.util.Scanner;



public class Metodos3 {
	
	ArrayList<Funcionarios> func = new ArrayList<Funcionarios>();
	int total = 0;
	
	 public void cadastrar() {
	        Scanner input = new Scanner(System.in);
	        Scanner input1 = new Scanner(System.in);
	        System.out.print("digite a quantidade de funcionarios");
	        int quant = input1.nextInt();
	    for(int i = 0; i<= quant -1 ; i++) {
	        Funcionarios funcionario = new Funcionarios();
	        System.out.print("Nome: ");
	        funcionario.setNome(input.nextLine());
	        System.out.print("Rg: ");
	        funcionario.setRg(input.nextLine());
	        System.out.print("Cpf: ");
	        funcionario.setCpf(input.nextLine()); 

	        func.add(funcionario);
	    	}
	   
	    }
	public void addperposition(int index, Funcionarios f) {
		func.add(index, f);
	}
	 public Funcionarios procurarPosicao(int p) {
		if(!verificaPosicao(p)) {
			throw new IllegalArgumentException("posição inavlida");
		}
			return func.get(p);
		}
	 
	 
		private boolean verificaPosicao(int posicao) {
			return posicao >= 0 && posicao <= func.size();
		}
		public void remover(int index) {
			func.remove(index);
			
		}
		 public void listar() {
		        if (func.size() == 0) {
		            System.out.println("Não há funcionários cadastrados.");
		            return;
		        }

		        for (Funcionarios funcionario : func) {
		            System.out.println("Nome: " + funcionario.getNome());
		            System.out.println("RG=g: " + funcionario.getCpf());
		            System.out.println("Cpf: " + funcionario.getRg());
		            System.out.println("------------");
		        }
		    }
		
	
}



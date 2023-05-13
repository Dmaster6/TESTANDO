package questao1;

import java.util.Arrays;
import java.util.Random;

public class Metodos {
	Random c = new Random();
	int numero1 = c.nextInt(99);
	int total = 0;
	int coletor[] = new int[3];
	
	 public String imprimirTentativas() {
		 return "suas tentativas foram" + Arrays.toString(this.coletor); 
	 }
	
	public String verificar(int numero) {
		if(this.total == this.coletor.length) {
			aumentarvetor();
		}
		
			if(numero < this.numero1){
				this.coletor[total] = numero;
				this.total++;
				return "é menor";
			}	
			 if(numero > this.numero1) {
				this.coletor[total] = numero;
				this.total++;
				return "é maior";
			}else {
			 this.coletor[total] = numero;
				this.total++;
				return "esta correto";
	}
			
	}
	public void aumentarvetor() {
		if (this.total == this.coletor.length) {

			int[] newcoletor = new int[this.coletor.length * 2];

			System.arraycopy(this.coletor, 0, newcoletor, 0, this.coletor.length);

			this.coletor = newcoletor;
		}
	}
}
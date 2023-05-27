package revisao;

public class codigo7 {
	 public static void main(String[] args) {
	        int numero,   ultimo=1,   penultimo=0;
	        
	        numero = ultimo + penultimo;
	        
	        while(numero<=100){
	            System.out.println(numero);
	            
	            penultimo=ultimo;
	            ultimo=numero;
	            numero = ultimo + penultimo;
	            
	        }
	    }
	}


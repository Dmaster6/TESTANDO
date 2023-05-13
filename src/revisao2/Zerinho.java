package revisao2;

import java.util.Random;
import java.util.Arrays;


public class Zerinho {
public static void main(String[]args) {
	Random r = new Random();
	int[] zerinho = new int[3];
	
	Funcao s = new Funcao();
	
	for(int cont=0;cont<zerinho.length;cont++) {
		
		zerinho[cont] = r.nextInt(2);
		
	}
	
	System.out.println(Arrays.toString(zerinho));
	
	System.out.println(s.verificaResultado(zerinho));
}

}

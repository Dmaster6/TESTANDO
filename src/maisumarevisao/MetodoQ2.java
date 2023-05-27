package maisumarevisao;

public class MetodoQ2 {


	    public int conversao( int[] binario) {
	        int decimal = 0;
	        int exp = 0;

	        for (int i = binario.length - 1; i >= 0; i--) {
	            decimal += binario[i] * Math.pow(2, exp);
	            exp++;
	        }

	        return decimal;
	    }
}

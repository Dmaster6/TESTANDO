package maisumarevisao;

import java.util.ArrayList;
import java.util.List;

public class Q4 {
	public static void main(String[] args) {
        String[] array = {"Abacaxi", "Banana", "Amora", "Pera", "Maçã"};
        String[] stringsComA = obterStringsComA(array);

        for (String str : stringsComA) {
            System.out.println(str);
        }
    }
	 public static String[] obterStringsComA(String[] array) {
	        List<String> resultado = new ArrayList<>();

	        for (String str : array) {
	            if (str.length() > 0 && str.substring(0, 1).equalsIgnoreCase("A")) {
	                resultado.add(str);
	            }
	        }

	        return resultado.toArray(new String[0]);
	    }
}

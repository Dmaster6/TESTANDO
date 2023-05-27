package maisumarevisao;

public class Q3 {
	public static void main(String[] args) {
        MetodoQ3 q = new MetodoQ3();
		int[] array = {9, 4, 7, 2, 10, 5}; 

        int segundo = q.Encontar(array, 6);

        System.out.println("Segundo maior elemento: " + segundo);
    }

}


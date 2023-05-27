package maisumarevisao;

import java.util.Arrays;

public class MetodoQ3 {
	public  int Encontar(int[] array, int tamanho) //defina o array e seu tamanho
		{
        if (array.length < 2) {
            throw new IllegalArgumentException("O array deve conter pelo menos dois elementos.");
        }
        
        Arrays.sort(array);  
        return array[tamanho-2];  
    }
}

package maisumarevisao;

public class Questão2{
public static void main(String[] args) {
    int[] arraia = {1, 1, 1, 1, 1}; 

     MetodoQ2 converter = new MetodoQ2();
    int decimal = converter.conversao(arraia);

    System.out.println("Número Decimal: " + decimal);
}
}
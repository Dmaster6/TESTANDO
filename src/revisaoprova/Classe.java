package revisaoprova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
ArrayList <String> nome = new ArrayList<String>();
Scanner in = new Scanner (System.in);

System.out.println("digite os nomes POURRRA: ");

for(int i= 0; i<10; i++) {
	String nomes;
	nomes = in.next();
	nome.add(nomes);
}
Collections.sort(nome);
System.out.println(nome);


}
}

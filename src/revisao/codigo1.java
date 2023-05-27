package revisao;

import java.util.Scanner;

public class codigo1{
public static void main(String[] args) {
	int n;
	String frase;
	Scanner inpu = new Scanner(System.in);
	frase = inpu.nextLine();
Scanner input = new Scanner(System.in);
	n = input.nextInt();
    int i = 1; 
	while (i <= 10) {
		System.out.println(frase + " " + n*i);
		i++; 
}
}
}



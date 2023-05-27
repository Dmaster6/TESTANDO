package revisao;

import java.util.Scanner;

public class codigo2 {
public static void main(String[] args) {
	int n;
	int j = 2;
	System.out.println(" digite um numero porras");
	Scanner input = new Scanner(System.in);
	n = input.nextInt();
	if(n % 2 != 0) {
		System.out.println("impar");
	}if(n % 2 == 0) {
		System.out.println("par");
	}
	

} 
}

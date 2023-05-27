package revisao;

import java.util.Scanner;

public class codigo3 {
	public static void main(String[] args) {
		
	int m;
	Scanner input1 = new Scanner(System.in);
	m = input1.nextInt();
	if(m == 1 ) {
		System.out.println("janeiro");
	}if(m == 2 ) {
		System.out.println("fevereiro");
	}if(m == 3 ) {
		System.out.println("mar�o");
	}if(m == 4 ) {
		System.out.println("abril");
	}if(m == 5 ) {
		System.out.println("maio");
	}if(m == 6 ) {
		System.out.println("junho");
	}if(m == 7 ) {
		System.out.println("julho");
	}if(m == 8 ) {
		System.out.println("agosto");
	}if(m == 9 ) {
		System.out.println("setembro");
	}if(m == 10 ) {
		System.out.println("outubro");
	}if(m == 11 ) {
		System.out.println("novembro");
	}if(m == 12 ) {
		System.out.println("dezembro");
	} else if(m> 12  || m<1) {
		System.out.println("numero invalido");
	} 
		
}
	}
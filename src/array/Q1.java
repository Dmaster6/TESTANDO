package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	String[] order = new String[10];
	
	for(int cont = 0; cont<order.length;cont++) {
		order[cont] = in.nextLine();
		
	}
	Arrays.sort(order);
	System.out.println(Arrays.toString(order));
	
}
}

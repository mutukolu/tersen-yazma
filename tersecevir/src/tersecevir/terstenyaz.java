package tersecevir;

import java.util.Scanner;

public class terstenyaz {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kelimeyi Giriniz Lütfen = ");
		
		String kelime = scan.nextLine();
		cevir(kelime);
		
	}
	public static void cevir(String mutu) {
		
		for (int i = mutu.length()-1 ; i>=0 ; i--) {
			System.out.println(mutu.charAt(i));
		}
		
	}

}

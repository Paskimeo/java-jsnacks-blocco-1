package jsnacks;

import java.util.Scanner;

public class jsnacks2 {

	public static void main(String[] args) {
		//Chiedi all'utente di inserire un numero, se � pari stampa il numero,
		//se � dispari stampa il numero successivo

		Scanner scan = new Scanner(System.in);
		int numero;
		System.out.println("inserisci un numero, se pari lo accetto, altrimenti stampo un pari, sei condananto a solo pari ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("il numero scelto � :" + numero);
			
		}else {
			System.out.println("il numero scelto � :" + (numero + 1));
		}
	}

}

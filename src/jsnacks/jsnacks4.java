package jsnacks;

public class jsnacks4 {

	public static void main(String[] args) {
		// Crea un array di numeri interi
		//e fai la somma di tutti gli elementi che sono in posizione dispari

		int[] numeri = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("verranno stampati solo i numeri in posizione dispari");
		
		for(int i=0; i < numeri.length; i= i+2) {
			System.out.println(numeri[i]);
		}
	}

}

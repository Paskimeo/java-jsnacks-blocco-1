package jsnacks;

import java.util.Random;

public class jsnacks3 {

	public static void main(String[] args) {
		// Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una
		// lista di cognomi, genera una falsa lista di 3 invitati.

		
		String[] nomi = {"alfredo","giovanni","dorito","doraemon"};
		String[] cognomi = {"alfredi","giovannini","Cornolio","Mazzabbi"};
		
		Random random = new Random();
		
		for(int i = 0; i<4 ; i++) {
			int randomic1 = random.nextInt(4);
			int randomic2 = random.nextInt(4);
			System.out.println(nomi[randomic1] + " " + cognomi[randomic2]);
		}
	}

}

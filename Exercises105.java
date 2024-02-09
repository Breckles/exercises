import java.util.Scanner;

public class Exercises105 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		boolean continuee = true; // Dans le scope au dessus de mois

		do {
			System.out.print("Entrez une phrase: ");
			String phrase = sc.nextLine();

			if (phrase.length() < 5) {
				System.out.println("minimum 5 caractere");
			} else {
				System.out.println("Longueur" + phrase.length());
				System.out.println("En minuscule : " + phrase.toLowerCase());
				System.out.println("En majuscule : " + phrase.toUpperCase());
				System.out.println("5 premires lettres: " + phrase.substring(0,5));
				System.out.println("3 dernieres lettres: " + phrase.substring(phrase.length() - 3, phrase.length()));
			}

			System.out.println("Voulez vous recommencer (N pour arreter) ?");
			String reponseContinuee = sc.nextLine();
			
			if ( reponseContinuee.toUpperCase().equals("N") )
			{
				continuee = false; // pour arreter le programme
			}


		} while (continuee);
		
		//System.out.println("Entrez un minimum de " + phrase.length());
    sc.close();

	}

}

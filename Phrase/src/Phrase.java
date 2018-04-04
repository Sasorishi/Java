import java.util.Scanner;

public class Phrase 
{
	private String phrase;
	
	public Phrase()
	{
		this.phrase = "";
	}
	
	public void saisir()
	{
		System.out.println("Saississez une phrase : ");
		Scanner sc = new Scanner(System.in);
		this.phrase = sc.next();
	}
	
	public void afficher()
	{
		System.out.println("La phrase est de : " + this.phrase);
	}
	
	public String miroir()
	{
		String m = "";
		for (int i = this.phrase.length() - 1; i >= 0; i++)
		{
			m = m + this.phrase;
		}
		return m;
	}
	
	public void palindrome()
	{
		if (this.phrase.equals(this.miroir()))
		{
			System.out.println("La phrase est un palindrome");
		}
		else
		{
			System.out.println("La phrase n'est pas un palindrome");
		}
	}
	
	public void crypter()
	{
		String crypte = "";
		int cle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la clé du cryptage : ");
		cle = sc.nextInt();
		for(int i = 0; i < this.phrase.length(); i++)
		{
			crypte = crypte + (char) (this.phrase.charAt(i) + cle) % 128;
		}
		System.out.println("La chaine cryptée est : " + crypte);
	}
	
	public void decrypter()
	{
		String decrypte = "";
		int cle;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la cle pour le décryptage : ");
		cle = sc.nextInt();
		for(int i = 0; i < this.phrase.length(); i++)
		{
			decrypte = decrypte + (char)((this.phrase.charAt(i) - cle) % 128);
		}
		System.out.println("La chaine decrypte est : " + decrypte);
	}
	
	public void menu()
	{
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("|--------- MENU ---------|");
			System.out.println("| 1 - Saisir une phrase  |");
			System.out.println("| 2 - Afficher           |");
			System.out.println("| 3 - Miroir	         |");
			System.out.println("| 4 - Palindrome         |");
			System.out.println("| 5 - Crypte phrase      |");
			System.out.println("| 6 - Decrypte phrase    |");
			System.out.println("| 0 - Quitter            |");
			System.out.println("|________________________|");
			System.out.println("\t\t Votre choix -> ");
			choix = sc.nextInt();
			switch(choix)
			{
				case 1 : this.saisir();
				break;
				
				case 2 : this.afficher();
				break;
				
				case 3 : this.miroir();
				break;
				
				case 4 : this.palindrome();
				break;
				
				case 5 : this.crypter();
				break;
				
				case 6 : this.decrypter();
				break;
			}
		}
		while (choix!=0);
	}
}

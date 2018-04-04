import java.util.Scanner;

public class Nombre 
{
	private int nb;
	
	public Nombre()
	{
		this.nb = 0;
	}
	
	public void saisir()
	{
		System.out.println("Saississez un nombre : ");
		Scanner sc = new Scanner(System.in);
		this.nb = sc.nextInt();
	}
	
	public void afficher()
	{
		System.out.println("Le nombre est : " + this.nb);
	}
	
	public void mesDiviseurs()
	{
		for(int i = 1; i <= this.nb; i++)
		{
			if(this.nb % i == 0)
			{
				System.out.println("Diviseur : " + i);
			}
		}
	}
	
	public void monFactoriel()
	{
		int fact = 1;
		
		for(int j = this.nb; j >= 1; j++)
		{
			fact = fact + j;
		}
		System.out.println("Le factoriel est : " + fact);
	}
	
	public void maTableDeMulti()
	{
		for(int i = 1; i < 11; i++)
		{
			System.out.println(this.nb +" * "+ i +" = "+ this.nb * i + i);
		}
	}
	
	public void menu()
	{
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("|--------- MENU ---------|");
			System.out.println("| 1 - Saisir un nombre   |");
			System.out.println("| 2 - Afficher le nombre |");
			System.out.println("| 3 - Diviseurs	         |");
			System.out.println("| 4 - Factoriel          |");
			System.out.println("| 5 - Table multi        |");
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
				
				case 3 : this.mesDiviseurs();
				break;
				
				case 4 : this.monFactoriel();
				break;
				
				case 5 : this.maTableDeMulti();
				break;
			}
		}
		while (choix!=0);
	}
}

import java.util.Scanner;

public class Compte 
{
	//Attribut
	private int numero;
	private String nom, prenom;
	private float solde;
	
	//Constructeur
	public Compte()
	{
		this.numero = 0;
		this.nom = "";
		this.prenom = "";
		this.solde = 80;
	}
	
	//Methode
	public void consulter()
	{
		System.out.println("------ INFOS DU COMPTE ------");
		System.out.println("NUMERO : " + this.numero);
		System.out.println("NOM : " + this.nom);
		System.out.println("PRENOM : " + this.prenom);
		System.out.println("SOLDE : " + this.solde);
		System.out.println("_____________________________");
	}
	
	public void ouvrir()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom : ");
		this.nom = sc.next();
		System.out.println("Donner le prénom : ");
		this.prenom = sc.next();
		System.out.println("Donner le numero : ");
		this.numero = sc.nextInt();
	}
	
	public void deposer() 
	{
		float depot;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la somme à déposer");
		depot = sc.nextFloat();
		this.solde = this.solde + depot;
		System.out.println("Le new Solde est de : " + this.solde);
	}
	
	public void retirer()
	{
		float retire;
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner la somme à retirer");
		retire = sc.nextFloat();
		if (retire > this.solde)
		{
			System.out.println("Solde insufissant !!");
		}
		else
		{
			this.solde = this.solde - retire;
			System.out.println("Le new Solde est de : " + this.solde);
		}
	}
	
	public void gerer()
	{
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("|--------- MENU ---------|");
			System.out.println("|               	 |");
			System.out.println("| 1 - Ouvrir un compte   |");
			System.out.println("| 2 - Consulter          |");
			System.out.println("| 3 - Déposer une somme  |");
			System.out.println("| 4 - Retirer une somme  |");
			System.out.println("| 0 - Quitter            |");
			System.out.println("|________________________|");
			System.out.println("\t\t Votre choix -> ");
			choix = sc.nextInt();
			switch(choix)
			{
				case 1 : this.ouvrir();
				break;
				
				case 2 : this.consulter();
				break;
				
				case 3 : this.deposer();
				break;
				
				case 4 : this.retirer();
				break;
			}
		}
		while (choix != 0);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	//Getters and setters

}

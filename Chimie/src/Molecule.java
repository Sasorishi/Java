import java.util.Scanner;

public class Molecule 
{
	private String nom;
	private Atome lesAtomes[];
	private int nbAtomes;
	
	public Molecule(int taille)
	{
		this.nom = "";
		this.lesAtomes = new Atome[taille];
		this.nbAtomes = 0;
	}
	
	public void saisir()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le nom de la molécule : ");
		this.nom = sc.next();
	}
	
	public void afficher()
	{
		System.out.println("Le nom de la molécule est " + this.nom);
	}
	
	public void ajouter()
	{
		//On instancie un Atome
		Atome unAtome = new Atome();
		//Renseigner les attributs de cet atome
		unAtome.saisir();
		//On ajoute au tableau lesAtomes
		this.lesAtomes[this.nbAtomes] = unAtomes;
		this.nbAtomes ++;
		System.out.println("Atome ajoute avec succès");
	}
	
	public void formule()
	{
		System.out.println("Voici la formule : ");
		for (int i = 0; i < this.nbAtomes; i++)
		{
			System.out.println(this.lesAtomes[i])
		}
	}
	
	public void masseTotale()
	{
		int somme = 0;
		for(int = 0; i < this.nbAtomes; i++)
		{
			somme = this.lesAtomes[i] + getMasse(somme);
		}
		System.out.println("La masse : " + somme);
	}
	
	public void menu()
	{
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("___Molécule___");
			System.out.println("1 - Saisir");
			System.out.println("2 - Afficher");
			System.out.println("3 - Ajouter");
			System.out.println("4 - Formule");
			System.out.println("5 - Masse");
			System.out.println("0 - Quitter");
			System.out.println("\t\t Votre choix -> ");
			choix = sc.nextInt();	
		}
		
		switch(choix)
		{
			case 1:
				this.saisir();
			break;
			
			case 2:
				this.afficher();
			break;
			
			case 3:
				this.ajouter();
			break;
			
			case 4:
				this.formule();
			break;
			
			case 5:
				this.masse();
			break;
			
			case 6:
				this.quitter();
			break;
		}
	}
	while(choix!=0);
}

import java.util.Scanner;

public class Atome 
{
	private String nom, symbole;
	private int masse;
	
	public Atome ()
	{
		this.nom = "";
		this.symbole = "";
		this.masse = 0;
	}
	
	public void saisir()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Saissir le nom de l'atome : ");
		this.nom = sc.next();
	}
	
	public void afficher()
	{
		System.out.println("Le nom de l'atome est " + this.nom);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSymbole() {
		return symbole;
	}

	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}

	public int getMasse() {
		return masse;
	}

	public void setMasse(int masse) {
		this.masse = masse;
	}
	
	//Getters and setters
	
}

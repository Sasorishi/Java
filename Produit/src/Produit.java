import java.util.Scanner;

public class Produit 
{
	//Les attributs
	 private String ref, des;
	 private int qte;
	 private float prix;
	 
	//Les constructeurs
	 public Produit() 
	 {
		 this.ref = "";
		 this.des = "";
		 this.prix = 0;
		 this.qte = 0;
	 }
	
	//Les méthodes
	 public void afficher()
	 {
		 System.out.println("La référence : " + this.ref);
		 System.out.println("La désignation : " + this.des);
		 System.out.println("Le prix : " + this.prix);
		 System.out.println(" La quantité : " + this.qte);
	 }
	 
	 public void renseigner()
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Donner la réference");
		 this.ref = sc.next();
		 System.out.println("Donner la désignation");
		 this.des = sc.next();
		 System.out.println("Donner le prix");
		 this.prix = sc.nextFloat();
		 System.out.println("Donner la quantité");
		 this.qte = sc.nextInt();
	 }
	 
	 public static void main(String args[])
	 {
		 //Instanciation de la classe produit
		 Produit unProduit = new Produit();
		 //Appel des méthodes
		 unProduit.renseigner();
		 unProduit.afficher();
	 }
	 //Les getters et les Setters
}

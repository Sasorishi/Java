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
	
	//Les m�thodes
	 public void afficher()
	 {
		 System.out.println("La r�f�rence : " + this.ref);
		 System.out.println("La d�signation : " + this.des);
		 System.out.println("Le prix : " + this.prix);
		 System.out.println(" La quantit� : " + this.qte);
	 }
	 
	 public void renseigner()
	 {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Donner la r�ference");
		 this.ref = sc.next();
		 System.out.println("Donner la d�signation");
		 this.des = sc.next();
		 System.out.println("Donner le prix");
		 this.prix = sc.nextFloat();
		 System.out.println("Donner la quantit�");
		 this.qte = sc.nextInt();
	 }
	 
	 public static void main(String args[])
	 {
		 //Instanciation de la classe produit
		 Produit unProduit = new Produit();
		 //Appel des m�thodes
		 unProduit.renseigner();
		 unProduit.afficher();
	 }
	 //Les getters et les Setters
}

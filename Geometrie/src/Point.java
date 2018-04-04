import java.util.Scanner;

public class Point 
{
	private int x;
	private int y;
	
	public Point()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public void saissir()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Saissir une valeur X :");
		this.x = sc.nextInt();
		System.out.println("Saissir une valeur Y :");
		this.y = sc.nextInt();
	}
	
	public void afficher()
	{
		System.out.println("X = " + this.x);
		System.out.println("Y = " + this.y);
	}
	
	public void module()
	{
		float module;
		module = (float)Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2)); //sqrt = racine carré et pow = puissance
		System.out.println("La valeur du module est : " + module);
		return module;
	}
	
	public void angle()
	{
		float angle;
		angle = (float)Math.atan(this.x/this.y);
		System.out.println("La mesure de l'angle est : " + angle);
	}
	
	public void symetrie_axiale_x()
	{
		this.x = - this.x;
		System.out.println("La symetrie par rapport a OX est M ("+ this.x +", " + this.y +")");
	}
	
	public void symetrie_axiale_y()
	{
		this.y = - this.y;
		System.out.println("La symetrie par rapport a OY est M ("+ this.x +", " + this.y +")");
	}
	
	public void symetrie_origine()
	{
		this.x = - this.x;
		this.y = - this.y;
		System.out.println("La symetrie selon l'origine est M ("+ this.x +", "+ this.y +")");
	}
	
	public void translation_x()
	{
		int t;
		System.out.println("Donnez la mesure de la translation");
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		this.x = this.x + t;
		System.out.println("La translation par rapport a OX est M ("+ this.x +", "+ this.y +")");
	}
	
	public void translation_y()
	{
		int t;
		System.out.println("Donnez la mesure de la translation");
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		this.y = this.y + t;
		System.out.println("La translation par rapport a OY est M ("+ this.x +", "+ this.y +")");
	}
	
	public void dessiner()
	{
		char matrice[][] = new char[50][50];
		int dx = this.x;
		int dy = this.y;
		for (int i = 0; i < 50; i++)
		{
			for (int j = 0; j < 50; j++)
			{
				matrice[i][j];
			}
		}
		
		for (int i = 0; i < 50; i++)
		{
			matrice[24][i] = '*';
		}
		
		for (int j = 0; j < 50; j++)
		{
			matrice[j][24] = '*';
		}
		
		if (dx < 0)
		{
			dx = 25 - dx;
		}
		
		else if (dx < 25)
		{
			dx = 25 - dx;
		}
		
		else
		{
			dx = dx % 25;
		}
	}
	
	public void menu()
	{
		int choix = 0;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("|--------- MENU ---------|");
			System.out.println("| 1 - Saisir		     |");
			System.out.println("| 2 - Module             |");
			System.out.println("| 3 - Angle 	         |");
			System.out.println("| 4 - Symetrie axiale X  |");
			System.out.println("| 5 - Symetrie axiale Y  |");
			System.out.println("| 6 - Translation X      |");
			System.out.println("| 7 - Translation Y      |");
			System.out.println("| 8 - Dessiner           |");
			System.out.println("| 0 - Quitter            |");
			System.out.println("|________________________|");
			System.out.println("\t\t Votre choix -> ");
			choix = sc.nextInt();
			
			switch(choix)
			{
				case 1:
					this.saissir();
				break;
				
				case 2:
					this.module();
				break;
				
				case 3:
					this.angle();
				break;
				
				case 4:
					this.symetrie_axiale_x();
				break;
				
				case 5:
					this.symetrie_axiale_y();
				break;
				
				case 6:
					this.translation_x();
				break;
				
				case 7:
					this.translation_y();
				break;
				
				case 8:
					this.dessiner();
				break;
			}
		}
		while(choix!=0);
	}
}

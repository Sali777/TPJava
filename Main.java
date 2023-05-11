// TP1 : Programmation Java
// Mouadh Ben Salah 1TA1, Groupe 1

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	
	//Declaration de Cercle
	
	Cercle C1 = new Cercle(5, 3, 4);
	
	//Declaration de Produit et affichage
		
    Produit yaourtt = new Produit("Yaourt", 0.5f);
    System.out.println("Nom du produit : " + yaourtt.nom + " et son prix : " + yaourtt.prix);
    
    //Panier et remplissage
    
    Produit yaourt = new Produit("Yaourt", 0.5f);
    Produit lait = new Produit("Lait", 1f);
    Panier monPanier = new Panier();
    monPanier.remplirPanier(yaourt.getPrix(), 6);
    monPanier.remplirPanier(lait.getPrix(), 3);
    System.out.println("Nombre de produits dans le panier : " + monPanier.getNbreProduits());
    System.out.println("Montant total du panier : " + monPanier.getMontantPanier());



	}
}

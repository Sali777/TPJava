public class Produit {
  public String nom;
  public float prix;

  public Produit(String nomProd, float prixProd) {
    nom = nomProd;
    prix = prixProd;
  }

  public String getNom() {
    return nom;
  }

  public float getPrix() {
    return prix;
  }

  public static void main(String[] args) {
    Produit yaourt = new Produit("Yaourt", 0.5f);
    System.out.println("Nom du produit : " + yaourt.nom + " et son prix : " + yaourt.prix);
  }
}

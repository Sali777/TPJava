public class Panier {
  private int nbreProduits;
  private float montantPanier;

  public int getNbreProduits() {
    return nbreProduits;
  }

  public float getMontantPanier() {
    return montantPanier;
  }

  public void remplirPanier(float prixProd, int quantite) {
    nbreProduits += quantite;
    montantPanier += prixProd * quantite;
  }
}

public class Crud {

    // Attributs
    private String nomProduit = "";
    private int quantite = 0;
    private double prix = 0.0;

    // Constructeur d'initialisation
    public Crud(String pNomProduit, int pQuantite, double pPrix) {
        nomProduit = pNomProduit;
        quantite = pQuantite;
        prix = pPrix;
        System.out.println("nomProduit :");
        String nomProduit= sc.nextLine();
        sc.nextLine();


        System.out.println("quantite ;");
        int quantite = sc.nextInt();

        System.out.println("prix :");
        double prix =sc.nextDouble();

        Produit (p) = new Produit(nomProduit,quantite,prix);
        list.add(p);

        System.out.println("Produit ajoute !");
        break;


    }

    // 2- Modifier : une méthode ModifierProduit(String pNomProduit,int
    // pQuantite,double pPrix) qui ne retourne rien (void)

    // 3- Supprimer: une méthode supprimerProduit() qui ne retourne rien(void)

    // 4- Afficher: une méthode afficherProduit() qui ne retourne rien(void)

}

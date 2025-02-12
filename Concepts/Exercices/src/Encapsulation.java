public class Encapsulation {
    static class Voiture {
        private String modele;
        private String couleur;
        private int prix;

        public Voiture(String modeleInitiale, String couleurInitiale, int prixInitiale) {
            this.modele = modeleInitiale;
            this.couleur = couleurInitiale;
            this.prix = prixInitiale;
        }

        public String getModele () {
            return modele;
        }

        public String getCouleur () {
            return couleur;
        }

        public int getPrix () {
            return prix;
        }

        public void setModele (String modele) {
            this.modele = modele;
        }

        public void setCouleur (String couleur) {
            this.couleur = couleur;
        }

        public void setPrix (int prix) {
            this.prix = Math.max(prix, 40000);
        }

        public void afficherDetails () {
            System.out.println("Model : " + getModele());
            System.out.println("Couleur : " + getCouleur());
            System.out.println("Prix : " + getPrix());
        }
    }

    public static void main(String[] args) {
        Voiture delorean = new Voiture("De Lorean", "Gris", 550777);

        delorean.afficherDetails();

        delorean.setPrix(100000);
        System.out.println("Nouveau prix : " + delorean.getPrix());

    }
}

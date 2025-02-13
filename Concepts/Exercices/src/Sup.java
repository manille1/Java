public class Sup {
    public class Ex6 {
        public static void main(String[] args) {
            Fusee ariane6 = new Ariane6("Ariane 6", 1000); // on initialise la fusee ariane6
            Ariane6Lancement ariane6Lancement = new Ariane6Lancement(); // on initialise le lancement de la fusee ariane6
            ariane6Lancement.lancer(ariane6); // on lance la fusee ariane6
        }
    }
    
    public class Fusee {
        int poids;
        String nom;
    
        public Fusee(String nom, int poids) {
            this.nom = nom;
            this.poids = poids;
        }
    
        protected void lancer() {
            System.out.println("Preparation du lancement de la fusee: " + this.nom); 
        }
    }
    
    
    public class Ariane6 extends Fusee {
    
        public Ariane6(String nom, int poids) {
            super(nom, poids);
        }
        protected void lancer() {
            super.lancer();
            System.out.println("Lancement de la fusee: " + this.nom);
            System.out.println("Séparation des étages de la fusee: " + this.nom);
        }
        
    }
    
    
    public class Ariane6Lancement {
        public void lancer(Fusee fusee) {
            fusee.lancer();
        }
    }
}

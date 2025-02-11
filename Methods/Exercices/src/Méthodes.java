public class Méthodes {
    public static void main(String[] args) {
        Calculatrice c = new Calculatrice();

        double res = c.effectuerOperation("+", 4, 5);
        System.out.println(res);

        Compteur compte = new Compteur();
        compte.incrementer(2);
        System.out.println(compte.afficherCompteur());
        compte.incrementer(8);
        System.out.println(compte.afficherCompteur());

        // Personne p = new Personne();

        // System.out.println("Nom : " + p.afficherNom());
        // //p.changerNom("bingus");
        // System.out.println("Nouveau Nom : " + p.afficherNom());
        // System.out.println("Age : " + p.afficherAge());
        // System.out.println("Adresse : " + p.afficherAdresse());
    }
}

class Compteur {
    static int variable = 0;

    public int incrementer (int valeur){
        return variable =+ valeur;
    }

    static String afficherCompteur () {
        return "Compteur : " + variable;
    }
}

class Calculatrice {
    public double effectuerOperation(String operation, double a, double b){
        double res;
        String easterEgg = "LOL ! On yvon -> la rigolade 🤪🤯";

        switch (operation) {
            case "+" :
                return res = add(a, b);
            case "-" :
                return res = sous(a, b);
            case "*" :
                return res = multi(a, b);
            case "/" :
                return res = divid(a, b);
            case "%" :
                throw new EasterEggException(easterEgg);
            default:
                return res = 0;
        }
    }



    int add(int a, int b){
        return a + b;
    }
    double add(double a, double b){
        return a + b;
    }


    int sous(int a, int b){
        return a - b;
    }
    double sous(double a, double b){
        return a - b;
    }


    int multi(int a, int b){
        return a * b;
    }
    double multi(double a, double b){
        return a * b;
    }


    int divid(int a, int b){
        return a / b;
    }
    double divid(double a, double b){
        return a / b;
    }
}

class EasterEggException extends RuntimeException {
    public EasterEggException(String message) {
        super(message);
    }
}

class Personne {
    String nom = "roger";
    int age = 12;
    String adresse = "France";


    // ✅ Méthode publique accessible partout
    public String afficherNom (){
        return nom;
    }

    // ❌ Méthode privée (non accessible en dehors de cette classe)
    private void changerNom (String nom){
        this.nom = nom;
    }

    // 🔒 Méthode protégée (accessible dans le même package et par héritage)
    protected int afficherAge (){
        return age;
    }

    // 🏠 Méthode default (accessible seulement dans le même package)
    String afficherAdresse (){
        return adresse;
    }

}
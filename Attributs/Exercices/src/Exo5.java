public class Exo5 {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota");  
    }
}

class Voiture {
    private String marque; 
    public Voiture(String marque) {  
        this.marque = marque;  
        System.out.println("Marque de la voiture: " + marque);  
    }

}

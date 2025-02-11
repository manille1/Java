public class Exo2 {
    public static class Plant {
        public String name = "Monstera deliciosa";
        public String color = "green";
    }
   
    public static void main(String[] args) {
        Plant p = new Plant();
    
        System.out.println("Nom :" + p.name + " Couleur :" + p.color);

        p.name = "Alocasia";
        p.color = "Dark green";

        System.out.println("Nom :" + p.name + " Couleur :" + p.color);
    }
}

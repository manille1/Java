import java.util.ArrayList;

public class Over {
    public static void main(String[] args) {
        PorteAvion DeGaule = new PorteAvion();
        DeGaule.gererAvion();

    }

    static class PorteAvion {
        
        AvionDeChasse a = new AvionDeChasse("f-16");
        AvionDeTransport b = new AvionDeTransport("A380");

        public void gererAvion () {
            ArrayList<String> liste = new ArrayList<>();
            // Ajouter des éléments
            liste.add(a.name);
            liste.add(b.name);

            //System.out.println("Liste : " + liste);

            a.decoller();
            System.out.println("Avion " + liste.get(0) + " à décoller !\n");

            b.decoller();
            System.out.println("Avion " + liste.get(1) + " à décoller !\n");
        }
    }
}

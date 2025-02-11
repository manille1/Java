public class Exo4 {
    public static class Compte {
        private static int nombreDeComptes = 0;

        public Compte() {
            nombreDeComptes++;
        }

        public static int getNombreDeComptes() {
            return nombreDeComptes;
        }
    }
    public static void main(String[] args) throws Exception {
        Compte compte1 = new Compte();
        Compte compte2 = new Compte();
        System.out.println(Compte.getNombreDeComptes());

        Compte compte3 = new Compte();
        Compte compte4 = new Compte();
        System.out.println(Compte.getNombreDeComptes());

    }
}

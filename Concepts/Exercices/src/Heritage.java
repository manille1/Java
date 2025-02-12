public class Heritage {
    public static void main(String[] args) throws Exception {
        Mammiferes Cid = new Mammiferes();

        Cid.marcher();
        Cid.seDeplacer();

        Reptiles gekko = new Reptiles();

        gekko.ramper();
        gekko.seDeplacer();

        Oiseau nahiko = new Oiseau();

        nahiko.voler();
        nahiko.seDeplacer();
    }


    abstract  static class Animal {
        String nom;

        abstract void seDeplacer();
    }

    static class Mammiferes extends Animal {
        public void seDeplacer() {
            System.out.println("(je marche)");
        }

        public void marcher() {
            System.out.println("Tap Tap");
        }
    }

    static class Reptiles extends Animal {
        public void seDeplacer() {
            System.out.println("(je rempe)");
        }

        public void ramper() {
            System.out.println("Shhhhhh");
        }
    }

    static class Oiseau extends Animal {
        public void seDeplacer() {
            System.out.println("(je vole)");
        }

        public void voler() {
            System.out.println("Flap Flap");
        }
    }
}

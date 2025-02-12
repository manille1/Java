public class Abstraction {
    public static void main(String[] args) {
        Cercle Terre = new Cercle();
        System.out.println("Surface de la Terre : " + Terre.calculerSurface());

        Rectangle Lingot = new Rectangle();
        System.out.println("Surface du Lingot d'or : " + Lingot.calculerSurface());

    }


    abstract static class Forme {
        abstract double calculerSurface();
    }

    static class Cercle extends Forme {
        double rayon = 2;
        
        @Override
        double calculerSurface(){
            double res = Math.PI * rayon * rayon;
            return res; 
        }
    }

    static class Rectangle extends Forme {
        double largeur = 8;
        double hauteur = 4;

        @Override
        double calculerSurface(){
            double res = largeur * hauteur;
            return res; 
        }
    }
}

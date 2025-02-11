public class Exo3 {
    static class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    static class Chien extends Animal{
        public Chien(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {
        Chien c = new Chien("Moustache");

        
        System.out.println("Nom : " + c.name);
    }
}

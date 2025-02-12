public class Polymorphisme {
    public static void main(String[] args) {
        Enseignant cyril = new Enseignant();
        System.out.println("Cyril : ");
        cyril.travailler();

        Directeur marin = new Directeur();
        System.out.println("Marin : ");
        marin.travailler();

        PersonnelAdministratif cecile = new PersonnelAdministratif();
        System.out.println("Cécile : ");
        cecile.travailler();

    }

    static class Employee {
        String nom;

        void travailler(){
            System.out.println("Je travaille dans l'école");
        };
    }

    static class Enseignant extends Employee{
        @Override
        void travailler(){
            System.out.println("J'enseigne");
        }
    }

    static class Directeur extends Employee{
        @Override
        void travailler(){
            System.out.println("Je gère l'école");
        }
    }

    static class PersonnelAdministratif extends Employee{
        @Override
        void travailler(){
            System.out.println("Je suis l'administartion !");
        }
    }
}

class Avion {
    public void decoller(){
        System.out.println("L'avion décoller");
    }
}

class AvionDeChasse extends Avion {
    String name;

    public AvionDeChasse (String uniqueName){
        this.name = uniqueName;
    }

    @Override
    public void decoller(){
        System.out.println("Décollage de l'avion de chasse :");
        System.out.println("   Atteindre 80km/h");
        try {
            Thread.sleep(1000); // Pause de 2 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Levez le nez de l'avion");
        System.out.println("   Ranger les roues");
        System.out.println("   Vérifiez les paramètres");
        try {
            Thread.sleep(2000); // Pause de 2 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class AvionDeTransport extends Avion {
    String name;

    public AvionDeTransport (String uniqueName){
        this.name = uniqueName;
    }

    @Override
    public void decoller(){
        
        System.out.println("Décollage de l'avion de transport :");
        System.out.println("   Atteindre 120km/h");
        try {
            Thread.sleep(1000); // Pause de 2 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   Incliner les ailles");
        System.out.println("   Ranger les roues");
        System.out.println("   Se stabiliser et vérifiez les marchandises");
        try {
            Thread.sleep(3000); // Pause de 2 secondes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// static class AvionSpecial extends Avion {
    //     String name;

    //     public AvionSpecial (String uniqueName){
    //         this.name = uniqueName;
    //     }

    //     @Override
    //     public void decoller(){
    //         System.out.println("Atteindre 120km/h");
    //         System.out.println("Incliner les ailles");
    //         System.out.println("Ranger les roues");
    //         System.out.println("Se stabiliser une fois dans l'espace");
    //     }
    // }

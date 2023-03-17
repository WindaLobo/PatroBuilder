import Marcas.Marcas;

public class Main {
    static IFabrica Fabrica;

    public static void main(String[] args) throws Exception {
        //Builder
        System.out.println("Builder : ");
        System.out.println("Citroen : ");
        FabricaCitroen coche = new FabricaCitroen();
        System.out.println(" El coche es : \n " + coche.fabricar());
        System.out.println("Toyota : ");
        FabricaToyota coche2 = new FabricaToyota();
        System.out.println(" El coche es : \n " + coche2.fabricar());

        //Patron Factory
        System.out.println("Con Patron  Factory");
        Fabrica = FactoryCoche.getFabrica(Marcas.Citroen);
        System.out.println(Fabrica.fabricar());

        Fabrica = FactoryCoche.getFabrica(Marcas.Toyota);
        System.out.println(Fabrica.fabricar());
    }

}





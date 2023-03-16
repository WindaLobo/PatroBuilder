import Tipos.TipoDeEnvio;
import Tipos.TipoDeMasa;
import Tipos.TamañoPizza;
import Tipos.TipoDeSalsa;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n *** Objecto sin builder ****  \n");
        Pizza aSuMedida = new Pizza(TipoDeMasa.fina, true, TamañoPizza.familiar, true, TipoDeSalsa.salsaSinGluteo, true, false, true, false, true, true, TipoDeEnvio.paraLlevar);
        System.out.println(aSuMedida.toString());

        Pizza pizzaBasica = new BuilderPizzas()
                .build();
        System.out.println(" *** Objecto con builder ***  \n");

        System.out.println("Pizza básica :\n" + pizzaBasica.toString());

        Pizza pizzaCarbonara = new BuilderPizzas()
                .setSalsa(TipoDeSalsa.salsaDeBarbacoa)
                .setCebolla()
                .setSize(TamañoPizza.familiar)
                .setExtraQueso()
                .build();

        System.out.println("Pizza carbonara :\n" + pizzaCarbonara.toString());

        Pizza pizzaBacon = new BuilderPizzas()
                .setSalsa(TipoDeSalsa.salsaDeBarbacoa)
                .setCebolla()
                .setExtraQueso()
                .setSize(TamañoPizza.familiar)
                .setJamon()
                .setRecogida(TipoDeEnvio.paraLlevar)
                .build();

        System.out.println("Pizza bacon :\n" + pizzaBacon.toString());
    }

}


import Tipos.TipoDeMasa;
import Tipos.TipoDeSalsa;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

class Telepizza  implements IPizzeria {

    private final int minutosPreparacion = 1;
    private Pizza pizzaEnPreparacion;
    private LocalDateTime inicioPreparacion;
    @Override
    public String prepararPizza() {

        pizzaEnPreparacion = new BuilderPizzas()
                .setMasa(TipoDeMasa.fina)
                .setCebolla()
                .setJamon()
                .setSalsa(TipoDeSalsa.salsaDeTomate)
                .setChampiñones()
                .setExtraQueso()
                .setMensajeCaja("Gracias por confiar en telepizza")
                .build();

        inicioPreparacion = LocalDateTime.now();

        return minutosPreparacion + " minutos";
    }

    @Override
    public Pizza pizzaLista() {

        LocalDateTime horaFinalizacion = inicioPreparacion.plus(Duration.of(minutosPreparacion, ChronoUnit.MINUTES));
        LocalDateTime horaActual = LocalDateTime.now();

        if(horaActual.isBefore(horaFinalizacion)){
            return null;
        }

        return pizzaEnPreparacion;
    }
}
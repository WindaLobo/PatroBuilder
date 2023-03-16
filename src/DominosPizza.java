import Tipos.TipoDeEnvio;
import Tipos.TipoDeMasa;
import Tipos.TipoDeSalsa;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DominosPizza implements IPizzeria{
    private final int minutosPreparacion = 2;
    private Pizza pizzaEnPreparacion;
    private LocalDateTime inicioPreparacion;
    @Override
    public String prepararPizza() {
        pizzaEnPreparacion = new BuilderPizzas()
                .setMasa(TipoDeMasa.integral)
                .setCebolla()
                .setJamon()
                .setSalsa(TipoDeSalsa.salsaSinGluteo)
                .setChampiñones()
                .setPiña()
                .setRecojida(TipoDeEnvio.tienda)
                .setMensajeCaja("Gracias por confiar en DominosPizza")
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

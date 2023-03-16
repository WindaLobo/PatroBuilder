import Tipos.TipoDeEnvio;
import Tipos.TipoDeMasa;
import Tipos.TamañoPizza;
import Tipos.TipoDeSalsa;

public class BuilderPizzas {

    private Pizza _pizza;

    public BuilderPizzas() {
        _pizza = new Pizza();
    }

    public BuilderPizzas setMasa(TipoDeMasa tipoMasa) {
        _pizza.setMasa(tipoMasa);
        return this;
    }

    public BuilderPizzas setRelleno() {
        _pizza.setRelleno(true);
        return this;
    }

    public BuilderPizzas setSalsa(TipoDeSalsa salsa) {
        _pizza.setSalsa(true);
        _pizza.setTipoDeSalsa(salsa);
        return this;
    }

    public BuilderPizzas setSize(TamañoPizza size) {
        _pizza.setSize(size);
        return this;
    }

    public BuilderPizzas setTipoDeSalsa(TipoDeSalsa tipoSalsa) {
        _pizza.setTipoDeSalsa(tipoSalsa);
        return this;
    }

    public BuilderPizzas setCebolla() {
        _pizza.setCebolla(true);
        return this;
    }

    public BuilderPizzas setSinGluten() {
        _pizza.setSinGluten(true);
        return this;
    }

    public BuilderPizzas setExtraQueso() {
        _pizza.setExtraQueso(true);
        return this;
    }

    public BuilderPizzas setPiña() {
        _pizza.setPiña(true);
        return this;
    }

    public BuilderPizzas setChampiñones() {
        _pizza.setChampiñones(true);
        return this;
    }

    public BuilderPizzas setJamon() {
        _pizza.setJamon(true);
        return this;
    }

    public BuilderPizzas setRecojida(TipoDeEnvio recojida) {
        _pizza.setRecojida(recojida);
        return this;
    }
    public BuilderPizzas setMensajeCaja(String mensajeCaja) {
        _pizza.setMensajeCaja(mensajeCaja);
        return this;
    }


    public Pizza build() {

        return this._pizza;
    }


}
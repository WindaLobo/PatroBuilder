import Tipos.TipoDeEnvio;
import Tipos.TipoDeMasa;
import Tipos.TamañoPizza;
import Tipos.TipoDeSalsa;

public class Pizza {
    private TipoDeMasa masa;
    private boolean relleno;
    private TamañoPizza size;
    private boolean salsa;
    private TipoDeSalsa tipoDeSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean champiñones;
    private boolean jamon;
    private TipoDeEnvio recojida;

    public Pizza(TipoDeMasa masa, boolean relleno, TamañoPizza size, boolean salsa, TipoDeSalsa tipoDeSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean piña, boolean champiñones, boolean jamon, TipoDeEnvio recojida) {
        this.masa = masa;
        this.relleno = relleno;
        this.size = size;
        this.salsa = salsa;
        this.tipoDeSalsa = tipoDeSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.champiñones = champiñones;
        this.jamon = jamon;
        this.recojida = recojida;
    }

    public Pizza() {
        masa = TipoDeMasa.normal;
        tipoDeSalsa = TipoDeSalsa.salsaDeTomate;
        size = TamañoPizza.pequena;
        recojida = TipoDeEnvio.tienda;

    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public TipoDeMasa getMasa() {
        return masa;
    }

    public void setMasa(TipoDeMasa masa) {
        this.masa = masa;
    }

    public TipoDeEnvio getRecojida() {
        return recojida;
    }

    public void setRecojida(TipoDeEnvio recojida) {
        this.recojida = recojida;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public TipoDeSalsa getTipoDeSalsa() {
        return tipoDeSalsa;
    }

    public void setTipoDeSalsa(TipoDeSalsa tipoDeSalsa) {
        this.tipoDeSalsa = tipoDeSalsa;
    }

    public TamañoPizza getSize() {
        return size;
    }

    public void setSize(TamañoPizza size) {
        this.size = size;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "tipoDeMasa : " + masa + "\n" +
                "relleno : " + relleno + "\n" +
                "size : " + size + "\n" +
                "salsa : " + salsa + "\n" +
                "Tipo de salsa : " + tipoDeSalsa + "\n" +
                "cebolla : " + cebolla + "\n" +
                "sinGluten : " + sinGluten + "\n" +
                "extraQueso : " + extraQueso + "\n" +
                "piña : " + piña + "\n" +
                "champiñones : " + champiñones + "\n" +
                "jamon : " + jamon + "\n" +
                "Tipo de recojida : " + recojida + "\n";
    }
}

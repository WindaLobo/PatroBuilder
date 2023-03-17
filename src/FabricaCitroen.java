public class FabricaCitroen implements IFabrica {
    private Coche coche;

    @Override
    public Coche fabricar() {
        coche = new BuilderCoche()
          .setTapizadoDeCuero()
          .setAno(2022)
          .setMarca("Citroen")
          .setModelo("JUMPY FURGÓN")
          .setColor("negro")
          .build();
        return coche;
    }
}

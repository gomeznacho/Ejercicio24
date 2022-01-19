public class CocheAnfibio extends Coche{
    int aletas;

    public CocheAnfibio(int aletas){
        super("Lotus", "Esprit");
        this.aletas = aletas;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }


    @Override
    public void acelerar() {
      this.setVelocidad(this.getVelocidad()+5);
    }
}

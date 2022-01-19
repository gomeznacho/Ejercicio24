public class CocheVolador extends Coche{
    int alas;

    public CocheVolador(int alas){
        super("nimbus", "2000");
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public void acelerar(){
       this.setVelocidad(this.getVelocidad()+20);
    }


}

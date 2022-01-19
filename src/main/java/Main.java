public class Main {
    public static void main(String[] args) {
        CocheVolador coche1 = new CocheVolador(5);
        CocheAnfibio coche2 = new CocheAnfibio(3);

        System.out.println(coche1.getMarca()+" "+  coche1.getModelo()+" alas: "+coche1.getAlas() );
        System.out.println(coche2.getMarca() +" "+ coche2.getModelo()+" aletas: "+coche2.getAletas() );

        coche1.setVelocidad(120);
        coche2.setVelocidad(80);
        System.out.println("velocidad antes de acelerar: " + coche1.getVelocidad()+ " " + coche2.getVelocidad());
        coche1.acelerar();
        coche2.acelerar();
        System.out.println("velocidad después de acelerar: " +coche1.getVelocidad()+ " " + coche2.getVelocidad());
    }
}

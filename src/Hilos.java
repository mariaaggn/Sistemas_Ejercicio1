public class Hilos implements Runnable {
    private final char caracter;
    private final int repeticion;

    public Hilos(char caracter, int repeticion) {
        this.caracter = caracter;
        this.repeticion = repeticion;
    }

    @Override
    public void run() {
        for(int i= 1; i <= repeticion; i++ ) {
            System.out.println("Hilo " +caracter + " corriendo en la vuelta "+ i);
        }
    }
}

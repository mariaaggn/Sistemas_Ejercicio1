public class Test {
    public static void main(String[] args) {
        Hilos hilo1 = new Hilos('a',4);
        Hilos hilos2 = new Hilos('b',4);
        Hilos hilos3 = new Hilos('c',4);

        //Los hilos no son exactamente runnables asi que los tengo que pasar como hilos
        Thread t1 = new Thread(hilo1);
        Thread t2 = new Thread(hilos2);
        Thread t3 = new Thread(hilos3);
        t1.start();
        t2.start();
        t3.start();
    }
}

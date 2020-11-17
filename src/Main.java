public class Main {


    public static final int NUMBER_OF_THREADS = 3;

    public static void main(String[] args) {


        Thread[] threads = new Thread[NUMBER_OF_THREADS];
        Tiradas tiradas = new Tiradas();



        for (int i = 0; i < NUMBER_OF_THREADS; i++) {

            threads[i] = new Thread(tiradas);

        }

        for (int i = 0; i < NUMBER_OF_THREADS; i++) {
            threads[i].start();

        }


        tiradas.imprimir();

    }
}

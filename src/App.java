class Processor extends Thread {

    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Processing...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }

    public void shutDown() {
        running = false;
    }
}

public class App {

    public static void main(String[] args) throws InterruptedException {
        Processor processor1 = new Processor();
        processor1.start();

        Thread.sleep(1000);

        processor1.shutDown();
    }

}
public class RabbitAndTurtle extends Thread {
    public static void main(String[] args) {
        AnimalThread thread = new AnimalThread("Черепаха", Thread.MIN_PRIORITY);
        AnimalThread thread1 = new AnimalThread("Кролик", Thread.MAX_PRIORITY);
        thread.start();
        thread1.start();
    }
}

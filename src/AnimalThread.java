public class AnimalThread extends Thread {
    String name;
    private int distanceMeters;
    int priority;

    AnimalThread(String name, int priority) {
        this.name = name;
        this.priority = priority;
        distanceMeters = 0;
        setPriority(priority);
    }

    public void run() {
        while (true) {
            distanceMeters++;
            System.out.println(name + " переместился на " + distanceMeters + " м");
        }
    }
}

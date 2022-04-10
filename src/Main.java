public class Main {

    public static void main(String[] args) throws InterruptedException{

        SomeThread s = new SomeThread();
        s.start();
        s.sleep(100);
        s.interrupt();
        s.join();
        System.out.println("Now I can go to sleep");
    }
}

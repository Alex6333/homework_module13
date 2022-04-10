public class SomeThread extends Thread{

    public void run(){
        while(!isInterrupted()){
            System.out.println("I'm doing my homework...");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("Finished");
    }
}

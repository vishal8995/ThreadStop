public class MyThread implements Runnable {

    Thread t;
    MyThread(){
        t = new Thread(this);
        System.out.println("New Thread: "+t);
        t.start();
    }

    @Override
    public void run() {

        while(!Thread.interrupted()){
            System.out.println("Thread Running ...");
        }
        System.out.println("Thread Stooped.");
    }
}

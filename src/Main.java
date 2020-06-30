public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        try{
            Thread.sleep(1000);

            t1.t.interrupt();

            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Exiting Main !!");
    }
}

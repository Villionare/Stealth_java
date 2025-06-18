package Thread;

public class RunnableInterface implements Runnable {
    @Override
    public void run(){
        String str = "this is a thread running using run method created by Runnable Interface";
        System.out.println(str);
    }

    public static void main(String[] args) {
        RunnableInterface r1 = new RunnableInterface();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}

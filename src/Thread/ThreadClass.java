package Thread;

//we can create threads using two ways:
//Extending to thread class
//implementing to Runnable Interface

public class ThreadClass extends Thread{
        @Override
        public void run(){
                String str = "this thread is running in the thread class";
                System.out.println(str);
        }

        public static void main(String[] args) {
                ThreadClass c1 = new ThreadClass();
                c1.start();
        }
}

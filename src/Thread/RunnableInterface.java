package Thread;

public class RunnableInterface {
    Runnable thread0 = () -> {

        for(int i = 0; i<=5; i++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(i == 5){
            System.out.println("Times up!");
            System.exit(0);
            //Program will exit with the status code 0
        }};

    };
}

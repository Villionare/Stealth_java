package AlarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;


public class AlarmClock implements Runnable{
    private final LocalTime AlarmTime;
    private final String wavFilePath;

    public AlarmClock(LocalTime alarmTime, String wavFilePath) {
        this.AlarmTime = alarmTime;
        this.wavFilePath = wavFilePath;
    }

    @Override
    public void run(){
        while (LocalTime.now().isBefore(AlarmTime)){
            try {
                Thread.sleep(1000);
                int hours = LocalTime.now().getHour();
                int minutes = LocalTime.now().getMinute();
                int Seconds = LocalTime.now().getSecond();
                System.out.printf("\r%02d:%02d:%02d",hours,minutes,Seconds);

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("\n*Alarm Noises*");
        playWav(wavFilePath);

    }

    private void playWav(String wavFilePath){
        File audioFile = new File(wavFilePath);

    try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        clip.drain();

        Thread.sleep(5000);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
        e.printStackTrace();
    }
}
}

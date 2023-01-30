package utils;

public class Timer implements Runnable {
	
    int longTime = 300;

    public void run()
    {
        try {
            for (int i = longTime; i > 0; i--) {
                Frames.time.setText("SÜRE: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Hata");
        }
        System.exit(0);


    }

}

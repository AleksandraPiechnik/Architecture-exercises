package task3.telemetry;


public class Speedometer implements Runnable {

    private double velocity;

    public synchronized void setNewVelocity(double velocity) {
        this.velocity = velocity;
    }

    public synchronized double getVelocity() {
        return velocity;
    }

    @Override
    public void run() {
        while (true) {
            setNewVelocity(++velocity%140);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

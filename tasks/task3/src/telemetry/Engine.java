package task3.telemetry;


public class Engine implements Runnable{

    private double temperature = 0.;

    public synchronized void setNewTemperature(double temperature) {
        this.temperature = temperature;
    }

    public synchronized double  getTemperature() {
        return temperature;
    }

    @Override
    public void run() {
        while (true) {
            setNewTemperature(++temperature%200);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

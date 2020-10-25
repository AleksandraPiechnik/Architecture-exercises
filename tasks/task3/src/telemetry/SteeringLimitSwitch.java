package task3.telemetry;


public class SteeringLimitSwitch implements Runnable {

    private double steeringAngle;

    public synchronized void setNewSteeringAngle(double steeringAngle) {
        this.steeringAngle = steeringAngle;
    }

    public  synchronized double getSteeringAngle() {
        return steeringAngle;
    }

    @Override
    public void run() {
        while(true) {
            setNewSteeringAngle(++this.steeringAngle%360);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

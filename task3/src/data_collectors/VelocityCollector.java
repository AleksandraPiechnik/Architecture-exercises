package task3.data_collectors;

import task3.telemetry.Speedometer;
import java.time.LocalTime;

public class VelocityCollector implements Runnable{

    private Speedometer speedometer;

    public VelocityCollector(Speedometer speedometer) {
        this.speedometer = speedometer;
    }

    @Override
    public void run() {
        displayVelocity();
    }

    private void displayVelocity() {
        System.out.println("["+ LocalTime.now()+"] car_velocity: " + speedometer.getVelocity());
    }
}

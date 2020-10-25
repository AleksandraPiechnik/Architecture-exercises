package task3.data_collectors;

import task3.telemetry.SteeringLimitSwitch;
import java.time.LocalTime;

public class SteeringAngleCollector implements Runnable {

    private SteeringLimitSwitch steeringLimitSwitch;

    public SteeringAngleCollector(SteeringLimitSwitch steeringLimitSwitch) {
        this.steeringLimitSwitch = steeringLimitSwitch;
    }

    @Override
    public void run() {
        displaySteeringAngle();
    }

    private void displaySteeringAngle() {
        System.out.println("["+ LocalTime.now()+"] steering_angle: " + steeringLimitSwitch.getSteeringAngle());
    }
}

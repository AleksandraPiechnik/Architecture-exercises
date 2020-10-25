package task3;

import task3.telemetry.Engine;
import task3.telemetry.Speedometer;
import task3.telemetry.SteeringLimitSwitch;


public class Car {
    private Engine engine;
    private Speedometer speedometer;
    private SteeringLimitSwitch steeringLimitSwitch;

    public Car() {
        this.engine = new Engine();
        this.speedometer = new Speedometer();
        this.steeringLimitSwitch = new SteeringLimitSwitch();
    }

    public void ride(){
        new Thread(engine).start();
        new Thread(speedometer).start();
        new Thread(steeringLimitSwitch).start();
    }

    public Engine getEngine() {
        return engine;
    }

    public Speedometer getSpeedometer() {
        return speedometer;
    }

    public SteeringLimitSwitch getSteeringLimitSwitch() {
        return steeringLimitSwitch;
    }
}

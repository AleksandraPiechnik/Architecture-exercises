package task3;

import task3.data_collectors.EngineTemperatureCollector;
import task3.data_collectors.SteeringAngleCollector;
import task3.data_collectors.VelocityCollector;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class OnBoardComputer {


    private int VELOCITY_UPDATE_INTERVAL = 1; // how often values for logs are sampled in seconds
    private int ENGINE_TEMPERATURE_UPDATE_INTERVAL = 4;
    private int STEERING_ANGLE_UPDATE_INTERVAL = 6;
    private Car car;
    private ScheduledExecutorService scheduler;

    // collectors collect data and display them in logs
    private EngineTemperatureCollector engineTemperatureCollector;
    private SteeringAngleCollector steeringAngleCollector;
    private VelocityCollector velocityCollector;

    public OnBoardComputer(Car car) {
        this.car = car;
        scheduler = Executors.newScheduledThreadPool(3);
    }

    public void startRoutine(){
        initDataCollectors();
        assignTasksToScheduler();
    }

    private void initDataCollectors() {
        engineTemperatureCollector = new EngineTemperatureCollector(car.getEngine());
        steeringAngleCollector = new SteeringAngleCollector(car.getSteeringLimitSwitch());
        velocityCollector = new VelocityCollector(car.getSpeedometer());
    }

    private void assignTasksToScheduler() {
        /**
         * scheduler starts Runnable Object e.g. velocityCollector and assigns time interval for executed task
         */
        scheduler.scheduleAtFixedRate(velocityCollector, 0, VELOCITY_UPDATE_INTERVAL, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(engineTemperatureCollector, 0, ENGINE_TEMPERATURE_UPDATE_INTERVAL, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(steeringAngleCollector, 0, STEERING_ANGLE_UPDATE_INTERVAL, TimeUnit.SECONDS);
    }
}

package task3.data_collectors;

import task3.telemetry.Engine;
import java.time.LocalTime;

public class EngineTemperatureCollector implements Runnable {

    private Engine engine;

    public EngineTemperatureCollector(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void run() {
        displayTemperature();
    }

    private void displayTemperature() {
        System.out.println("["+ LocalTime.now()+"] engine_temperature: " + engine.getTemperature());
    }
}

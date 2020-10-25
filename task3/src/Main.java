package task3;

/**
 * Car object contains e.g. engine, steering limit switch, speedometer that simulate car in movement.
 * OnBoardComputer schedules tasks. Those tasks collect data to display.
 */

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.ride();
        OnBoardComputer onBoardComputer = new OnBoardComputer(car);
        onBoardComputer.startRoutine();
    }
}

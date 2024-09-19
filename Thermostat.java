public class Thermostat implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Thermostat is increasing temperature.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is decreasing temperature.");
    }

    public void increaseTemperature() {
        System.out.println("Increasing thermostat temperature.");
    }
}

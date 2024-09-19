public class HubApp {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice thermostat = new Thermostat();
        SmartDevice musicPlayer = new MusicPlayer();

        Command turnOnLight = new TurnOnCommand(light);
        Command turnOffLight = new TurnOffCommand(light);

        Command increaseTemperature = new IncreaseTemperatureCommand((Thermostat) thermostat);
        Command decreaseVolume = new DecreaseVolumeCommand((MusicPlayer) musicPlayer);

        RemoteControl remote = new RemoteControl();

        // turn on light
        remote.setCommand(turnOnLight);
        remote.pressButton();

        // turn off light
        remote.setCommand(turnOffLight);
        remote.pressButton();

        // increase thermostat temperature
        remote.setCommand(increaseTemperature);
        remote.pressButton();

        // decrease music player volume
        remote.setCommand(decreaseVolume);
        remote.pressButton();
    }
}

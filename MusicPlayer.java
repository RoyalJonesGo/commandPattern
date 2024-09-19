public class MusicPlayer implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("Music player is now playing.");
    }

    @Override
    public void turnOff() {
        System.out.println("Music player is stopped.");
    }

    public void decreaseVolume() {
        System.out.println("Decreasing music player volume.");
    }
}

public class TestTV {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.setChannel(27);
        tv.setVolume(1);
        tv.volumeUp();
        System.out.println("TV's channel is " + tv.channel + " and volume level is " + tv.volumeLevel);
    }
}

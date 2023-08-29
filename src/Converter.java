public class Converter {
    private int seconds;
    private int hours;
    private int minutes;

    private int remainder;

    public Converter(int seconds) {
        this.seconds = seconds;
        hours = seconds / 3600;
        minutes = (seconds / 60) % 60;
        remainder = seconds - (hours * 3600) - (minutes * 60);
        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, remainder);
        System.out.println(formattedTime);
    }
}

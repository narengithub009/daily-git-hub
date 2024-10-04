public class VideoLengthToSeconds {

    public static int convertMinutesToSeconds(String videoLength) {

        int over = -1;
        String[] split = videoLength.split(":");

        int int1 = Integer.parseInt(split[0]);
        int int2 = Integer.parseInt(split[1]);

        return int2 == 60 ? over : int1 * 60 + int2;

    }

    public static void main(String[] args) {

        String time = "10:60";
        int convertMinutesToSeconds = convertMinutesToSeconds(time);
        System.out.println("The number of seconds are : " + convertMinutesToSeconds);
    }
}

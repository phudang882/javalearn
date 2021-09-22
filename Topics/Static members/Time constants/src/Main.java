class TimeConstantsDemo {

    public static void main(String[] args) {
        // print SECONDS_IN_DAY
        // print SECONDS_IN_WEEK
        final int SECONDS_IN_DAY = TimeConstants.SECONDS_IN_HOUR * 24;
        final int SECONDS_IN_WEEK = (SECONDS_IN_DAY) * 7;
        System.out.println(SECONDS_IN_DAY);
        System.out.println(SECONDS_IN_WEEK);
    }
}

final class TimeConstants {
    public static final int SECOND = 1;
    public static final int SECONDS_IN_MINUTE = 60 * SECOND;
    public static final int SECONDS_IN_HOUR = 60 * SECONDS_IN_MINUTE;
    // write your code here

    private TimeConstants() { }
}

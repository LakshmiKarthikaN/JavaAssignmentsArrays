package algorithmlearning;

public class TimeConversion {
    public static String timeConversion(String s) {
        String period = s.substring(8);
        int hour = Integer.parseInt(s.substring(0,2));
        String minute = s.substring(2,8);
        if(period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        }
            else{
                if(hour!=12){
                    hour=hour +12;
                }
            }

        String hourstr = (hour<10) ? "0"+hour : String.valueOf(hour);
        return hourstr + minute;
    }

    public static void main(String[] args) {
        String s = "07:00:00PM";
        System.out.println(timeConversion(s));
    }
}

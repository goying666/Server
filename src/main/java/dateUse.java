import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateUse {


    public static int CompareTwoStringDate(String beforeDay, String afterDay) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Calendar calendar1 = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar1.setTime(formatter.parse(beforeDay));
            calendar2.setTime(formatter.parse(afterDay));
            return (int) (calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / 86400000;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static JSONObject HowLongToStart(String beforeDayAndTime, String afterDayAndTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Calendar calendar1 = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar1.setTime(formatter.parse(beforeDayAndTime));
            calendar2.setTime(formatter.parse(afterDayAndTime));
            int day = (int) (calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / 1000 / 86400;
            int hour = (int) (calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / 1000 % 86400 / 3600;
            int minute = (int) (calendar2.getTimeInMillis() - calendar1.getTimeInMillis()) / 1000 % 86400 % 3600 / 60;
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("day", day);
            jsonObject.put("hour", hour);
            jsonObject.put("minute", minute);
            return jsonObject;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static JSONObject CompareStringDateAndTimeToNow(String dateString, Integer startHour, Integer startMinute) {
        String hour = "", minute = "";
        if (startHour < 10)
            hour = "0" + startHour.toString();
        else
            hour = startHour.toString();
        if (startMinute < 10)
            minute = "0" + startMinute.toString();
        else
            minute = startMinute.toString();
        return HowLongToStart(GetStringDateNow(), dateString + " " + hour + ":" + minute + ":00");
    }


    public static String getTodayDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(formatter.format(new Date()));
        return formatter.format(new Date());
    }


    /**
     * 获取当前日期是星期几<br>
     *
     * @param dt
     * @return 当前日期是星期几
     */
    public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    public static String getWeekOfDate(String dtstr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return getWeekOfDate(formatter.parse(dtstr));
        } catch (ParseException e) {
            return null;
        }
    }

    public static String DateToString(Date dateValue) {
        if (dateValue != null) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return formatter.format(dateValue);
//            DateFormat mediumDateFormat = DateFormat.getDateTimeInstance
//                    (DateFormat.MEDIUM, DateFormat.MEDIUM);
//            return mediumDateFormat.format(dateValue);
        } else {
            return null;
        }
    }

    public static Date StringToDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date dateret = formatter.parse(dateStr);
            return dateret;
        } catch (ParseException e) {
            System.out.println(e);
        }
        return null;
    }

    public static String GetStringDateNow() {
        return DateToString(new Date());
    }

    //    public static Date GetFormatDateNow(){
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//    }
    /* 功能：比较token创建时间是否超时
     *  参数：默认超过2天不登录就算超时 */
    public static boolean tokenDateCompare(Date date) {
        Calendar calendarToken = Calendar.getInstance();
        Calendar calendarNow = Calendar.getInstance();
        calendarToken.setTime(date);
        calendarNow.setTime(new Date());
        if ((calendarNow.getTimeInMillis() - calendarToken.getTimeInMillis()) / (1000 * 60 * 60 * 24) < 2)
            return true; //没过期
        else
            return false;
    }

    public static Boolean date1AfterDate2(String dateStr1, String dateStr2) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(StringToDate(dateStr1));
        calendar2.setTime(StringToDate(dateStr2));
        if (calendar1.getTimeInMillis() >= calendar2.getTimeInMillis())
            return true; //数据
        else
            return false;
    }

    public static long DateCompareByNow(String beforeTime) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(StringToDate(beforeTime));
        calendar2.setTime(new Date());
        return calendar2.getTimeInMillis() - calendar1.getTimeInMillis();
    }

    public static Long getNowTimeLong() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return calendar.getTimeInMillis();
    }
    public static Long GetStringTimeLong(String timeString){
        Date date = StringToDate(timeString);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getTimeInMillis();
    }

}

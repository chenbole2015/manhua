package com.gn.cartoon.utils;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by FYJ on 2017/12/6.
 */

public class FormatTimeUtil {
   public static String  simple_1="yyyy-MM-dd";
   public static String  simple_2="yyyy年MM日";
   public static String  simple_3="yyyy-MM-dd HH:mm:ss";
   public static String  simple_4="MM-dd HH:mm";
   public static String  simple_5="HH:mm";
   public static String  simple_6="yy/MM/dd";
   public static String  simple_7="yyyy年MM月dd日 HH:mm";
   public static String  simple_8="yyyy-MM-dd HH:mm";
    public static String  simple_9="yyyy/MM/dd";

    public static String formatime(long sec){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(sec*1000);
        Date date = c.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(simple_1);
        String dateString = formatter.format(date);
        return dateString;
    }

    public static String formatime(long sec,String simple_1Arp){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(sec*1000);
        Date date = c.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(simple_1Arp);
        String dateString = formatter.format(date);
        return dateString;
    }

    public static String formatime(){
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat(simple_6);
        String dateString = formatter.format(date);
        return dateString;
    }

    public static long getStrToLong(String str){
        SimpleDateFormat formatter = new SimpleDateFormat(simple_8);
        Date parseTemp;
        try {
             parseTemp = formatter.parse(str);
            return parseTemp.getTime()/1000;
        } catch (ParseException eArp) {
            return new Date().getTime()/1000;
        }
    }

}

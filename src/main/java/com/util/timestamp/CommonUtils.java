package com.util.timestamp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: lizhu
 * @ClassName: CommonUtils
 * @Desciption: Date:2018/12/15
 */
public class CommonUtils {

    public static String time2Stamp(String strTime,String timeStyle) throws DateFormatException{
        try{
            if(timeStyle==null||"".equals(timeStyle.trim())){
                timeStyle = "yyyy-MM-dd HH:mm:ss";
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat(timeStyle);
            Date date = dateFormat.parse(strTime);
            return String.valueOf(date.getTime());
        }catch (Exception e){
            throw new DateFormatException(e,"时间转换失败");
        }
    }

    public static String stamp2Time(String timeStamp,String timeStyle) throws DateFormatException{

        try {
            if(timeStyle==null||"".equals(timeStyle.trim())){
                timeStyle = "yyyy-MM-dd HH:mm:ss";
            }
            Date date = new Date(Long.parseLong(timeStamp));
            SimpleDateFormat dateFormat = new SimpleDateFormat(timeStyle);
            return dateFormat.format(date);
        }catch (Exception e){
            throw  new DateFormatException(e,"时间转换失败");
        }

    }
}

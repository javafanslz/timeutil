package com.util.timestamp;

/**
 * @Author: lizhu
 * @ClassName: DateFormatException
 * @Desciption: Date:2018/12/15
 */
public class DateFormatException extends RuntimeException {

    public DateFormatException(Throwable t,String message){
        super(message,t);
    }
}

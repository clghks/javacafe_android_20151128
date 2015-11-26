package com.clghks.databindingnew;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chihwan on 15. 11. 26..
 */
public class DateUtil {
    public static String getDateFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
        return dateFormat.format(date);
    }
}

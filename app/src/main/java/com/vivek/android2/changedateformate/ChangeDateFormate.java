package com.vivek.android2.changedateformate;

import android.content.Context;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by android2 on 21/1/17.
 */
public class ChangeDateFormate {
    Context context;
    String text_created = "";

    public ChangeDateFormate(Context context, String s) {
        this.context = context;
        text_created = s;
    }

    public String changeDateFormate() {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat outFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a");
        try {
            Date date = inputFormat.parse(text_created);
            text_created = outFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return text_created;
    }
}

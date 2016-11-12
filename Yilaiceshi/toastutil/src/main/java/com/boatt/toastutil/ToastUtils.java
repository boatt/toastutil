package com.boatt.toastutil;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/11/13.
 */
public class ToastUtils {
    public static Toast toast;
    public static void showToast(Activity activity,String text){
        if(toast ==null){
            toast = Toast.makeText(activity, text, Toast.LENGTH_SHORT);
        }else{
            toast.setText(text);
        }
        toast.show();;
    }
}

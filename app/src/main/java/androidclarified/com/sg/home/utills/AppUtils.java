package androidclarified.com.sg.home.utills;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Irshad on 23/12/17.
 */

public class AppUtils {

    public static void logDebug(Class className,String message)
    {
        Log.d(className.getName(),message);
    }

    public static void logError(Class className,String message)
    {
        Log.e(className.getName(),message);
    }

    public static void showShortToast(Context context,String message)
    {
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}

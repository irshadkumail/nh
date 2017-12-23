package androidclarified.com.sg.home.timings;

/**
 * Created by Irshad on 16/12/17.
 */

public interface TimingsContract {

    interface View{




        void fetchTimingsSuccess();

        void fetchTimingFailure();


    }

    interface Actions{

        void fetchTimings();

    }
}

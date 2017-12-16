package androidclarified.com.sg.network;

import java.util.LinkedHashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Irshad on 16/12/17.
 */

public interface TimingsAPIs {


    @GET("timingsByCity")
    Call<LinkedHashMap<String,Object>> getTimingsByCity(@Query("city") String city,@Query("country") String country,@Query("method")String method,@Query("date_or_timestamp") String dateTimeStamp);

    @GET("timings")
    Call<LinkedHashMap<String,Object>> getTimingsByLatLng(@Query("latitude") String latitude,@Query("longitude") String longitude,@Query("method")String method);

    @GET("methods")
    Call<LinkedHashMap<String,Object>> getMethods();

}

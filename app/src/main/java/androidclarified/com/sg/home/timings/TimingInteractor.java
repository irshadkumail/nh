package androidclarified.com.sg.home.timings;

import java.util.LinkedHashMap;

import androidclarified.com.sg.home.utills.AppUtils;
import androidclarified.com.sg.network.RequestBuilder;
import androidclarified.com.sg.network.TimingsAPIs;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Irshad on 16/12/17.
 */

public class TimingInteractor implements TimingsContract.Actions {


    public TimingInteractor(TimingsContract.View view)
    {

    }

    @Override
    public void fetchTimings() {

        TimingsAPIs timingsAPIs= (TimingsAPIs) RequestBuilder.setUpRequest(TimingsAPIs.class);

        Call<LinkedHashMap<String,Object>> call=timingsAPIs.getTimingsByLatLng("17.3850","78.4867","2");

        call.enqueue(new Callback<LinkedHashMap<String, Object>>() {
            @Override
            public void onResponse(Call<LinkedHashMap<String, Object>> call, Response<LinkedHashMap<String, Object>> response) {
                AppUtils.logDebug(this.getClass(),response.body().toString());
            }

            @Override
            public void onFailure(Call<LinkedHashMap<String, Object>> call, Throwable t) {
                AppUtils.logError(t.getClass(),t.getMessage());
            }
        });
    }
}

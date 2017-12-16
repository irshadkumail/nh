package androidclarified.com.sg.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Irshad on 16/12/17.
 */

public class RequestBuilder {

    public static final String BASE_URL="";


    public static Object setUpRequest(Class requestClass)
    {

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

       return retrofit.create(requestClass);
    }


}

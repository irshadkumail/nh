package androidclarified.com.sg.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Irshad on 16/12/17.
 */

public class RequestBuilder {

    public static final String BASE_URL="http://api.aladhan.com";


    public static Object setUpRequest(Class requestClass)
    {

        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();

        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient=new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

       return retrofit.create(requestClass);
    }


}

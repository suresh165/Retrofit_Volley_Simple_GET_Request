package suresh.chandra.retrofit_volley_simple_get_request.Model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import suresh.chandra.retrofit_volley_simple_get_request.Api.Api;

public class RetrofitClient {
    //This Java class is used to send requests to an API.
    // We specify the URL that contains the data required and use the Retrofit Builder class.
    private static RetrofitClient instance = null;
    private Api myApi;

    private RetrofitClient(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        myApi = retrofit.create(Api.class);
    }
    public static synchronized RetrofitClient getInstance(){
        if (instance == null){
            instance = new RetrofitClient();
        }
        return instance;
    }
    public Api getMyApi(){
        return myApi;
    }
}

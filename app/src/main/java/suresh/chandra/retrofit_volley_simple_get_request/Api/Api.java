package suresh.chandra.retrofit_volley_simple_get_request.Api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import suresh.chandra.retrofit_volley_simple_get_request.Model.Result;

public interface Api {
   // public static final String BASE_URL = ;
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    public Call<List<Result>> getsuperHeroes();
}

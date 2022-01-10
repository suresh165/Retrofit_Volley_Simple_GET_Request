package suresh.chandra.retrofit_volley_simple_get_request.Model;

import com.google.gson.annotations.SerializedName;

public class Result {

    @SerializedName("name")
    private String supername;

    public Result(String name) {
        this.supername = name;
    }

    public String getname() {
        return supername;
    }
}

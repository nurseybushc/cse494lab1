package a1203737023.bscs.asu.edu.cse494lab1;

import android.util.Log;

import org.json.JSONObject;

/**
 * Created by apsMac1 on 1/16/16.
 */
public class Movie {

    public String title;
    public String year;
    public String rated;
    public String released;
    public String runtime;
    public String genre;
    public String actors;
    public String plot;

    Movie(String jsonString) {
        try {
            JSONObject jo = new JSONObject(jsonString);
            title = jo.getString("Title");
            year = jo.getString("Year");
            rated = jo.getString("Rated");
            released = jo.getString("Released");
            runtime = jo.getString("Runtime");
            genre = jo.getString("Genre");
            actors = jo.getString("Actors");
            plot = jo.getString("Plot");
        } catch(Exception e) {
            Log.w(this.getClass().getSimpleName(), "error converting to/from json");
        }
    }

    public String toJsonString() {
        String ret  = "";
        try {
            JSONObject jo = new JSONObject();
            jo.put("title", title);
            jo.put("year", year);
            jo.put("rated", rated);
            jo.put("released", released);
            jo.put("runtime", runtime);
            jo.put("genre", genre);
            jo.put("actors", actors);
            jo.put("plot", plot);

            ret = jo.toString();
        } catch (Exception e){
            Log.w(this.getClass().getSimpleName(), "error converting to/from json");
        }
        return ret;
    }
}

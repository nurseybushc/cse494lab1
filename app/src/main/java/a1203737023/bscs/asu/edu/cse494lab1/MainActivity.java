package a1203737023.bscs.asu.edu.cse494lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView jsonTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jsonTV = (TextView)findViewById(R.id.jsonText);
    }

    public void buttonClicked(View v) {
        //Log.w(this.getClass().getSimpleName(), "Ouch");
        String movieJson = "{\"Title\":\"Memento\",\"Year\":\"2000\",\"Rated\":\"R\",\"Released\":\"25 May 2001\",\"Runtime\":\"113 min\",\"Genre\":\"Mystery, Thriller\", \"Actors\":\"Guy Pearce, Carrie-Anne Moss, Joe Pantoliano, Mark Boone Junior\",\"Plot\":\"A man creates a strange system to help him remember things; so he can hunt for the murderer of his wife without his short-term memory loss being an obstacle.\"}";
        Movie m = new Movie(movieJson);
        jsonTV.setText(m.toJsonString());
    }
}
